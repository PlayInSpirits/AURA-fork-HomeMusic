.class public final Lv42;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/net/nsd/NsdManager$DiscoveryListener;


# instance fields
.field public final synthetic a:Landroid/os/Handler;

.field public final synthetic b:Lfx3;

.field public final synthetic c:Lf9;

.field public final synthetic d:Ljava/util/LinkedHashMap;

.field public final synthetic e:Landroid/widget/ArrayAdapter;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lfx3;Lf9;Ljava/util/LinkedHashMap;Landroid/widget/ArrayAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv42;->a:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p2, p0, Lv42;->b:Lfx3;

    .line 7
    .line 8
    iput-object p3, p0, Lv42;->c:Lf9;

    .line 9
    .line 10
    iput-object p4, p0, Lv42;->d:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    iput-object p5, p0, Lv42;->e:Landroid/widget/ArrayAdapter;

    .line 13
    .line 14
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
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onServiceFound(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmr;

    .line 5
    .line 6
    const/4 v6, 0x5

    .line 7
    iget-object v1, p0, Lv42;->b:Lfx3;

    .line 8
    .line 9
    iget-object v2, p0, Lv42;->d:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    iget-object v4, p0, Lv42;->e:Landroid/widget/ArrayAdapter;

    .line 12
    .line 13
    iget-object v5, p0, Lv42;->c:Lf9;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    invoke-direct/range {v0 .. v6}, Lmr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lv42;->a:Landroid/os/Handler;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onServiceLost(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt6;

    .line 5
    .line 6
    const/16 v5, 0xc

    .line 7
    .line 8
    iget-object v1, p0, Lv42;->b:Lfx3;

    .line 9
    .line 10
    iget-object v2, p0, Lv42;->d:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    iget-object v4, p0, Lv42;->e:Landroid/widget/ArrayAdapter;

    .line 13
    .line 14
    move-object v3, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lv42;->a:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onStartDiscoveryFailed(Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lws1;

    .line 5
    .line 6
    const/4 p2, 0x7

    .line 7
    iget-object v0, p0, Lv42;->b:Lfx3;

    .line 8
    .line 9
    iget-object v1, p0, Lv42;->c:Lf9;

    .line 10
    .line 11
    invoke-direct {p1, p2, v0, v1}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lv42;->a:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onStopDiscoveryFailed(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
