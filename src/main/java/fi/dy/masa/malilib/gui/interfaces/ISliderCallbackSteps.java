package fi.dy.masa.malilib.gui.interfaces;

public interface ISliderCallbackSteps extends ISliderCallback
{
    /**
     * Returns the step size the underlying config value should snap to
     * @return
     */
    double getStepSize();

    /**
     * Sets the step size the underlying config value should snap to
     * @param step
     */
    void setStepSize(double step);
}
