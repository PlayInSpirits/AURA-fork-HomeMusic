.class public final Lg62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/net/nsd/NsdManager$DiscoveryListener;


# instance fields
.field public final synthetic a:Lh62;

.field public final synthetic b:J


# direct methods
.method public constructor <init>(Lh62;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg62;->a:Lh62;

    .line 5
    .line 6
    iput-wide p2, p0, Lg62;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onDiscoveryStarted(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDiscoveryStopped(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lg62;->a:Lh62;

    .line 5
    .line 6
    iget-object v0, p1, Lh62;->D0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v1, Lsn1;

    .line 9
    .line 10
    iget-wide v2, p0, Lg62;->b:J

    .line 11
    .line 12
    invoke-direct {v1, p1, v2, v3, p0}, Lsn1;-><init>(Lh62;JLg62;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onServiceFound(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lg62;->a:Lh62;

    .line 5
    .line 6
    iget-object v6, v1, Lh62;->D0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, Le62;

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    iget-wide v2, p0, Lg62;->b:J

    .line 12
    .line 13
    move-object v4, p1

    .line 14
    invoke-direct/range {v0 .. v5}, Le62;-><init>(Lh62;JLandroid/net/nsd/NsdServiceInfo;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onServiceLost(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lg62;->a:Lh62;

    .line 5
    .line 6
    iget-object v6, v1, Lh62;->D0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, Le62;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    iget-wide v2, p0, Lg62;->b:J

    .line 12
    .line 13
    move-object v4, p1

    .line 14
    invoke-direct/range {v0 .. v5}, Le62;-><init>(Lh62;JLandroid/net/nsd/NsdServiceInfo;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onStartDiscoveryFailed(Ljava/lang/String;I)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lg62;->a:Lh62;

    .line 5
    .line 6
    iget-object p2, p1, Lh62;->D0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, Lmm;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    iget-wide v2, p0, Lg62;->b:J

    .line 12
    .line 13
    invoke-direct {v0, p1, v2, v3, v1}, Lmm;-><init>(Ljava/lang/Object;JI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onStopDiscoveryFailed(Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lg62;->a:Lh62;

    .line 5
    .line 6
    iget-object p2, p1, Lh62;->D0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, Lsn1;

    .line 9
    .line 10
    iget-wide v1, p0, Lg62;->b:J

    .line 11
    .line 12
    invoke-direct {v0, p1, v1, v2, p0}, Lsn1;-><init>(Lh62;JLg62;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method
