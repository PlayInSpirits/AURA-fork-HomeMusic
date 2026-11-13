.class final Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4;->invoke(Ljava/lang/Void;)V
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


# direct methods
.method public static synthetic $r8$lambda$tuDU-TlXEyiRJkMSSJ0jM4geWQ8(Ldefpackage/vf0;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;->invoke$lambda$0(Ldefpackage/vf0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ldefpackage/vf0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ldefpackage/vf0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;->$executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;->$callback:Ldefpackage/vf0;

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

.method private static final invoke$lambda$0(Ldefpackage/vf0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    check-cast p0, Ldefpackage/wo0;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ldefpackage/wo0;->G(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 22
    invoke-virtual {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;->invoke()V

    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    return-object p0
.end method

.method public final invoke()V
    .locals 3

    .line 1
    const-string v0, "PlayServicesImpl"

    .line 2
    .line 3
    const-string v1, "During clear credential, signed out successfully!"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;->$executor:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;->$callback:Ldefpackage/vf0;

    .line 11
    .line 12
    new-instance v1, Landroidx/credentials/playservices/a;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v1, p0, v2}, Landroidx/credentials/playservices/a;-><init>(Ldefpackage/vf0;I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
