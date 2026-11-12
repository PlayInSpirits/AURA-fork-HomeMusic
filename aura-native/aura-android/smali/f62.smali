.class public final Lf62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/net/nsd/NsdManager$ResolveListener;


# instance fields
.field public final synthetic a:Lh62;

.field public final synthetic b:J

.field public final synthetic c:Landroid/net/nsd/NsdServiceInfo;


# direct methods
.method public constructor <init>(Lh62;JLandroid/net/nsd/NsdServiceInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf62;->a:Lh62;

    .line 5
    .line 6
    iput-wide p2, p0, Lf62;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lf62;->c:Landroid/net/nsd/NsdServiceInfo;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onResolveFailed(Landroid/net/nsd/NsdServiceInfo;I)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lf62;->a:Lh62;

    .line 5
    .line 6
    iget-object p1, v1, Lh62;->D0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, Le62;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-wide v2, p0, Lf62;->b:J

    .line 12
    .line 13
    iget-object v4, p0, Lf62;->c:Landroid/net/nsd/NsdServiceInfo;

    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Le62;-><init>(Lh62;JLandroid/net/nsd/NsdServiceInfo;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onServiceResolved(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lf62;->a:Lh62;

    .line 5
    .line 6
    iget-object v6, v1, Lh62;->D0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, Le62;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-wide v2, p0, Lf62;->b:J

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
