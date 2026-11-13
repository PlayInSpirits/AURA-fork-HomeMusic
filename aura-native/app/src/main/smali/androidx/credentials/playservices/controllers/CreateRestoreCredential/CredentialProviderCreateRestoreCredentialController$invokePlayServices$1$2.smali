.class final Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1;->invoke(Ldefpackage/rf0;)V
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
.field final synthetic $callback:Ldefpackage/vf0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/vf0;"
        }
    .end annotation
.end field

.field final synthetic $e:Ljava/lang/Exception;

.field final synthetic $executor:Ljava/util/concurrent/Executor;


# direct methods
.method public static synthetic $r8$lambda$C_-AnX8lOpjpLe5K2xibIv16c18(Ldefpackage/vf0;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->invoke$lambda$0(Ldefpackage/vf0;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ldefpackage/vf0;Ljava/lang/Exception;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ldefpackage/vf0;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->$executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->$callback:Ldefpackage/vf0;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->$e:Ljava/lang/Exception;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invoke$lambda$0(Ldefpackage/vf0;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p0, Ldefpackage/wo0;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ldefpackage/wo0;->F(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 17
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->invoke()V

    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    return-object p0
.end method

.method public final invoke()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->$executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->$callback:Ldefpackage/vf0;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->$e:Ljava/lang/Exception;

    .line 6
    .line 7
    new-instance v2, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, v1, p0, v3}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;-><init>(Ldefpackage/vf0;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
