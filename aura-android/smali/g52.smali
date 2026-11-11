.class public final synthetic Lg52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/lan/LanReceiverService;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/lan/LanReceiverService;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lg52;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lg52;->o:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 4
    .line 5
    iput-object p2, p0, Lg52;->p:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lg52;->n:I

    .line 2
    .line 3
    const-string v1, "Failed requirement."

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lg52;->o:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 10
    .line 11
    iget-object p0, p0, Lg52;->p:Ljava/lang/String;

    .line 12
    .line 13
    iget-boolean v3, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    sget-boolean v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 18
    .line 19
    invoke-static {v0}, Lkb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object v0, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    sget-object v2, Lj15;->a:Lj15;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v1}, Lkf2;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-object v2

    .line 48
    :pswitch_0
    iget-object v0, p0, Lg52;->o:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 49
    .line 50
    iget-object p0, p0, Lg52;->p:Ljava/lang/String;

    .line 51
    .line 52
    iget-boolean v3, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    sget-boolean v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 57
    .line 58
    invoke-static {v0}, Lkb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-interface {v3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iget-object v3, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p0, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    iget-object p0, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Lbl2;

    .line 81
    .line 82
    if-eqz p0, :cond_1

    .line 83
    .line 84
    invoke-virtual {p0}, Lu0;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    check-cast p0, Lqi3;

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/lan/LanReceiverService;->f(Lqi3;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const-string p0, "browserFuture"

    .line 99
    .line 100
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v2

    .line 104
    :cond_2
    invoke-static {v1}, Lkf2;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :goto_1
    return-object v2

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
