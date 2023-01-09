package thePackmaster.cards.transmutationpack;

import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import thePackmaster.cards.AbstractPackmasterCard;
import thePackmaster.powers.transmutationpack.CrystalResonancePower;

import static thePackmaster.SpireAnniversary5Mod.makeID;
import static thePackmaster.util.Wiz.*;

public class CrystalResonance extends AbstractHydrologistCard {
    public final static String ID = makeID("CrystalResonance");
    // intellij stuff POWER, NONE, UNCOMMON, , , , , , 

    public CrystalResonance() {
        super(ID, 2, CardType.POWER, CardRarity.UNCOMMON, CardTarget.NONE, Subtype.ICE);
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        addToBot(new ApplyPowerAction(p, p, new CrystalResonancePower(p)));
    }

    public void upp() {
        upgradeBaseCost(1);
    }
}