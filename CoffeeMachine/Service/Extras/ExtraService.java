package Service.Extras;

import Model.Extras.Extra;

public class ExtraService implements IExtraService {
    @Override
    public void addExtra(Extra extra) {
        System.out.println("Adding the Extras : " +extra.toString());
    }
}
