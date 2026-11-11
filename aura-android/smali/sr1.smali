.class public final synthetic Lsr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final synthetic p:Lbi4;


# direct methods
.method public synthetic constructor <init>(Lbi4;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lsr1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsr1;->p:Lbi4;

    .line 8
    .line 9
    iput-object p2, p0, Lsr1;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lcom/eddyizm/tempus/subsonic/models/Child;Lbi4;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lsr1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsr1;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    iput-object p2, p0, Lsr1;->p:Lbi4;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget v0, p0, Lsr1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lsr1;->p:Lbi4;

    .line 4
    .line 5
    iget-object p0, p0, Lsr1;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v0, "hub:"

    .line 32
    .line 33
    invoke-static {p0, v0}, Lqm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    new-instance v2, Lws1;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    invoke-direct {v2, v3, p0, p1}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lbi4;->run()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_0
    sget-object v0, Lur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lur1;->a(Landroid/content/Context;)Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v1}, Lbi4;->run()V

    .line 63
    .line 64
    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    invoke-static {p1, p0}, Lur1;->c(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
