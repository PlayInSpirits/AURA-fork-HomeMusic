.class public final synthetic Lus3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lvs3;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lvs3;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lus3;->n:Lvs3;

    .line 5
    .line 6
    iput p2, p0, Lus3;->o:I

    .line 7
    .line 8
    iput p3, p0, Lus3;->p:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lus3;->n:Lvs3;

    .line 2
    .line 3
    iget-object v0, v0, Lvs3;->a:Lns3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lns3;->c()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lus3;->o:I

    .line 10
    .line 11
    if-ltz v2, :cond_2

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget p0, p0, Lus3;->p:I

    .line 18
    .line 19
    if-gt p0, v3, :cond_2

    .line 20
    .line 21
    if-lt v2, p0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-interface {v1, v2, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    move v2, p0

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-ge v2, v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lcom/eddyizm/tempus/model/Queue;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lcom/eddyizm/tempus/model/Queue;->setTrackOrder(I)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object v2, v0, Lns3;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ls24;

    .line 54
    .line 55
    new-instance v3, Lls3;

    .line 56
    .line 57
    invoke-direct {v3, v0, v1, p0}, Lls3;-><init>(Lns3;Ljava/util/List;I)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    invoke-static {v2, p0, v0, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void
.end method
