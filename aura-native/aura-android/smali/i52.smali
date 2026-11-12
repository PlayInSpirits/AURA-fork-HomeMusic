.class public final Li52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/net/nsd/NsdManager$RegistrationListener;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/lan/LanReceiverService;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/lan/LanReceiverService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li52;->a:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onRegistrationFailed(Landroid/net/nsd/NsdServiceInfo;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li52;->a:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 5
    .line 6
    const p1, 0x7f1302bb

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sput-object p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->n:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance p2, Lf52;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {p2, p0, v0}, Lf52;-><init>(Lcom/eddyizm/tempus/lan/LanReceiverService;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onServiceRegistered(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Li52;->a:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->u:Z

    .line 8
    .line 9
    sget-object p1, Lw42;->a:Lw42;

    .line 10
    .line 11
    const-string p1, "Receiver advertised on local network"

    .line 12
    .line 13
    invoke-static {p1}, Lw42;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Li52;->a:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 17
    .line 18
    iget-boolean p1, p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Li52;->a:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 23
    .line 24
    :try_start_0
    iget-object p1, p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->t:Landroid/net/nsd/NsdManager;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/net/nsd/NsdManager;->unregisterService(Landroid/net/nsd/NsdManager$RegistrationListener;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string p0, "nsd"

    .line 33
    .line 34
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :catchall_0
    :cond_1
    return-void
.end method

.method public final onServiceUnregistered(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li52;->a:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->u:Z

    .line 8
    .line 9
    return-void
.end method

.method public final onUnregistrationFailed(Landroid/net/nsd/NsdServiceInfo;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li52;->a:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->u:Z

    .line 8
    .line 9
    return-void
.end method
