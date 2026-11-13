.class public final Landroidx/viewpager2/widget/ViewPager2;
.super Landroid/view/ViewGroup;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:Ldefpackage/zg5;

.field public B:Ldefpackage/bc3;

.field public C:Ldefpackage/jw3;

.field public D:Z

.field public E:Z

.field public F:I

.field public G:Ldefpackage/ss0;

.field public final n:Landroid/graphics/Rect;

.field public final o:Landroid/graphics/Rect;

.field public final p:Ldefpackage/q80;

.field public q:I

.field public r:Z

.field public final s:Ldefpackage/i75;

.field public t:Ldefpackage/l75;

.field public u:I

.field public v:Landroid/os/Parcelable;

.field public w:Ldefpackage/p75;

.field public x:Ldefpackage/o75;

.field public y:Ldefpackage/l64;

.field public z:Ldefpackage/q80;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->n:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->o:Landroid/graphics/Rect;

    .line 17
    .line 18
    new-instance v0, Ldefpackage/q80;

    .line 19
    .line 20
    invoke-direct {v0}, Ldefpackage/q80;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->p:Ldefpackage/q80;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 27
    .line 28
    new-instance v1, Ldefpackage/i75;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, v2, p0}, Ldefpackage/i75;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->s:Ldefpackage/i75;

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->C:Ldefpackage/jw3;

    .line 41
    .line 42
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->D:Z

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 46
    .line 47
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->F:I

    .line 48
    .line 49
    invoke-virtual {p0, p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 53
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->n:Landroid/graphics/Rect;

    .line 55
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->o:Landroid/graphics/Rect;

    .line 56
    new-instance v0, Ldefpackage/q80;

    invoke-direct {v0}, Ldefpackage/q80;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->p:Ldefpackage/q80;

    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 58
    new-instance v1, Ldefpackage/i75;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ldefpackage/i75;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->s:Ldefpackage/i75;

    const/4 v1, -0x1

    .line 59
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    const/4 v2, 0x0

    .line 60
    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->C:Ldefpackage/jw3;

    .line 61
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->D:Z

    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 63
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->F:I

    .line 64
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 65
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->n:Landroid/graphics/Rect;

    .line 67
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->o:Landroid/graphics/Rect;

    .line 68
    new-instance p3, Ldefpackage/q80;

    invoke-direct {p3}, Ldefpackage/q80;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->p:Ldefpackage/q80;

    const/4 p3, 0x0

    .line 69
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 70
    new-instance v0, Ldefpackage/i75;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ldefpackage/i75;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->s:Ldefpackage/i75;

    const/4 v0, -0x1

    .line 71
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    const/4 v1, 0x0

    .line 72
    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->C:Ldefpackage/jw3;

    .line 73
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->D:Z

    const/4 p3, 0x1

    .line 74
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 75
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->F:I

    .line 76
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .line 77
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 78
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->n:Landroid/graphics/Rect;

    .line 79
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->o:Landroid/graphics/Rect;

    .line 80
    new-instance p3, Ldefpackage/q80;

    invoke-direct {p3}, Ldefpackage/q80;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->p:Ldefpackage/q80;

    const/4 p3, 0x0

    .line 81
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 82
    new-instance p4, Ldefpackage/i75;

    const/4 v0, 0x0

    invoke-direct {p4, v0, p0}, Ldefpackage/i75;-><init>(ILjava/lang/Object;)V

    iput-object p4, p0, Landroidx/viewpager2/widget/ViewPager2;->s:Ldefpackage/i75;

    const/4 p4, -0x1

    .line 83
    iput p4, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->C:Ldefpackage/jw3;

    .line 85
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->D:Z

    const/4 p3, 0x1

    .line 86
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 87
    iput p4, p0, Landroidx/viewpager2/widget/ViewPager2;->F:I

    .line 88
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 10

    .line 1
    new-instance v0, Ldefpackage/ss0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v1, Ldefpackage/rm2;

    .line 9
    .line 10
    const/16 v2, 0x1d

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, Ldefpackage/rm2;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v1, Ldefpackage/h45;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {v1, v2, v0}, Ldefpackage/h45;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 26
    .line 27
    new-instance v0, Ldefpackage/p75;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, Ldefpackage/p75;-><init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 33
    .line 34
    sget-object v1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 44
    .line 45
    const/high16 v1, 0x20000

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Ldefpackage/l75;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Ldefpackage/l75;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->t:Ldefpackage/l75;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollingTouchSlop(I)V

    .line 66
    .line 67
    .line 68
    sget-object v5, Ldefpackage/et3;->a:[I

    .line 69
    .line 70
    invoke-virtual {p1, p2, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    move-object v3, p0

    .line 77
    move-object v4, p1

    .line 78
    move-object v6, p2

    .line 79
    invoke-static/range {v3 .. v9}, Ldefpackage/j65;->n(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    :try_start_0
    invoke-virtual {v7, p0, p0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {v3, p1}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 91
    .line 92
    .line 93
    iget-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 94
    .line 95
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 96
    .line 97
    const/4 v0, -0x1

    .line 98
    invoke-direct {p2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 105
    .line 106
    new-instance p2, Ldefpackage/k75;

    .line 107
    .line 108
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->P:Ljava/util/ArrayList;

    .line 112
    .line 113
    if-nez v0, :cond_0

    .line 114
    .line 115
    new-instance v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->P:Ljava/util/ArrayList;

    .line 121
    .line 122
    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->P:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    new-instance p1, Ldefpackage/l64;

    .line 128
    .line 129
    invoke-direct {p1, v3}, Ldefpackage/l64;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 130
    .line 131
    .line 132
    iput-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->y:Ldefpackage/l64;

    .line 133
    .line 134
    new-instance p2, Ldefpackage/zg5;

    .line 135
    .line 136
    invoke-direct {p2, p1}, Ldefpackage/zg5;-><init>(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iput-object p2, v3, Landroidx/viewpager2/widget/ViewPager2;->A:Ldefpackage/zg5;

    .line 140
    .line 141
    new-instance p1, Ldefpackage/o75;

    .line 142
    .line 143
    invoke-direct {p1, v3}, Ldefpackage/o75;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 144
    .line 145
    .line 146
    iput-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->x:Ldefpackage/o75;

    .line 147
    .line 148
    iget-object p2, v3, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Ldefpackage/xg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 154
    .line 155
    iget-object p2, v3, Landroidx/viewpager2/widget/ViewPager2;->y:Ldefpackage/l64;

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->j(Ldefpackage/rw3;)V

    .line 158
    .line 159
    .line 160
    new-instance p1, Ldefpackage/q80;

    .line 161
    .line 162
    invoke-direct {p1}, Ldefpackage/q80;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->z:Ldefpackage/q80;

    .line 166
    .line 167
    iget-object p2, v3, Landroidx/viewpager2/widget/ViewPager2;->y:Ldefpackage/l64;

    .line 168
    .line 169
    iput-object p1, p2, Ldefpackage/l64;->a:Ldefpackage/q80;

    .line 170
    .line 171
    new-instance p2, Ldefpackage/j75;

    .line 172
    .line 173
    invoke-direct {p2, v3, p0}, Ldefpackage/j75;-><init>(Landroidx/viewpager2/widget/ViewPager2;I)V

    .line 174
    .line 175
    .line 176
    new-instance v0, Ldefpackage/j75;

    .line 177
    .line 178
    invoke-direct {v0, v3, v1}, Ldefpackage/j75;-><init>(Landroidx/viewpager2/widget/ViewPager2;I)V

    .line 179
    .line 180
    .line 181
    iget-object p1, p1, Ldefpackage/q80;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p1, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    iget-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->z:Ldefpackage/q80;

    .line 189
    .line 190
    iget-object p1, p1, Ldefpackage/q80;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p1, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    iget-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 198
    .line 199
    iget-object p2, v3, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 205
    .line 206
    .line 207
    new-instance p2, Ldefpackage/i75;

    .line 208
    .line 209
    invoke-direct {p2, v1, p1}, Ldefpackage/i75;-><init>(ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iput-object p2, p1, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 213
    .line 214
    iget-object p1, p1, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 217
    .line 218
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    if-nez p2, :cond_1

    .line 223
    .line 224
    invoke-virtual {p1, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 225
    .line 226
    .line 227
    :cond_1
    iget-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->z:Ldefpackage/q80;

    .line 228
    .line 229
    iget-object p1, p1, Ldefpackage/q80;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p1, Ljava/util/ArrayList;

    .line 232
    .line 233
    iget-object p2, v3, Landroidx/viewpager2/widget/ViewPager2;->p:Ldefpackage/q80;

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    new-instance p1, Ldefpackage/bc3;

    .line 239
    .line 240
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 241
    .line 242
    .line 243
    iput-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->B:Ldefpackage/bc3;

    .line 244
    .line 245
    iget-object p2, v3, Landroidx/viewpager2/widget/ViewPager2;->z:Ldefpackage/q80;

    .line 246
    .line 247
    iget-object p2, p2, Ldefpackage/q80;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p2, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    iget-object p1, v3, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 255
    .line 256
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    invoke-virtual {v3, p1, p0, p2}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :catchall_0
    move-exception v0

    .line 265
    move-object p0, v0

    .line 266
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 267
    .line 268
    .line 269
    throw p0
.end method

.method public final b()V
    .locals 15

    .line 1
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :goto_0
    return-void

    .line 14
    :cond_1
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->v:Landroid/os/Parcelable;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v2, :cond_b

    .line 18
    .line 19
    instance-of v4, v0, Ldefpackage/ee1;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v4, :cond_a

    .line 23
    .line 24
    move-object v4, v0

    .line 25
    check-cast v4, Ldefpackage/ee1;

    .line 26
    .line 27
    iget-object v6, v4, Ldefpackage/ee1;->s:Ldefpackage/xe2;

    .line 28
    .line 29
    iget-object v7, v4, Ldefpackage/ee1;->t:Ldefpackage/xe2;

    .line 30
    .line 31
    invoke-virtual {v7}, Ldefpackage/xe2;->d()Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_9

    .line 36
    .line 37
    invoke-virtual {v6}, Ldefpackage/xe2;->d()Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_9

    .line 42
    .line 43
    check-cast v2, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/os/Bundle;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    if-nez v8, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const/4 v10, 0x2

    .line 75
    if-eqz v9, :cond_8

    .line 76
    .line 77
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    check-cast v9, Ljava/lang/String;

    .line 82
    .line 83
    const-string v11, "f#"

    .line 84
    .line 85
    invoke-virtual {v9, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    if-eqz v11, :cond_6

    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-le v11, v10, :cond_6

    .line 96
    .line 97
    invoke-virtual {v9, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v10

    .line 105
    iget-object v12, v4, Ldefpackage/ee1;->r:Ldefpackage/ld1;

    .line 106
    .line 107
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    if-nez v13, :cond_4

    .line 115
    .line 116
    move-object v14, v5

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    iget-object v14, v12, Ldefpackage/ld1;->c:Ldefpackage/ss0;

    .line 119
    .line 120
    invoke-virtual {v14, v13}, Ldefpackage/ss0;->t(Ljava/lang/String;)Ldefpackage/kc1;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    if-eqz v14, :cond_5

    .line 125
    .line 126
    :goto_2
    invoke-virtual {v6, v10, v11, v14}, Ldefpackage/xe2;->f(JLjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, "Fragment no longer exists for key "

    .line 135
    .line 136
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, ": unique id "

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, p0}, Ldefpackage/ld1;->g0(Ljava/lang/RuntimeException;)V

    .line 158
    .line 159
    .line 160
    throw v5

    .line 161
    :cond_6
    const-string v11, "s#"

    .line 162
    .line 163
    invoke-virtual {v9, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    if-eqz v11, :cond_7

    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    if-le v11, v10, :cond_7

    .line 174
    .line 175
    invoke-virtual {v9, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 180
    .line 181
    .line 182
    move-result-wide v10

    .line 183
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    check-cast v9, Ldefpackage/jc1;

    .line 188
    .line 189
    invoke-virtual {v4, v10, v11}, Ldefpackage/ee1;->q(J)Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    if-eqz v12, :cond_3

    .line 194
    .line 195
    invoke-virtual {v7, v10, v11, v9}, Ldefpackage/xe2;->f(JLjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :cond_7
    const-string p0, "Unexpected key in savedState: "

    .line 201
    .line 202
    invoke-virtual {p0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_8
    invoke-virtual {v6}, Ldefpackage/xe2;->d()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-nez v2, :cond_a

    .line 215
    .line 216
    iput-boolean v3, v4, Ldefpackage/ee1;->y:Z

    .line 217
    .line 218
    iput-boolean v3, v4, Ldefpackage/ee1;->x:Z

    .line 219
    .line 220
    invoke-virtual {v4}, Ldefpackage/ee1;->s()V

    .line 221
    .line 222
    .line 223
    new-instance v2, Landroid/os/Handler;

    .line 224
    .line 225
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-direct {v2, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 230
    .line 231
    .line 232
    new-instance v6, Ldefpackage/g5;

    .line 233
    .line 234
    const/16 v7, 0xe

    .line 235
    .line 236
    invoke-direct {v6, v7, v4}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-object v4, v4, Ldefpackage/ee1;->q:Ldefpackage/ea2;

    .line 240
    .line 241
    new-instance v7, Ldefpackage/tl0;

    .line 242
    .line 243
    invoke-direct {v7, v10, v2, v6}, Ldefpackage/tl0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v7}, Ldefpackage/ea2;->a(Ldefpackage/aa2;)V

    .line 247
    .line 248
    .line 249
    const-wide/16 v7, 0x2710

    .line 250
    .line 251
    invoke-virtual {v2, v6, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_9
    const-string p0, "Expected the adapter to be \'fresh\' while restoring state."

    .line 256
    .line 257
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_a
    :goto_3
    iput-object v5, p0, Landroidx/viewpager2/widget/ViewPager2;->v:Landroid/os/Parcelable;

    .line 262
    .line 263
    :cond_b
    iget v2, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 264
    .line 265
    invoke-virtual {v0}, Ldefpackage/dw3;->a()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    sub-int/2addr v0, v3

    .line 270
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    const/4 v2, 0x0

    .line 275
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 280
    .line 281
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 282
    .line 283
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 284
    .line 285
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 286
    .line 287
    .line 288
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 289
    .line 290
    invoke-virtual {p0}, Ldefpackage/ss0;->H()V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method public final c(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->A:Ldefpackage/zg5;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final canScrollVertically(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d(IZ)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget p2, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    if-eq p2, v0, :cond_3

    .line 12
    .line 13
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Ldefpackage/dw3;->a()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-gtz v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {v0}, Ldefpackage/dw3;->a()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x1

    .line 36
    sub-int/2addr v0, v2

    .line 37
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 42
    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    iget-object v3, p0, Landroidx/viewpager2/widget/ViewPager2;->y:Ldefpackage/l64;

    .line 46
    .line 47
    iget v3, v3, Ldefpackage/l64;->f:I

    .line 48
    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    if-ne p1, v0, :cond_4

    .line 53
    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    :cond_3
    :goto_0
    return-void

    .line 57
    :cond_4
    int-to-double v3, v0

    .line 58
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 59
    .line 60
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 61
    .line 62
    invoke-virtual {v0}, Ldefpackage/ss0;->H()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->y:Ldefpackage/l64;

    .line 66
    .line 67
    iget v5, v0, Ldefpackage/l64;->f:I

    .line 68
    .line 69
    if-nez v5, :cond_5

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    invoke-virtual {v0}, Ldefpackage/l64;->e()V

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, Ldefpackage/l64;->g:Ldefpackage/k64;

    .line 76
    .line 77
    iget v3, v0, Ldefpackage/k64;->b:I

    .line 78
    .line 79
    int-to-double v3, v3

    .line 80
    iget v0, v0, Ldefpackage/k64;->a:F

    .line 81
    .line 82
    float-to-double v5, v0

    .line 83
    add-double/2addr v3, v5

    .line 84
    :goto_1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->y:Ldefpackage/l64;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/4 v5, 0x2

    .line 90
    if-eqz p2, :cond_6

    .line 91
    .line 92
    move v6, v5

    .line 93
    goto :goto_2

    .line 94
    :cond_6
    const/4 v6, 0x3

    .line 95
    :goto_2
    iput v6, v0, Ldefpackage/l64;->e:I

    .line 96
    .line 97
    iget v6, v0, Ldefpackage/l64;->i:I

    .line 98
    .line 99
    if-eq v6, p1, :cond_7

    .line 100
    .line 101
    move v1, v2

    .line 102
    :cond_7
    iput p1, v0, Ldefpackage/l64;->i:I

    .line 103
    .line 104
    invoke-virtual {v0, v5}, Ldefpackage/l64;->c(I)V

    .line 105
    .line 106
    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    iget-object v0, v0, Ldefpackage/l64;->a:Ldefpackage/q80;

    .line 110
    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ldefpackage/q80;->c(I)V

    .line 114
    .line 115
    .line 116
    :cond_8
    if-nez p2, :cond_9

    .line 117
    .line 118
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_9
    int-to-double v0, p1

    .line 125
    sub-double v5, v0, v3

    .line 126
    .line 127
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 128
    .line 129
    .line 130
    move-result-wide v5

    .line 131
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 132
    .line 133
    cmpl-double p2, v5, v7

    .line 134
    .line 135
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 136
    .line 137
    if-lez p2, :cond_b

    .line 138
    .line 139
    cmpl-double p2, v0, v3

    .line 140
    .line 141
    if-lez p2, :cond_a

    .line 142
    .line 143
    add-int/lit8 p2, p1, -0x3

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_a
    add-int/lit8 p2, p1, 0x3

    .line 147
    .line 148
    :goto_3
    invoke-virtual {v2, p2}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 149
    .line 150
    .line 151
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 152
    .line 153
    new-instance p2, Ldefpackage/rq;

    .line 154
    .line 155
    invoke-direct {p2, p1, p0}, Ldefpackage/rq;-><init>(ILdefpackage/p75;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_b
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView;->m0(I)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/os/Parcelable;

    .line 10
    .line 11
    instance-of v1, v0, Ldefpackage/q75;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Ldefpackage/q75;

    .line 16
    .line 17
    iget v0, v0, Ldefpackage/q75;->n:I

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroid/os/Parcelable;

    .line 30
    .line 31
    invoke-virtual {p1, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->b()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->x:Ldefpackage/o75;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->t:Ldefpackage/l75;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ldefpackage/o75;->g(Ldefpackage/mw3;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->t:Ldefpackage/l75;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 24
    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->z:Ldefpackage/q80;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ldefpackage/q80;->c(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    const-string p0, "Design assumption violated."

    .line 43
    .line 44
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string p0, "androidx.viewpager.widget.ViewPager"

    .line 12
    .line 13
    return-object p0
.end method

.method public getAdapter()Ldefpackage/dw3;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldefpackage/dw3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getCurrentItem()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 2
    .line 3
    return p0
.end method

.method public getItemDecorationCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getOffscreenPageLimit()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/viewpager2/widget/ViewPager2;->F:I

    .line 2
    .line 3
    return p0
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->t:Ldefpackage/l75;

    .line 2
    .line 3
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public getPageSize()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr p0, v1

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :goto_0
    sub-int/2addr p0, v0

    .line 23
    return p0

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    sub-int/2addr p0, v1

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_0
.end method

.method public getScrollState()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->y:Ldefpackage/l64;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/l64;->f:I

    .line 4
    .line 5
    return p0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ldefpackage/dw3;->a()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    move v3, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ldefpackage/dw3;->a()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    move v3, v0

    .line 43
    move v0, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v0, v2

    .line 46
    move v3, v0

    .line 47
    :goto_0
    invoke-static {v0, v3, v2}, Ldefpackage/t3;->a(III)Ldefpackage/t3;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, Ldefpackage/t3;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {v0}, Ldefpackage/dw3;->a()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    iget-boolean v2, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 72
    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget v2, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 77
    .line 78
    if-lez v2, :cond_4

    .line 79
    .line 80
    const/16 v2, 0x2000

    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 83
    .line 84
    .line 85
    :cond_4
    iget p0, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 86
    .line 87
    sub-int/2addr v0, v1

    .line 88
    if-ge p0, v0, :cond_5

    .line 89
    .line 90
    const/16 p0, 0x1000

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 93
    .line 94
    .line 95
    :cond_5
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 96
    .line 97
    .line 98
    :cond_6
    :goto_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->n:Landroid/graphics/Rect;

    .line 18
    .line 19
    iput v1, v2, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    sub-int/2addr p4, p2

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    sub-int/2addr p4, p2

    .line 27
    iput p4, v2, Landroid/graphics/Rect;->right:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, v2, Landroid/graphics/Rect;->top:I

    .line 34
    .line 35
    sub-int/2addr p5, p3

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    sub-int/2addr p5, p2

    .line 41
    iput p5, v2, Landroid/graphics/Rect;->bottom:I

    .line 42
    .line 43
    const p2, 0x800033

    .line 44
    .line 45
    .line 46
    iget-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->o:Landroid/graphics/Rect;

    .line 47
    .line 48
    invoke-static {p2, p1, v0, v2, p3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 52
    .line 53
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    iget p4, p3, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget p5, p3, Landroid/graphics/Rect;->right:I

    .line 58
    .line 59
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    invoke-virtual {p1, p2, p4, p5, p3}, Landroid/view/View;->layout(IIII)V

    .line 62
    .line 63
    .line 64
    iget-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->e()V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredState()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/2addr v4, v3

    .line 33
    add-int/2addr v4, v0

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v3, v0

    .line 43
    add-int/2addr v3, v1

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v0, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    shl-int/lit8 v0, v2, 0x10

    .line 65
    .line 66
    invoke-static {v1, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ldefpackage/q75;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Ldefpackage/q75;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget v0, p1, Ldefpackage/q75;->o:I

    .line 19
    .line 20
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 21
    .line 22
    iget-object p1, p1, Ldefpackage/q75;->p:Landroid/os/Parcelable;

    .line 23
    .line 24
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->v:Landroid/os/Parcelable;

    .line 25
    .line 26
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 10

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldefpackage/q75;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, v1, Ldefpackage/q75;->n:I

    .line 17
    .line 18
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->u:I

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 24
    .line 25
    :cond_0
    iput v0, v1, Ldefpackage/q75;->o:I

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->v:Landroid/os/Parcelable;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iput-object v0, v1, Ldefpackage/q75;->p:Landroid/os/Parcelable;

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldefpackage/dw3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    instance-of v0, p0, Ldefpackage/ee1;

    .line 41
    .line 42
    if-eqz v0, :cond_7

    .line 43
    .line 44
    check-cast p0, Ldefpackage/ee1;

    .line 45
    .line 46
    new-instance v0, Landroid/os/Bundle;

    .line 47
    .line 48
    iget-object v2, p0, Ldefpackage/ee1;->s:Ldefpackage/xe2;

    .line 49
    .line 50
    invoke-virtual {v2}, Ldefpackage/xe2;->h()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    iget-object v4, p0, Ldefpackage/ee1;->t:Ldefpackage/xe2;

    .line 55
    .line 56
    invoke-virtual {v4}, Ldefpackage/xe2;->h()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/2addr v5, v3

    .line 61
    invoke-direct {v0, v5}, Landroid/os/Bundle;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    move v5, v3

    .line 66
    :goto_0
    invoke-virtual {v2}, Ldefpackage/xe2;->h()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ge v5, v6, :cond_4

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Ldefpackage/xe2;->e(I)J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    invoke-virtual {v2, v6, v7}, Ldefpackage/xe2;->b(J)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    check-cast v8, Ldefpackage/kc1;

    .line 81
    .line 82
    if-eqz v8, :cond_3

    .line 83
    .line 84
    invoke-virtual {v8}, Ldefpackage/kc1;->y()Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_3

    .line 89
    .line 90
    const-string v9, "f#"

    .line 91
    .line 92
    invoke-static {v9, v6, v7}, Ldefpackage/b11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    iget-object v7, p0, Ldefpackage/ee1;->r:Ldefpackage/ld1;

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object v9, v8, Ldefpackage/kc1;->F:Ldefpackage/ld1;

    .line 102
    .line 103
    if-ne v9, v7, :cond_2

    .line 104
    .line 105
    iget-object v7, v8, Ldefpackage/kc1;->r:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    const-string v0, "Fragment "

    .line 114
    .line 115
    const-string v1, " is not currently in the FragmentManager"

    .line 116
    .line 117
    invoke-static {v0, v8, v1}, Ldefpackage/b11;->l(Ljava/lang/String;Ldefpackage/kc1;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7, p0}, Ldefpackage/ld1;->g0(Ljava/lang/RuntimeException;)V

    .line 125
    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    throw p0

    .line 129
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    :goto_2
    invoke-virtual {v4}, Ldefpackage/xe2;->h()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-ge v3, v2, :cond_6

    .line 137
    .line 138
    invoke-virtual {v4, v3}, Ldefpackage/xe2;->e(I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    invoke-virtual {p0, v5, v6}, Ldefpackage/ee1;->q(J)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_5

    .line 147
    .line 148
    const-string v2, "s#"

    .line 149
    .line 150
    invoke-static {v2, v5, v6}, Ldefpackage/b11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v4, v5, v6}, Ldefpackage/xe2;->b(J)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, Landroid/os/Parcelable;

    .line 159
    .line 160
    invoke-virtual {v0, v2, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 161
    .line 162
    .line 163
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_6
    iput-object v0, v1, Ldefpackage/q75;->p:Landroid/os/Parcelable;

    .line 167
    .line 168
    :cond_7
    return-object v1
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "ViewPager2 does not support direct child views"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x1000

    .line 7
    .line 8
    const/16 v1, 0x2000

    .line 9
    .line 10
    if-eq p1, v1, :cond_1

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 28
    .line 29
    if-eq p1, v1, :cond_3

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_3
    :goto_1
    const/4 p2, 0x1

    .line 40
    if-ne p1, v1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    sub-int/2addr p1, p2

    .line 47
    goto :goto_2

    .line 48
    :cond_4
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    add-int/2addr p1, p2

    .line 53
    :goto_2
    iget-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 54
    .line 55
    if-eqz v0, :cond_5

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    .line 58
    .line 59
    .line 60
    :cond_5
    return p2
.end method

.method public setAdapter(Ldefpackage/dw3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldefpackage/dw3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ldefpackage/i75;

    .line 14
    .line 15
    iget-object v2, v0, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->s:Ldefpackage/i75;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->b()V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/ss0;->H()V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object p0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Ldefpackage/i75;

    .line 54
    .line 55
    iget-object v0, p1, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    if-eqz p1, :cond_3

    .line 61
    .line 62
    iget-object p0, p1, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/ss0;->H()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ge p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p0, "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"

    .line 9
    .line 10
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    :goto_0
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->F:I

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->t:Ldefpackage/l75;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->g1(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/ss0;->H()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setPageTransformer(Ldefpackage/n75;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->D:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Ldefpackage/jw3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->C:Ldefpackage/jw3;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->D:Z

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Ldefpackage/jw3;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Ldefpackage/p75;

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->C:Ldefpackage/jw3;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Ldefpackage/jw3;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->C:Ldefpackage/jw3;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->D:Z

    .line 38
    .line 39
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->B:Ldefpackage/bc3;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->B:Ldefpackage/bc3;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->B:Ldefpackage/bc3;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public setUserInputEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Ldefpackage/ss0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/ss0;->H()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
