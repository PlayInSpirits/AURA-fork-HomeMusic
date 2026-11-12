.class public final Lrq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 28
    iput p2, p0, Lrq;->n:I

    iput-object p3, p0, Lrq;->p:Ljava/lang/Object;

    iput p1, p0, Lrq;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILp75;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lrq;->n:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lrq;->o:I

    .line 27
    iput-object p2, p0, Lrq;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    iput p3, p0, Lrq;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string p3, "initCallbacks cannot be null"

    .line 8
    .line 9
    invoke-static {p1, p3}, Ll93;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lrq;->p:Ljava/lang/Object;

    .line 18
    .line 19
    iput p2, p0, Lrq;->o:I

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lns3;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lrq;->n:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lrq;->o:I

    .line 24
    iput-object p1, p0, Lrq;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Luq;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lrq;->n:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq;->p:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Lrq;->o:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lrq;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lrq;->p:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v3, Lgf5;

    .line 11
    .line 12
    iget p0, p0, Lrq;->o:I

    .line 13
    .line 14
    invoke-virtual {v3, p0}, Lgf5;->f(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    iget p0, p0, Lrq;->o:I

    .line 21
    .line 22
    invoke-virtual {v3, p0}, Landroidx/recyclerview/widget/RecyclerView;->m0(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast v3, Lns3;

    .line 27
    .line 28
    iget-object v0, v3, Lns3;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ls24;

    .line 31
    .line 32
    new-instance v3, Lk52;

    .line 33
    .line 34
    const/16 v4, 0x1c

    .line 35
    .line 36
    invoke-direct {v3, v4}, Lk52;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v2, v1, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, Lrq;->o:I

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    check-cast v3, Lk33;

    .line 53
    .line 54
    iget p0, p0, Lrq;->o:I

    .line 55
    .line 56
    invoke-virtual {v3, p0}, Lk33;->i(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_3
    check-cast v3, Lnh2;

    .line 61
    .line 62
    iget-object v0, v3, Lnh2;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    iget p0, p0, Lrq;->o:I

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->m0(I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_4
    check-cast v3, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget p0, p0, Lrq;->o:I

    .line 77
    .line 78
    if-eq p0, v2, :cond_0

    .line 79
    .line 80
    :goto_0
    if-ge v1, v0, :cond_1

    .line 81
    .line 82
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Lrz0;

    .line 87
    .line 88
    invoke-virtual {p0}, Lrz0;->a()V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    :goto_1
    if-ge v1, v0, :cond_1

    .line 95
    .line 96
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Lrz0;

    .line 101
    .line 102
    invoke-virtual {p0}, Lrz0;->b()V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    return-void

    .line 109
    :pswitch_5
    check-cast v3, Lc05;

    .line 110
    .line 111
    iget p0, p0, Lrq;->o:I

    .line 112
    .line 113
    iget-object v0, v3, Lc05;->n:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lau0;

    .line 116
    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    invoke-virtual {v0, p0}, Lau0;->M(I)V

    .line 120
    .line 121
    .line 122
    :cond_2
    return-void

    .line 123
    :pswitch_6
    check-cast v3, Luq;

    .line 124
    .line 125
    iget-object v0, v3, Luq;->t:Lsq;

    .line 126
    .line 127
    iget p0, p0, Lrq;->o:I

    .line 128
    .line 129
    const/4 v1, 0x4

    .line 130
    invoke-virtual {v0, p0, v1}, Lz41;->x(II)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
