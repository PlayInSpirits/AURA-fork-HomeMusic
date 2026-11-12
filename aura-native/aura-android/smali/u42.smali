.class public final Lu42;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/net/nsd/NsdManager$ResolveListener;


# instance fields
.field public final synthetic a:Landroid/os/Handler;

.field public final synthetic b:Lfx3;

.field public final synthetic c:Lfx3;

.field public final synthetic d:Lf9;

.field public final synthetic e:Lnc1;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lfx3;Lfx3;Lf9;Lnc1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu42;->a:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p2, p0, Lu42;->b:Lfx3;

    .line 7
    .line 8
    iput-object p3, p0, Lu42;->c:Lfx3;

    .line 9
    .line 10
    iput-object p4, p0, Lu42;->d:Lf9;

    .line 11
    .line 12
    iput-object p5, p0, Lu42;->e:Lnc1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onResolveFailed(Landroid/net/nsd/NsdServiceInfo;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lv6;

    .line 5
    .line 6
    const/16 p2, 0x17

    .line 7
    .line 8
    iget-object v0, p0, Lu42;->b:Lfx3;

    .line 9
    .line 10
    iget-object v1, p0, Lu42;->c:Lfx3;

    .line 11
    .line 12
    iget-object v2, p0, Lu42;->d:Lf9;

    .line 13
    .line 14
    invoke-direct {p1, v0, v1, v2, p2}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lu42;->a:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onServiceResolved(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt6;

    .line 5
    .line 6
    const/16 v5, 0xb

    .line 7
    .line 8
    iget-object v1, p0, Lu42;->c:Lfx3;

    .line 9
    .line 10
    iget-object v2, p0, Lu42;->e:Lnc1;

    .line 11
    .line 12
    iget-object v4, p0, Lu42;->d:Lf9;

    .line 13
    .line 14
    move-object v3, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lu42;->a:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
