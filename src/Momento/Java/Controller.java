import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history;// Memento history
    private List<IMemento> undoHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.undoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        clearUndoHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        clearUndoHistory();

        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            undoHistory.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in undo history");
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            history.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    private void clearUndoHistory() {
        undoHistory.clear();
    }


    public List<IMemento> getHistory() {
        return history;
    }

    public void restoreStateByTimestamp(String timestamp) {
        for (IMemento memento : history) {
            if (memento.getTimestamp().equals(timestamp)) {
                model.restoreState(memento);
                break;
            }
        }
    }
}