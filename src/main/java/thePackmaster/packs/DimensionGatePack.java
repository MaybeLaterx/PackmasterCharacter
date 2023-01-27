package thePackmaster.packs;

import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.UIStrings;
import thePackmaster.SpireAnniversary5Mod;
import thePackmaster.cards.dimensiongatepack.*;

import java.util.ArrayList;

public class DimensionGatePack extends AbstractCardPack {
    public static final String ID = SpireAnniversary5Mod.makeID("DimensionGatePack");
    private static final UIStrings UI_STRINGS = CardCrawlGame.languagePack.getUIString(ID);
    public static final String NAME = UI_STRINGS.TEXT[0];
    public static final String DESC = UI_STRINGS.TEXT[1];
    public static final String AUTHOR = UI_STRINGS.TEXT[2];
    public static final String CREDITS = UI_STRINGS.TEXT[3];

    public DimensionGatePack() {
        super(ID, NAME, DESC, AUTHOR);
    }

    @Override
    public ArrayList<String> getCards() {
        ArrayList<String> cards = new ArrayList<>();
        cards.add(ArsenalGear.ID);
        cards.add(Channel.ID);
        cards.add(ConjureBarrage.ID);
        cards.add(Crusher.ID);
        cards.add(Daggerstorm.ID);
        cards.add(FlamePillar.ID);
        cards.add(FlamingGrasp.ID);
        cards.add(Haymaker.ID);
        cards.add(MagicMissile.ID);
        cards.add(ManaShield.ID);
        cards.add(MuscleMemory.ID);
        cards.add(PreservedThorns.ID);
        cards.add(Sting.ID);
        cards.add(WallOfFire.ID);
        return cards;
    }
}
