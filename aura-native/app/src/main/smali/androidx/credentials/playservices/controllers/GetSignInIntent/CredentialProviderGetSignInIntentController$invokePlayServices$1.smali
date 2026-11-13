.class final Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;->invokePlayServices(Ldefpackage/kh1;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldefpackage/q42;",
        "Ldefpackage/gf1;"
    }
.end annotation


# instance fields
.field final synthetic $e:Ljava/lang/Exception;

.field final synthetic this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;


# direct methods
.method public static synthetic $r8$lambda$Usx8Il6V1sfW4CBgzlPJ6kYPVZY(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;->invoke$lambda$0(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;->this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;->$e:Ljava/lang/Exception;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final invoke$lambda$0(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;->getCallback()Ldefpackage/vf0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/wo0;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/wo0;->F(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 21
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;->invoke()V

    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    return-object p0
.end method

.method public final invoke()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;->this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;->getExecutor()Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;->this$0:Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$invokePlayServices$1;->$e:Ljava/lang/Exception;

    .line 10
    .line 11
    new-instance v2, Landroidx/credentials/playservices/controllers/GetSignInIntent/b;

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-direct {v2, v1, p0, v3}, Landroidx/credentials/playservices/controllers/GetSignInIntent/b;-><init>(Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
