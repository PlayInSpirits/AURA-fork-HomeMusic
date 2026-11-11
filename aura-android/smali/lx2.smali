.class public final Llx2;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Ldy;

.field public final r:Lze4;

.field public final s:Lom1;

.field public final t:I


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Lze4;Ldy;Lom1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p3, Ldy;->n:Lix2;

    .line 5
    .line 6
    iget-object v1, p3, Ldy;->o:Lix2;

    .line 7
    .line 8
    iget-object v2, p3, Ldy;->q:Lix2;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lix2;->a(Lix2;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-gtz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lix2;->a(Lix2;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-gtz v0, :cond_1

    .line 22
    .line 23
    sget v0, Ljx2;->s:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const v2, 0x7f07054a

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    mul-int/2addr v1, v0

    .line 37
    const v0, 0x101020d

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Lxh2;->q0(Landroid/content/Context;I)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    :goto_0
    add-int/2addr v1, p1

    .line 57
    iput v1, p0, Llx2;->t:I

    .line 58
    .line 59
    iput-object p3, p0, Llx2;->q:Ldy;

    .line 60
    .line 61
    iput-object p2, p0, Llx2;->r:Lze4;

    .line 62
    .line 63
    iput-object p4, p0, Llx2;->s:Lom1;

    .line 64
    .line 65
    const/4 p1, 0x1

    .line 66
    invoke-virtual {p0, p1}, Ldw3;->o(Z)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    const-string p0, "currentPage cannot be after lastPage"

    .line 71
    .line 72
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v3

    .line 76
    :cond_2
    const-string p0, "firstPage cannot be after currentPage"

    .line 77
    .line 78
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v3
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Llx2;->q:Ldy;

    .line 2
    .line 3
    iget p0, p0, Ldy;->t:I

    .line 4
    .line 5
    return p0
.end method

.method public final b(I)J
    .locals 2

    .line 1
    iget-object p0, p0, Llx2;->q:Ldy;

    .line 2
    .line 3
    iget-object p0, p0, Ldy;->n:Lix2;

    .line 4
    .line 5
    iget-object p0, p0, Lix2;->n:Ljava/util/Calendar;

    .line 6
    .line 7
    invoke-static {p0}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-virtual {p0, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x5

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, p1, v1}, Ljava/util/Calendar;->set(II)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x7

    .line 31
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->getMaximum(I)I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    return-wide p0
.end method

.method public final g(Lcx3;I)V
    .locals 7

    .line 1
    check-cast p1, Lkx2;

    .line 2
    .line 3
    iget-object v0, p0, Llx2;->q:Ldy;

    .line 4
    .line 5
    iget-object v1, v0, Ldy;->n:Lix2;

    .line 6
    .line 7
    iget-object v1, v1, Lix2;->n:Ljava/util/Calendar;

    .line 8
    .line 9
    invoke-static {v1}, La35;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-virtual {v1, v2, p2}, Ljava/util/Calendar;->add(II)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lix2;

    .line 18
    .line 19
    invoke-direct {p2, v1}, Lix2;-><init>(Ljava/util/Calendar;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p1, Lkx2;->u:Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {p2}, Lix2;->d()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, Lkx2;->v:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 32
    .line 33
    const v1, 0x7f0a039a

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Ljx2;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Ljx2;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v1, v1, Ljx2;->n:Lix2;

    .line 53
    .line 54
    invoke-virtual {p2, v1}, Lix2;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Ljx2;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iget-object v0, p2, Ljx2;->o:Lze4;

    .line 68
    .line 69
    iget-object v1, p2, Ljx2;->p:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const/4 v3, 0x0

    .line 76
    move v4, v3

    .line 77
    :goto_0
    if-ge v4, v2, :cond_0

    .line 78
    .line 79
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    check-cast v5, Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    invoke-virtual {p2, p1, v5, v6}, Ljx2;->e(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0}, Lze4;->a()Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    :goto_1
    if-ge v3, v2, :cond_1

    .line 106
    .line 107
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    check-cast v4, Ljava/lang/Long;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    invoke-virtual {p2, p1, v4, v5}, Ljx2;->e(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    invoke-virtual {v0}, Lze4;->a()Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, p2, Ljx2;->p:Ljava/util/ArrayList;

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    new-instance v1, Ljx2;

    .line 131
    .line 132
    iget-object v2, p0, Llx2;->r:Lze4;

    .line 133
    .line 134
    invoke-direct {v1, p2, v2, v0}, Ljx2;-><init>(Lix2;Lze4;Ldy;)V

    .line 135
    .line 136
    .line 137
    iget p2, p2, Lix2;->q:I

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    :goto_2
    new-instance p2, Ly8;

    .line 146
    .line 147
    const/4 v0, 0x1

    .line 148
    invoke-direct {p2, v0, p0, p1}, Ly8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 2

    .line 1
    const p2, 0x7f0d00f1

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p1, p2, p1, v0}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const v1, 0x101020d

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, Lxh2;->q0(Landroid/content/Context;I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance p1, Lnw3;

    .line 25
    .line 26
    const/4 v0, -0x1

    .line 27
    iget p0, p0, Llx2;->t:I

    .line 28
    .line 29
    invoke-direct {p1, v0, p0}, Lnw3;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Lkx2;

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    invoke-direct {p0, p2, p1}, Lkx2;-><init>(Landroid/widget/LinearLayout;Z)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    new-instance p0, Lkx2;

    .line 43
    .line 44
    invoke-direct {p0, p2, v0}, Lkx2;-><init>(Landroid/widget/LinearLayout;Z)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method
