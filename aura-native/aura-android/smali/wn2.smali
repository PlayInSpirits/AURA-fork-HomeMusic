.class public final synthetic Lwn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbj2;

.field public final synthetic p:Ljava/util/ArrayList;

.field public final synthetic q:I

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lbj2;Ljava/util/ArrayList;IJI)V
    .locals 0

    .line 1
    iput p6, p0, Lwn2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lwn2;->o:Lbj2;

    .line 4
    .line 5
    iput-object p2, p0, Lwn2;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput p3, p0, Lwn2;->q:I

    .line 8
    .line 9
    iput-wide p4, p0, Lwn2;->r:J

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lwn2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-wide v2, p0, Lwn2;->r:J

    .line 5
    .line 6
    iget v4, p0, Lwn2;->q:I

    .line 7
    .line 8
    iget-object v5, p0, Lwn2;->p:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object p0, p0, Lwn2;->o:Lbj2;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lu52;->c()Lv52;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-boolean v0, v0, Lv52;->a:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v0, Lbo2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v5, v4, v2, v3}, Lsk2;->T(Ljava/util/List;IJ)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lsk2;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lzn2;

    .line 36
    .line 37
    invoke-direct {v0, p0, v4, v2, v3}, Lzn2;-><init>(Lbj2;IJ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lsk2;->v(Loi3;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_0
    invoke-static {}, Lu52;->c()Lv52;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-boolean v0, v0, Lv52;->a:Z

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_1
    invoke-virtual {p0}, Lsk2;->Q0()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-lez v0, :cond_2

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_2
    invoke-virtual {p0}, Lsk2;->r()V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lsk2;->d:Lrk2;

    .line 64
    .line 65
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 66
    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    move v7, v6

    .line 70
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-ge v7, v8, :cond_4

    .line 75
    .line 76
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    if-eqz v8, :cond_3

    .line 81
    .line 82
    move v8, v1

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move v8, v6

    .line 85
    :goto_2
    const-string v9, "items must not contain null, index=%s"

    .line 86
    .line 87
    invoke-static {v7, v9, v8}, Lrr2;->j(ILjava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v7, v7, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    invoke-interface {v0}, Lrk2;->Y()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_5

    .line 98
    .line 99
    const-string v0, "MediaController"

    .line 100
    .line 101
    const-string v1, "The controller is not connected. Ignoring setMediaItems()."

    .line 102
    .line 103
    invoke-static {v0, v1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    invoke-interface {v0, v5}, Lrk2;->L0(Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-virtual {p0, v4, v2, v3}, Lsk2;->n(IJ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lsk2;->b()V

    .line 114
    .line 115
    .line 116
    :goto_4
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
