package yajco.example.javalike.model.modifiers;

import java.util.ArrayList;
import java.util.List;

public class Modifiers{
    private List<Modifier> modifiers;

    public Modifiers(Modifier modifier) {
        this.modifiers = new ArrayList<>();
        this.modifiers.add(modifier);
    }

    public Modifiers(
        AccessModifier accessModifier,
        StaticModifier staticModifier,
        FinalModifier finalModifier) {
        this.modifiers = new ArrayList<>();
        this.modifiers.add(accessModifier);
        this.modifiers.add(staticModifier);
        this.modifiers.add(finalModifier);
    }

    public Modifiers(
        StaticModifier staticModifier,
        FinalModifier finalModifier) {
        this.modifiers = new ArrayList<>();
        this.modifiers.add(new DefaultAccessModifier());
        this.modifiers.add(staticModifier);
        this.modifiers.add(finalModifier);
    }

    public List<Modifier> getModifiers() {
        return this.modifiers;
    }
}
