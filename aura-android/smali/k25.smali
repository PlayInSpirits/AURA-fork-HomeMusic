.class public final synthetic Lk25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Lq25;


# direct methods
.method public synthetic constructor <init>(IILjava/util/List;Lq25;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lk25;->n:I

    .line 5
    .line 6
    iput p2, p0, Lk25;->o:I

    .line 7
    .line 8
    iput-object p3, p0, Lk25;->p:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lk25;->q:Lq25;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget v1, p0, Lk25;->n:I

    .line 9
    .line 10
    iget v2, p0, Lk25;->o:I

    .line 11
    .line 12
    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v3, 0xa

    .line 29
    .line 30
    iget-object v4, p0, Lk25;->p:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v4, v3}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x0

    .line 44
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    add-int/lit8 v6, v4, 0x1

    .line 55
    .line 56
    if-ltz v4, :cond_1

    .line 57
    .line 58
    check-cast v5, Lgn2;

    .line 59
    .line 60
    new-instance v7, Lp25;

    .line 61
    .line 62
    invoke-static {v0, v4}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lp25;

    .line 67
    .line 68
    iget-object v8, p0, Lk25;->q:Lq25;

    .line 69
    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    iget-wide v9, v4, Lp25;->a:J

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    iget-wide v9, v8, Lq25;->N:J

    .line 76
    .line 77
    const-wide/16 v11, 0x1

    .line 78
    .line 79
    add-long/2addr v11, v9

    .line 80
    iput-wide v11, v8, Lq25;->N:J

    .line 81
    .line 82
    :goto_1
    iget-object v4, v8, Lq25;->m:Lif1;

    .line 83
    .line 84
    invoke-interface {v4, v5}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {v7, v9, v10, v5, v4}, Lp25;-><init>(JLgn2;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move v4, v6

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-static {}, Lgb;->c0()V

    .line 99
    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    throw p0

    .line 103
    :cond_2
    invoke-interface {p1, v1, v2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 104
    .line 105
    .line 106
    sget-object p0, Lj15;->a:Lj15;

    .line 107
    .line 108
    return-object p0
.end method
