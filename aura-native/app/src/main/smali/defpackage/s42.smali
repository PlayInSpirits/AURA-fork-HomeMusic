.class public final synthetic Ldefpackage/s42;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic n:Ldefpackage/fx3;

.field public final synthetic o:Ldefpackage/nc1;

.field public final synthetic p:Ldefpackage/wo1;

.field public final synthetic q:Landroid/net/nsd/NsdManager;

.field public final synthetic r:Ldefpackage/v42;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/fx3;Ldefpackage/nc1;Ldefpackage/wo1;Landroid/net/nsd/NsdManager;Ldefpackage/v42;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/s42;->n:Ldefpackage/fx3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/s42;->o:Ldefpackage/nc1;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/s42;->p:Ldefpackage/wo1;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/s42;->q:Landroid/net/nsd/NsdManager;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/s42;->r:Ldefpackage/v42;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object p1, p0, Ldefpackage/s42;->q:Landroid/net/nsd/NsdManager;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/s42;->r:Ldefpackage/v42;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Ldefpackage/s42;->n:Ldefpackage/fx3;

    .line 7
    .line 8
    iput-boolean v1, v2, Ldefpackage/fx3;->n:Z

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/s42;->o:Ldefpackage/nc1;

    .line 11
    .line 12
    iget-object v1, v1, Ldefpackage/k70;->n:Ldefpackage/ea2;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/s42;->p:Ldefpackage/wo1;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/net/nsd/NsdManager;->stopServiceDiscovery(Landroid/net/nsd/NsdManager$DiscoveryListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :catchall_0
    return-void
.end method
