.class public final synthetic Le52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/lan/LanReceiverService;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/util/ArrayList;

.field public final synthetic q:I

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/lan/LanReceiverService;Ljava/lang/String;Ljava/util/ArrayList;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le52;->n:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 5
    .line 6
    iput-object p2, p0, Le52;->o:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Le52;->p:Ljava/util/ArrayList;

    .line 9
    .line 10
    iput p4, p0, Le52;->q:I

    .line 11
    .line 12
    iput-wide p5, p0, Le52;->r:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Le52;->n:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 2
    .line 3
    iget-object v1, p0, Le52;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Le52;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget v3, p0, Le52;->q:I

    .line 8
    .line 9
    iget-wide v4, p0, Le52;->r:J

    .line 10
    .line 11
    iget-boolean p0, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    sget-boolean p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 17
    .line 18
    invoke-static {v0}, Lkb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object v1, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Lbl2;

    .line 41
    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0}, Lu0;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lbj2;

    .line 49
    .line 50
    invoke-virtual {p0, v2, v3, v4, v5}, Lsk2;->T(Ljava/util/List;IJ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lsk2;->b()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lsk2;->m0()V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lj15;->a:Lj15;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_0
    const-string p0, "browserFuture"

    .line 63
    .line 64
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v6

    .line 68
    :cond_1
    const-string p0, "Failed requirement."

    .line 69
    .line 70
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v6
.end method
