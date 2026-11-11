.class public final Llq2;
.super Ldg;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic g0:I


# instance fields
.field public final A:Ljava/util/ArrayList;

.field public final B:Landroid/content/Context;

.field public C:Z

.field public D:Z

.field public E:J

.field public final F:Lzk;

.field public G:Landroidx/recyclerview/widget/RecyclerView;

.field public H:Ljq2;

.field public I:Lkq2;

.field public J:Ljava/util/HashMap;

.field public K:Lwq2;

.field public L:Ljava/util/HashMap;

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Landroid/widget/ImageButton;

.field public Q:Landroid/widget/Button;

.field public R:Landroid/widget/ImageView;

.field public S:Landroid/view/View;

.field public T:Landroid/widget/ImageView;

.field public U:Landroid/widget/TextView;

.field public V:Landroid/widget/TextView;

.field public W:Ljava/lang/String;

.field public final X:Lnp2;

.field public Y:Landroid/support/v4/media/MediaDescriptionCompat;

.field public Z:Lcq2;

.field public a0:Landroid/graphics/Bitmap;

.field public b0:Landroid/net/Uri;

.field public c0:Z

.field public d0:Landroid/graphics/Bitmap;

.field public e0:I

.field public final f0:Z

.field public final t:Lyq2;

.field public final u:Lap2;

.field public v:Lrq2;

.field public w:Lwq2;

.field public final x:Ljava/util/ArrayList;

