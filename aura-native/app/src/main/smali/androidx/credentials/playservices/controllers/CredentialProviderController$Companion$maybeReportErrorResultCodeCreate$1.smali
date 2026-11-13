.class final Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;->maybeReportErrorResultCodeCreate(ILdefpackage/wf1;Ldefpackage/if1;Landroid/os/CancellationSignal;)Z
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
.field final synthetic $exception:Ldefpackage/jx3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/jx3;"
        }
    .end annotation
.end field

.field final synthetic $onError:Ldefpackage/if1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/if1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldefpackage/if1;Ldefpackage/jx3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/if1;",
            "Ldefpackage/jx3;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$onError:Ldefpackage/if1;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$exception:Ldefpackage/jx3;

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


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 11
    invoke-virtual {p0}, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->invoke()V

    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$onError:Ldefpackage/if1;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1;->$exception:Ldefpackage/jx3;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method
