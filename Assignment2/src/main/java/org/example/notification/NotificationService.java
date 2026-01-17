package org.example.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationService {
    private final List<Observer> observers;

    public void notifyObservers(String message) {
        log.info("Notifying {} observer(s): {}", observers.size(), message);
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
