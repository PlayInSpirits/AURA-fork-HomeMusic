.class public final synthetic Lce4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgo4;


# instance fields
.field public final synthetic n:Lqe4;

.field public final synthetic o:Lpe4;

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lqe4;Lpe4;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lce4;->n:Lqe4;

    .line 5
    .line 6
    iput-object p2, p0, Lce4;->o:Lpe4;

    .line 7
    .line 8
    iput-object p3, p0, Lce4;->p:Ljava/util/List;

    .line 9
    .line 10
    iput p4, p0, Lce4;->q:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lce4;->n:Lqe4;

    .line 2
    .line 3
    iget-object v1, v0, Lqe4;->g:Lzt4;

    .line 4
    .line 5
    iget-object v2, v0, Lfq;->b:Lbu4;

    .line 6
    .line 7
    iget-object v3, p0, Lce4;->o:Lpe4;

    .line 8
    .line 9
    invoke-static {v3, v1, v2}, Lqe4;->Z0(Lpe4;Lzt4;Lbu4;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v5, 0x0

    .line 14
    :goto_0
    iget-object v6, p0, Lce4;->p:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    if-ge v5, v7, :cond_0

    .line 21
    .line 22
    iget v7, p0, Lce4;->q:I

    .line 23
    .line 24
    add-int/2addr v7, v5

    .line 25
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    check-cast v6, Lgn2;

    .line 30
    .line 31
    invoke-static {v6}, Lqe4;->e1(Lgn2;)Lhe4;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v4, v7, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p0, v3, Lpe4;->w:Lcu4;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcu4;->p()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_1

    .line 48
    .line 49
    invoke-static {v3, v4, v1, v2}, Lqe4;->j1(Lpe4;Ljava/util/ArrayList;Lzt4;Lbu4;)Lpe4;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    iget v5, v3, Lpe4;->A:I

    .line 55
    .line 56
    iget-object p0, v3, Lpe4;->D:Lne4;

    .line 57
    .line 58
    invoke-interface {p0}, Lne4;->get()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    iget-object v8, v0, Lfq;->b:Lbu4;

    .line 63
    .line 64
    invoke-static/range {v3 .. v8}, Lqe4;->k1(Lpe4;Ljava/util/ArrayList;IJLbu4;)Lpe4;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
