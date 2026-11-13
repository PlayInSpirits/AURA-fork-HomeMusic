.class public abstract Ldefpackage/jw3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ldefpackage/cw3;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(Ldefpackage/cx3;)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/cx3;->j:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/cx3;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/cx3;->b()I

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract a(Ldefpackage/cx3;Ldefpackage/cx3;Ldefpackage/n50;Ldefpackage/n50;)Z
.end method

.method public final c(Ldefpackage/cx3;)V
    .locals 9

    .line 1
    iget-object p0, p0, Ldefpackage/jw3;->a:Ldefpackage/cw3;

    .line 2
    .line 3
    if-eqz p0, :cond_8

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cw3;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Ldefpackage/cx3;->p(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 12
    .line 13
    iget-object v2, p1, Ldefpackage/cx3;->h:Ldefpackage/cx3;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, p1, Ldefpackage/cx3;->i:Ldefpackage/cx3;

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    iput-object v3, p1, Ldefpackage/cx3;->h:Ldefpackage/cx3;

    .line 23
    .line 24
    :cond_0
    iput-object v3, p1, Ldefpackage/cx3;->i:Ldefpackage/cx3;

    .line 25
    .line 26
    iget v2, p1, Ldefpackage/cx3;->j:I

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x10

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->p:Ldefpackage/hm2;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->n0()V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Ldefpackage/ew4;

    .line 40
    .line 41
    iget-object v4, v3, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Ldefpackage/e20;

    .line 44
    .line 45
    iget-object v5, v3, Ldefpackage/ew4;->p:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Ldefpackage/rm2;

    .line 48
    .line 49
    iget v6, v3, Ldefpackage/ew4;->o:I

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    if-ne v6, v0, :cond_3

    .line 53
    .line 54
    iget-object v0, v3, Ldefpackage/ew4;->s:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Landroid/view/View;

    .line 57
    .line 58
    if-ne v0, v1, :cond_2

    .line 59
    .line 60
    :goto_0
    move v0, v7

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const-string p0, "Cannot call removeViewIfHidden within removeView(At) for a different view"

    .line 63
    .line 64
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    const/4 v8, 0x2

    .line 69
    if-eq v6, v8, :cond_7

    .line 70
    .line 71
    :try_start_0
    iput v8, v3, Ldefpackage/ew4;->o:I

    .line 72
    .line 73
    iget-object v6, v5, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    const/4 v8, -0x1

    .line 82
    if-ne v6, v8, :cond_4

    .line 83
    .line 84
    invoke-virtual {v3, v1}, Ldefpackage/ew4;->p(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :goto_1
    iput v7, v3, Ldefpackage/ew4;->o:I

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    :try_start_1
    invoke-virtual {v4, v6}, Ldefpackage/e20;->s(I)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    invoke-virtual {v4, v6}, Ldefpackage/e20;->y(I)Z

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v1}, Ldefpackage/ew4;->p(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v6}, Ldefpackage/rm2;->i(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    iput v7, v3, Ldefpackage/ew4;->o:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_2
    if-eqz v0, :cond_6

    .line 112
    .line 113
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Ldefpackage/cx3;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, Ldefpackage/hm2;->l(Ldefpackage/cx3;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v3}, Ldefpackage/hm2;->i(Ldefpackage/cx3;)V

    .line 121
    .line 122
    .line 123
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 124
    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    new-instance v2, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v3, "after removing animated view: "

    .line 130
    .line 131
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v3, ", "

    .line 138
    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const-string v3, "RecyclerView"

    .line 150
    .line 151
    invoke-static {v3, v2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    :cond_6
    xor-int/lit8 v2, v0, 0x1

    .line 155
    .line 156
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->p0(Z)V

    .line 157
    .line 158
    .line 159
    if-nez v0, :cond_8

    .line 160
    .line 161
    invoke-virtual {p1}, Ldefpackage/cx3;->l()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_8

    .line 166
    .line 167
    invoke-virtual {p0, v1, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :goto_3
    iput v7, v3, Ldefpackage/ew4;->o:I

    .line 172
    .line 173
    throw p0

    .line 174
    :cond_7
    const-string p0, "Cannot call removeViewIfHidden within removeViewIfHidden"

    .line 175
    .line 176
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    :goto_4
    return-void
.end method

.method public abstract d(Ldefpackage/cx3;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()Z
.end method
