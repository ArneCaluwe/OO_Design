package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface App extends Remote {
    void run();

    void createLandscape() throws RemoteException;
    void flush() throws RemoteException;
    void makeFish() throws RemoteException;
    void Swim() throws RemoteException;
}
