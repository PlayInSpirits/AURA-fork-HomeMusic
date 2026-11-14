package aura.build;

import java.io.File;

/** Command-line entry point for the build helpers (invoked from app/build.gradle via JavaExec). */
public final class Main {
    private Main() {}

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            throw new IllegalArgumentException("usage: smali|apijar|inject ...");
        }
        switch (args[0]) {
            case "smali":
                SmaliAssembler.assemble(new File(args[1]), new File(args[2]), Integer.parseInt(args[3]));
                break;
            case "apijar":
                ApiJar.make(new File(args[1]), new File(args[2]), new File(args[3]));
                break;
            case "inject":
                String name = DexInjector.inject(new File(args[1]), new File(args[2]), new File(args[3]));
                System.out.println("Injected prebuilt dex as " + name + " -> " + args[3]);
                break;
            default:
                throw new IllegalArgumentException("unknown command " + args[0]);
        }
    }
}
