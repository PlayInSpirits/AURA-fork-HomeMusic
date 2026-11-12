.class public final synthetic Ls42;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic n:Lfx3;

.field public final synthetic o:Lnc1;

.field public final synthetic p:Lwo1;

.field public final synthetic q:Landroid/net/nsd/NsdManager;

.field public final synthetic r:Lv42;


# direct methods
.method public synthetic constructor <init>(Lfx3;Lnc1;Lwo1;Landroid/net/nsd/NsdManager;Lv42;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls42;->n:Lfx3;

    .line 5
    .line 6
    iput-object p2, p0, Ls42;->o:Lnc1;

    .line 7
    .line 8
    iput-object p3, p0, Ls42;->p:Lwo1;

    .line 9
    .line 10
    iput-object p4, p0, Ls42;->q:Landroid/net/nsd/NsdManager;

    .line 11
    .line 12
    iput-object p5, p0, Ls42;->r:Lv42;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object p1, p0, Ls42;->q:Landroid/net/nsd/NsdManager;

    .line 2
    .line 3
    iget-object v0, p0, Ls42;->r:Lv42;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Ls42;->n:Lfx3;

    .line 7
    .line 8
    iput-boolean v1, v2, Lfx3;->n:Z

    .line 9
    .line 10
    iget-object v1, p0, Ls42;->o:Lnc1;

    .line 11
    .line 12
    iget-object v1, v1, Lk70;->n:Lea2;

    .line 13
    .line 14
    iget-object p0, p0, Ls42;->p:Lwo1;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lea2;->f(Laa2;)V

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
