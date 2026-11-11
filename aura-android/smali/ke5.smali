.class public final Lke5;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lnh2;


# direct methods
.method public constructor <init>(Lnh2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lke5;->q:Lnh2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lke5;->q:Lnh2;

    .line 2
    .line 3
    iget-object p0, p0, Lnh2;->o0:Ldy;

    .line 4
    .line 5
    iget p0, p0, Ldy;->s:I

    .line 6
    .line 7
    return p0
.end method

.method public final g(Lcx3;I)V
    .locals 9

    .line 1
    check-cast p1, Lje5;

    .line 2
    .line 3
    iget-object v0, p0, Lke5;->q:Lnh2;

    .line 4
    .line 5
    iget-object v1, v0, Lnh2;->o0:Ldy;

    .line 6
    .line 7
    iget-object v1, v1, Ldy;->n:Lix2;

    .line 8
    .line 9
    iget v1, v1, Lix2;->p:I

    .line 10
    .line 11
    add-int/2addr v1, p2

    .line 12
    iget-object p1, p1, Lje5;->u:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "%d"

    .line 27
    .line 28
    invoke-static {p2, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {}, La35;->d()Ljava/util/Calendar;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ne v2, v1, :cond_0

    .line 49
    .line 50
    const v2, 0x7f130393

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {p2, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const v2, 0x7f130394

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {p2, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    iget-object p2, v0, Lnh2;->r0:Ley;

    .line 93
    .line 94
    invoke-static {}, La35;->d()Ljava/util/Calendar;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-ne v4, v1, :cond_1

    .line 103
    .line 104
    iget-object v4, p2, Ley;->f:Ljava/lang/Object;

    .line 105
    .line 106
    :goto_1
    check-cast v4, Lc6;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    iget-object v4, p2, Ley;->d:Ljava/lang/Object;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :goto_2
    iget-object v0, v0, Lnh2;->n0:Lze4;

    .line 113
    .line 114
    invoke-virtual {v0}, Lze4;->a()Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/4 v6, 0x0

    .line 123
    :cond_2
    :goto_3
    if-ge v6, v5, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    add-int/lit8 v6, v6, 0x1

    .line 130
    .line 131
    check-cast v7, Ljava/lang/Long;

    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v7

    .line 137
    invoke-virtual {v2, v7, v8}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-ne v7, v1, :cond_2

    .line 145
    .line 146
    iget-object v4, p2, Ley;->e:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v4, Lc6;

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_3
    invoke-virtual {v4, p1}, Lc6;->A(Landroid/widget/TextView;)V

    .line 152
    .line 153
    .line 154
    new-instance p2, Lie5;

    .line 155
    .line 156
    invoke-direct {p2, p0, v1}, Lie5;-><init>(Lke5;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 0

    .line 1
    const p0, 0x7f0d00f5

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    invoke-static {p1, p0, p1, p2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/widget/TextView;

    .line 10
    .line 11
    new-instance p1, Lje5;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lje5;-><init>(Landroid/widget/TextView;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method
