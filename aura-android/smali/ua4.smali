.class public final Lua4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public o:Z

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lua4;->n:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lua4;->q:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Lua4;->p:Ljava/lang/Object;

    .line 22
    iput-boolean p3, p0, Lua4;->o:Z

    return-void
.end method

.method public constructor <init>(Lea2;Lq92;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lua4;->n:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lua4;->p:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, Lua4;->q:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lyf4;Lqi3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lua4;->n:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lua4;->q:Ljava/lang/Object;

    iput-object p2, p0, Lua4;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lua4;->o:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lua4;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lua4;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    iget-object v1, p0, Lua4;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 14
    .line 15
    iget-object v2, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->n:Lo65;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Lo65;->g()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-boolean p0, p0, Lua4;->o:Z

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    iget-object p0, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->o:Lzg5;

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lzg5;->y(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, p0, Lua4;->p:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lqi3;

    .line 46
    .line 47
    iget-object v2, p0, Lua4;->q:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lyf4;

    .line 50
    .line 51
    iget-boolean v3, v2, Lyf4;->g:Z

    .line 52
    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-boolean v3, p0, Lua4;->o:Z

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-interface {v0}, Lqi3;->getDuration()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    invoke-interface {v0}, Lqi3;->M0()J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    const-wide/16 v7, 0x0

    .line 70
    .line 71
    cmp-long v7, v3, v7

    .line 72
    .line 73
    if-lez v7, :cond_4

    .line 74
    .line 75
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v7, v3, v7

    .line 81
    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    sub-long/2addr v3, v5

    .line 85
    const-wide/16 v5, 0x1

    .line 86
    .line 87
    cmp-long v5, v3, v5

    .line 88
    .line 89
    if-ltz v5, :cond_4

    .line 90
    .line 91
    const-wide/16 v5, 0x2710

    .line 92
    .line 93
    cmp-long v3, v3, v5

    .line 94
    .line 95
    if-gtz v3, :cond_4

    .line 96
    .line 97
    iput-boolean v1, p0, Lua4;->o:Z

    .line 98
    .line 99
    new-array p0, v1, [F

    .line 100
    .line 101
    const/high16 v1, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    aput v1, p0, v3

    .line 105
    .line 106
    iput-boolean v3, v2, Lyf4;->c:Z

    .line 107
    .line 108
    new-instance v1, Lpb0;

    .line 109
    .line 110
    const/4 v3, 0x6

    .line 111
    invoke-direct {v1, v2, v0, p0, v3}, Lpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    iget-object p0, v2, Lyf4;->a:Landroid/os/Handler;

    .line 115
    .line 116
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    iget-object v0, v2, Lyf4;->a:Landroid/os/Handler;

    .line 121
    .line 122
    const-wide/16 v1, 0x1f4

    .line 123
    .line 124
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 125
    .line 126
    .line 127
    :goto_1
    return-void

    .line 128
    :pswitch_1
    iget-boolean v0, p0, Lua4;->o:Z

    .line 129
    .line 130
    if-nez v0, :cond_5

    .line 131
    .line 132
    iget-object v0, p0, Lua4;->p:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Lea2;

    .line 135
    .line 136
    iget-object v2, p0, Lua4;->q:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Lq92;

    .line 139
    .line 140
    invoke-virtual {v0, v2}, Lea2;->d(Lq92;)V

    .line 141
    .line 142
    .line 143
    iput-boolean v1, p0, Lua4;->o:Z

    .line 144
    .line 145
    :cond_5
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