.field public final y:Ljava/util/ArrayList;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "MediaRouteCtrlDialog"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lfu;->o(Landroid/content/Context;Z)Landroid/view/ContextThemeWrapper;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const v1, 0x7f040375

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v1}, Lfu;->B(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lfu;->z(Landroid/content/Context;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :cond_0
    invoke-direct {p0, p1, v1}, Ldg;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lrq2;->c:Lrq2;

    .line 23
    .line 24
    iput-object p1, p0, Llq2;->v:Lrq2;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Llq2;->x:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Llq2;->y:Ljava/util/ArrayList;

    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Llq2;->z:Ljava/util/ArrayList;

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Llq2;->A:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance p1, Lzk;

    .line 55
    .line 56
    const/4 v1, 0x7

    .line 57
    invoke-direct {p1, v1, p0}, Lzk;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Llq2;->F:Lzk;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Llq2;->B:Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {p1}, Lyq2;->d(Landroid/content/Context;)Lyq2;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Llq2;->t:Lyq2;

    .line 73
    .line 74
    sget-object p1, Lyq2;->c:Lui1;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    if-nez p1, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-static {}, Lyq2;->c()Lui1;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move v0, v1

    .line 88
    :goto_0
    iput-boolean v0, p0, Llq2;->f0:Z

    .line 89
    .line 90
    new-instance p1, Lap2;

    .line 91
    .line 92
    const/4 v0, 0x4

    .line 93
    invoke-direct {p1, p0, v0}, Lap2;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Llq2;->u:Lap2;

    .line 97
    .line 98
    invoke-static {}, Lyq2;->b()V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lyq2;->c()Lui1;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lui1;->g()Lwq2;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Llq2;->w:Lwq2;

    .line 110
    .line 111
    new-instance p1, Lnp2;

    .line 112
    .line 113
    invoke-direct {p1, p0, v1}, Lnp2;-><init>(Ldg;I)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Llq2;->X:Lnp2;

    .line 117
    .line 118
    invoke-virtual {p0}, Llq2;->k()V

    .line 119
    .line 120
    .line 121
    return-void
.end method


# virtual methods
.method public final i(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lwq2;

    .line 14
    .line 15
    invoke-virtual {v1}, Lwq2;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-boolean v2, v1, Lwq2;->g:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Llq2;->v:Lrq2;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lwq2;->h(Lrq2;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Llq2;->w:Lwq2;

    .line 34
    .line 35
    if-eq v2, v1, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Llq2;->Y:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, v0, Landroid/support/v4/media/MediaDescriptionCompat;->r:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    iget-object v1, v0, Landroid/support/v4/media/MediaDescriptionCompat;->s:Landroid/net/Uri;

    .line 14
    .line 15
    :goto_1
    iget-object v0, p0, Llq2;->Z:Lcq2;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v3, p0, Llq2;->a0:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_2
    iget-object v3, v0, Lcq2;->a:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    :goto_2
    if-nez v0, :cond_3

    .line 25
    .line 26
    iget-object v0, p0, Llq2;->b0:Landroid/net/Uri;

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_3
    iget-object v0, v0, Lcq2;->b:Landroid/net/Uri;

    .line 30
    .line 31
    :goto_3
    if-ne v3, v2, :cond_5

    .line 32
    .line 33
    if-nez v3, :cond_4

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    :cond_4
    return-void

    .line 42
    :cond_5
    iget-object v0, p0, Llq2;->Z:Lcq2;

    .line 43
    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 48
    .line 49
    .line 50
    :cond_6
    new-instance v0, Lcq2;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcq2;-><init>(Llq2;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Llq2;->Z:Lcq2;

    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    new-array p0, p0, [Ljava/lang/Void;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final k()V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(Lrq2;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Llq2;->v:Lrq2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lrq2;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Llq2;->v:Lrq2;

    .line 12
    .line 13
    iget-boolean v0, p0, Llq2;->D:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Llq2;->t:Lyq2;

    .line 18
    .line 19
    iget-object v1, p0, Llq2;->u:Lap2;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lyq2;->e(Luo;)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v0, p1, v1, v2}, Lyq2;->a(Lrq2;Luo;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Llq2;->o()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    const-string p0, "selector must not be null"

    .line 33
    .line 34
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-object v0, p0, Llq2;->B:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f050006

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, -0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    move v1, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v0}, Lxl;->p(Landroid/content/Context;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v3, -0x2

    .line 35
    :goto_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v1, v3}, Landroid/view/Window;->setLayout(II)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Llq2;->a0:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    iput-object v0, p0, Llq2;->b0:Landroid/net/Uri;

    .line 46
    .line 47
    invoke-virtual {p0}, Llq2;->j()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Llq2;->n()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Llq2;->p()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final n()V
    .locals 10

    .line 1
    iget-object v0, p0, Llq2;->K:Lwq2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Llq2;->M:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-boolean v0, p0, Llq2;->C:Z

    .line 12
    .line 13
    xor-int/2addr v0, v1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    move v0, v1

    .line 16
    :goto_1
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iput-boolean v1, p0, Llq2;->O:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Llq2;->O:Z

    .line 23
    .line 24
    iget-object v2, p0, Llq2;->w:Lwq2;

    .line 25
    .line 26
    invoke-virtual {v2}, Lwq2;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    iget-object v2, p0, Llq2;->w:Lwq2;

    .line 33
    .line 34
    invoke-virtual {v2}, Lwq2;->d()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    :cond_3
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 41
    .line 42
    .line 43
    :cond_4
    iget-boolean v2, p0, Llq2;->c0:Z

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/16 v4, 0x8

    .line 47
    .line 48
    if-eqz v2, :cond_6

    .line 49
    .line 50
    iget-object v2, p0, Llq2;->d0:Landroid/graphics/Bitmap;

    .line 51
    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    iget-object v2, p0, Llq2;->d0:Landroid/graphics/Bitmap;

    .line 62
    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    iget-object v2, p0, Llq2;->T:Landroid/widget/ImageView;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, Llq2;->T:Landroid/widget/ImageView;

    .line 71
    .line 72
    iget-object v5, p0, Llq2;->d0:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Llq2;->T:Landroid/widget/ImageView;

    .line 78
    .line 79
    iget v5, p0, Llq2;->e0:I

    .line 80
    .line 81
    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Llq2;->S:Landroid/view/View;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Llq2;->d0:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    iget-object v5, p0, Llq2;->B:Landroid/content/Context;

    .line 92
    .line 93
    invoke-static {v5}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-static {v5, v2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v6}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-static {v5, v7}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-static {v5}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-static {v5, v8}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const/high16 v9, 0x41200000    # 10.0f

    .line 118
    .line 119
    invoke-virtual {v8, v9}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8, v6}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v7}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-virtual {v2, v9, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v7, v1}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, Landroid/renderscript/Allocation;->destroy()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7}, Landroid/renderscript/Allocation;->destroy()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, Landroid/renderscript/BaseObj;->destroy()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, Landroid/renderscript/RenderScript;->destroy()V

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Llq2;->R:Landroid/widget/ImageView;

    .line 152
    .line 153
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    :goto_2
    iget-object v1, p0, Llq2;->d0:Landroid/graphics/Bitmap;

    .line 158
    .line 159
    if-eqz v1, :cond_7

    .line 160
    .line 161
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_7

    .line 166
    .line 167
    new-instance v1, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v2, "Can\'t set artwork image with recycled bitmap: "

    .line 170
    .line 171
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Llq2;->d0:Landroid/graphics/Bitmap;

    .line 175
    .line 176
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const-string v2, "MediaRouteCtrlDialog"

    .line 184
    .line 185
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    :cond_7
    iget-object v1, p0, Llq2;->T:Landroid/widget/ImageView;

    .line 189
    .line 190
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    iget-object v1, p0, Llq2;->S:Landroid/view/View;

    .line 194
    .line 195
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    iget-object v1, p0, Llq2;->R:Landroid/widget/ImageView;

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 201
    .line 202
    .line 203
    :goto_3
    iput-boolean v0, p0, Llq2;->c0:Z

    .line 204
    .line 205
    iput-object v3, p0, Llq2;->d0:Landroid/graphics/Bitmap;

    .line 206
    .line 207
    iput v0, p0, Llq2;->e0:I

    .line 208
    .line 209
    iget-object v1, p0, Llq2;->Y:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 210
    .line 211
    if-nez v1, :cond_8

    .line 212
    .line 213
    move-object v1, v3

    .line 214
    goto :goto_4

    .line 215
    :cond_8
    iget-object v1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->o:Ljava/lang/CharSequence;

    .line 216
    .line 217
    :goto_4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    iget-object v5, p0, Llq2;->Y:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 222
    .line 223
    if-nez v5, :cond_9

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_9
    iget-object v3, v5, Landroid/support/v4/media/MediaDescriptionCompat;->p:Ljava/lang/CharSequence;

    .line 227
    .line 228
    :goto_5
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    iget-object v6, p0, Llq2;->U:Landroid/widget/TextView;

    .line 233
    .line 234
    if-nez v2, :cond_a

    .line 235
    .line 236
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_a
    iget-object v1, p0, Llq2;->W:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    :goto_6
    iget-object v1, p0, Llq2;->V:Landroid/widget/TextView;

    .line 246
    .line 247
    if-nez v5, :cond_b

    .line 248
    .line 249
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    .line 251
    .line 252
    iget-object p0, p0, Llq2;->V:Landroid/widget/TextView;

    .line 253
    .line 254
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_b
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    return-void
.end method

.method public final o()V
    .locals 8

    .line 1
    iget-object v0, p0, Llq2;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Llq2;->y:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Llq2;->z:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Llq2;->w:Lwq2;

    .line 17
    .line 18
    iget-object v3, v3, Lwq2;->v:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Llq2;->w:Lwq2;

    .line 28
    .line 29
    invoke-virtual {v3}, Lwq2;->a()Ltq2;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    iget-object v4, p0, Llq2;->w:Lwq2;

    .line 36
    .line 37
    iget-object v4, v4, Lwq2;->a:Lvq2;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lyq2;->b()V

    .line 43
    .line 44
    .line 45
    iget-object v4, v4, Lvq2;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lwq2;

    .line 66
    .line 67
    invoke-virtual {v3, v5}, Ltq2;->n(Lwq2;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_1
    iget-object v6, v3, Ltq2;->x:Loi;

    .line 77
    .line 78
    iget-object v7, v5, Lwq2;->c:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v6, v7}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, Lmq2;

    .line 85
    .line 86
    if-eqz v6, :cond_0

    .line 87
    .line 88
    iget-boolean v6, v6, Lmq2;->e:Z

    .line 89
    .line 90
    if-eqz v6, :cond_0

    .line 91
    .line 92
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {p0, v1}, Llq2;->i(Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v2}, Llq2;->i(Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    sget-object v3, Lca1;->s:Lca1;

    .line 103
    .line 104
    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, p0, Llq2;->H:Ljq2;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljq2;->s()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Llq2;->D:Z

    .line 6
    .line 7
    iget-object v1, p0, Llq2;->v:Lrq2;

    .line 8
    .line 9
    iget-object v2, p0, Llq2;->u:Lap2;

    .line 10
    .line 11
    iget-object v3, p0, Llq2;->t:Lyq2;

    .line 12
    .line 13
    invoke-virtual {v3, v1, v2, v0}, Lyq2;->a(Lrq2;Luo;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Llq2;->o()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lyq2;->c:Lui1;

    .line 20
    .line 21
    invoke-virtual {p0}, Llq2;->k()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Ldg;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x7f0d00d6

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldg;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Llq2;->B:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v0}, Lfu;->D(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const v1, 0x7f060311

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const v1, 0x7f060310

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 38
    .line 39
    .line 40
    const p1, 0x7f0a03ac

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroid/widget/ImageButton;

    .line 48
    .line 49
    iput-object p1, p0, Llq2;->P:Landroid/widget/ImageButton;

    .line 50
    .line 51
    const/4 v1, -0x1

    .line 52
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Llq2;->P:Landroid/widget/ImageButton;

    .line 56
    .line 57
    new-instance v2, Lbq2;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-direct {v2, p0, v3}, Lbq2;-><init>(Llq2;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    const p1, 0x7f0a03bc

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Landroid/widget/Button;

    .line 74
    .line 75
    iput-object p1, p0, Llq2;->Q:Landroid/widget/Button;

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Llq2;->Q:Landroid/widget/Button;

    .line 81
    .line 82
    new-instance v2, Lbq2;

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    invoke-direct {v2, p0, v4}, Lbq2;-><init>(Llq2;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Ljq2;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljq2;-><init>(Llq2;)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Llq2;->H:Ljq2;

    .line 97
    .line 98
    const p1, 0x7f0a03b2

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 106
    .line 107
    iput-object p1, p0, Llq2;->G:Landroidx/recyclerview/widget/RecyclerView;

    .line 108
    .line 109
    iget-object v2, p0, Llq2;->H:Ljq2;

    .line 110
    .line 111
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Llq2;->G:Landroidx/recyclerview/widget/RecyclerView;

    .line 115
    .line 116
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 117
    .line 118
    invoke-direct {v2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lkq2;

    .line 125
    .line 126
    invoke-direct {p1, v3, p0}, Lkq2;-><init>(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Llq2;->I:Lkq2;

    .line 130
    .line 131
    new-instance p1, Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Llq2;->J:Ljava/util/HashMap;

    .line 137
    .line 138
    new-instance p1, Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Llq2;->L:Ljava/util/HashMap;

    .line 144
    .line 145
    const p1, 0x7f0a03b4

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Landroid/widget/ImageView;

    .line 153
    .line 154
    iput-object p1, p0, Llq2;->R:Landroid/widget/ImageView;

    .line 155
    .line 156
    const p1, 0x7f0a03b5

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iput-object p1, p0, Llq2;->S:Landroid/view/View;

    .line 164
    .line 165
    const p1, 0x7f0a03b3

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Landroid/widget/ImageView;

    .line 173
    .line 174
    iput-object p1, p0, Llq2;->T:Landroid/widget/ImageView;

    .line 175
    .line 176
    const p1, 0x7f0a03b7

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Landroid/widget/TextView;

    .line 184
    .line 185
    iput-object p1, p0, Llq2;->U:Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 188
    .line 189
    .line 190
    const p1, 0x7f0a03b6

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p1}, Ldg;->findViewById(I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    check-cast p1, Landroid/widget/TextView;

    .line 198
    .line 199
    iput-object p1, p0, Llq2;->V:Landroid/widget/TextView;

    .line 200
    .line 201
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const v0, 0x7f130352

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iput-object p1, p0, Llq2;->W:Ljava/lang/String;

    .line 216
    .line 217
    iput-boolean v4, p0, Llq2;->C:Z

    .line 218
    .line 219
    invoke-virtual {p0}, Llq2;->m()V

    .line 220
    .line 221
    .line 222
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Llq2;->D:Z

    .line 6
    .line 7
    iget-object v0, p0, Llq2;->t:Lyq2;

    .line 8
    .line 9
    iget-object v1, p0, Llq2;->u:Lap2;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lyq2;->e(Luo;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Llq2;->F:Lzk;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Llq2;->k()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final p()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Llq2;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Llq2;->E:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    const-wide/16 v2, 0x12c

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ltz v0, :cond_5

    .line 18
    .line 19
    iget-object v0, p0, Llq2;->K:Lwq2;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-boolean v0, p0, Llq2;->M:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-boolean v0, p0, Llq2;->C:Z

    .line 29
    .line 30
    xor-int/2addr v0, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move v0, v1

    .line 33
    :goto_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iput-boolean v1, p0, Llq2;->N:Z

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Llq2;->N:Z

    .line 40
    .line 41
    iget-object v0, p0, Llq2;->w:Lwq2;

    .line 42
    .line 43
    invoke-virtual {v0}, Lwq2;->g()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Llq2;->w:Lwq2;

    .line 50
    .line 51
    invoke-virtual {v0}, Lwq2;->d()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    :cond_3
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    iput-wide v0, p0, Llq2;->E:J

    .line 65
    .line 66
    iget-object p0, p0, Llq2;->H:Ljq2;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljq2;->r()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_5
    iget-object v0, p0, Llq2;->F:Lzk;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 75
    .line 76
    .line 77
    iget-wide v4, p0, Llq2;->E:J

    .line 78
    .line 79
    add-long/2addr v4, v2

    .line 80
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 81
    .line 82
    .line 83
    :cond_6
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Llq2;->N:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Llq2;->p()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Llq2;->O:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Llq2;->n()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method
