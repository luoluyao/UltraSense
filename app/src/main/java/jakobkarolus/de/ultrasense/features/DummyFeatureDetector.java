package jakobkarolus.de.ultrasense.features;

/**
 * <br><br>
 * Created by Jakob on 24.07.2015.
 */
public class DummyFeatureDetector extends FeatureDetector{

    public DummyFeatureDetector(double timeIncreasePerStep) {
        super(timeIncreasePerStep);
    }

    @Override
    public void checkForFeatures(double[] audioBuffer, boolean applyHighPass) {
        //do nothing

    }

    @Override
    public String printParameters() {
        return "FD paras: Dummy";
    }
}