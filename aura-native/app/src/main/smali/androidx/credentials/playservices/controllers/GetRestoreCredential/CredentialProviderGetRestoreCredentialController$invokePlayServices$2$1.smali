.class final Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController;->invokePlayServices(Ldefpackage/kh1;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
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

.field final synthetic $executor:Ljava/util/concurrent/Executor;

.field final synthetic $getException:Ldefpackage/jx3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/jx3;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$Tph1liBZGG4csyUNhnG2bNv8-i8(Ldefpackage/vf0;Ldefpackage/jx3;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->invoke$lambda$0(Ldefpackage/vf0;Ldefpackage/jx3;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ldefpackage/vf0;Ldefpackage/jx3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ldefpackage/vf0;",
            "Ldefpackage/jx3;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->$executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->$callback:Ldefpackage/vf0;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->$getException:Ldefpackage/jx3;

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

.method private static final invoke$lambda$0(Ldefpackage/vf0;Ldefpackage/jx3;)V
    .locals 0

    .line 1
    iget-object p1, p1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/wo0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/wo0;->F(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 17
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->invoke()V

    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    return-object p0
.end method

.method public final invoke()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->$executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->$callback:Ldefpackage/vf0;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->$getException:Ldefpackage/jx3;

    .line 6
    .line 7
    new-instance v2, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    invoke-direct {v2, v3, v1, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
