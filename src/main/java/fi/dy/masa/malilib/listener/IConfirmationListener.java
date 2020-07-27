package fi.dy.masa.malilib.listener;

public interface IConfirmationListener
{
    /**
     * Called when a task requiring confirmation is confirmed by the user
     * @return
     */
    boolean onActionConfirmed();

    /**
     * Called when a task requiring confirmation is cancelled by the user
     * @return
     */
    boolean onActionCancelled();
}
