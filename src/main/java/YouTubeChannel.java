import java.util.ArrayList;
import java.util.List;

class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer observer : subscribers) {
            observer.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("New video uploaded: " + videoTitle);

        notifyObservers(videoTitle);
    }
}