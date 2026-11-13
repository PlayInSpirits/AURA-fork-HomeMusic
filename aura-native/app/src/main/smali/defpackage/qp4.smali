.class public final Ldefpackage/qp4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static d:Ldefpackage/qp4;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance v0, Ldefpackage/yn4;

    .line 90
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 92
    iput-object p1, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 93
    iput-object p2, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 66
    iput-object p2, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 67
    iput-object p3, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;Lcom/google/android/material/bottomnavigation/BottomNavigationView;Landroid/widget/TextView;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p2, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 76
    iput-object p3, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 77
    iput-object p4, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/database/AppDatabase;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ldefpackage/i80;

    const/16 v1, 0x16

    .line 70
    invoke-direct {v0, v1}, Ldefpackage/i80;-><init>(I)V

    .line 71
    iput-object v0, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 72
    new-instance v0, Ldefpackage/si1;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ldefpackage/si1;-><init>(I)V

    iput-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 73
    iput-object p1, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/ja2;)V
    .locals 2

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Ldefpackage/ea2;

    const/4 v1, 0x1

    .line 111
    invoke-direct {v0, p1, v1}, Ldefpackage/ea2;-><init>(Ldefpackage/ba2;Z)V

    .line 112
    iput-object v0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 113
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 116
    iput-object p2, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/kc0;)V
    .locals 1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 96
    new-instance v0, Ldefpackage/kr;

    .line 97
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object v0, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 99
    iput-object p1, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/na4;Ldefpackage/om0;Ldefpackage/wk0;Ljava/util/Set;)V
    .locals 7

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p2, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 102
    iput-object p1, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 103
    iput-object p3, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 104
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 105
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 106
    new-instance v1, Ljava/lang/String;

    array-length p3, p2

    const/4 p4, 0x0

    invoke-direct {v1, p2, p4, p3}, Ljava/lang/String;-><init>([III)V

    .line 107
    new-instance v6, Ldefpackage/f01;

    invoke-direct {v6, p4, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 108
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Ldefpackage/qp4;->n(Ljava/lang/CharSequence;IIIZLdefpackage/e01;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Ldefpackage/vc3;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/zg2;Landroid/view/View;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 80
    new-instance v0, Ldefpackage/ch2;

    .line 81
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    .line 82
    new-instance v0, Ldefpackage/ah2;

    .line 83
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 84
    :goto_0
    iput-object v0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 85
    iput-object p1, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 86
    iput-object p2, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    return-void
.end method

.method public varargs constructor <init>([Ldefpackage/im;)V
    .locals 5

    .line 1
    new-instance v0, Ldefpackage/wd4;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/wd4;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldefpackage/bj4;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput v2, v1, Ldefpackage/bj4;->c:F

    .line 14
    .line 15
    iput v2, v1, Ldefpackage/bj4;->d:F

    .line 16
    .line 17
    sget-object v2, Ldefpackage/gm;->e:Ldefpackage/gm;

    .line 18
    .line 19
    iput-object v2, v1, Ldefpackage/bj4;->e:Ldefpackage/gm;

    .line 20
    .line 21
    iput-object v2, v1, Ldefpackage/bj4;->f:Ldefpackage/gm;

    .line 22
    .line 23
    iput-object v2, v1, Ldefpackage/bj4;->g:Ldefpackage/gm;

    .line 24
    .line 25
    iput-object v2, v1, Ldefpackage/bj4;->h:Ldefpackage/gm;

    .line 26
    .line 27
    sget-object v2, Ldefpackage/im;->a:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    iput-object v2, v1, Ldefpackage/bj4;->k:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    iput-object v2, v1, Ldefpackage/bj4;->l:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    iput v2, v1, Ldefpackage/bj4;->b:I

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    array-length v2, p1

    .line 40
    add-int/lit8 v2, v2, 0x2

    .line 41
    .line 42
    new-array v2, v2, [Ldefpackage/im;

    .line 43
    .line 44
    iput-object v2, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    array-length v4, p1

    .line 48
    invoke-static {p1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v1, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 54
    .line 55
    array-length p0, p1

    .line 56
    aput-object v0, v2, p0

    .line 57
    .line 58
    array-length p0, p1

    .line 59
    add-int/lit8 p0, p0, 0x1

    .line 60
    .line 61
    aput-object v1, v2, p0

    .line 62
    .line 63
    return-void
.end method

.method public static a(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Ldefpackage/l05;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Ldefpackage/l05;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method


# virtual methods
.method public b()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, -0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ldefpackage/xi2;

    .line 26
    .line 27
    iget v0, v0, Ldefpackage/xi2;->a:I

    .line 28
    .line 29
    int-to-long v0, v0

    .line 30
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget p0, p0, Ldefpackage/qc3;->h:I

    .line 35
    .line 36
    int-to-long v2, p0

    .line 37
    sub-long/2addr v0, v2

    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    cmp-long p0, v0, v2

    .line 41
    .line 42
    if-gez p0, :cond_1

    .line 43
    .line 44
    move-wide v0, v2

    .line 45
    :cond_1
    long-to-int p0, v0

    .line 46
    return p0
.end method

.method public c()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    xor-int/lit8 p0, p0, 0x1

    .line 12
    .line 13
    return p0
.end method

.method public d()I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, -0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/q40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ldefpackage/xi2;

    .line 26
    .line 27
    iget v0, v0, Ldefpackage/xi2;->a:I

    .line 28
    .line 29
    int-to-long v0, v0

    .line 30
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget v2, v2, Ldefpackage/qc3;->h:I

    .line 35
    .line 36
    int-to-long v2, v2

    .line 37
    add-long/2addr v0, v2

    .line 38
    invoke-virtual {p0}, Ldefpackage/qp4;->h()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    int-to-long v2, p0

    .line 43
    const-wide/16 v4, 0x1

    .line 44
    .line 45
    sub-long/2addr v2, v4

    .line 46
    cmp-long p0, v0, v2

    .line 47
    .line 48
    if-lez p0, :cond_1

    .line 49
    .line 50
    move-wide v0, v2

    .line 51
    :cond_1
    long-to-int p0, v0

    .line 52
    return p0
.end method

.method public e()Ldefpackage/qc3;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/qc3;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "layoutInfo"

    .line 9
    .line 10
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public f()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/q40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ldefpackage/xi2;

    .line 26
    .line 27
    iget v0, v0, Ldefpackage/xi2;->l:I

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v1, v1, Ldefpackage/qc3;->b:I

    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget v1, v1, Ldefpackage/qc3;->c:I

    .line 41
    .line 42
    add-int/2addr v0, v1

    .line 43
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget p0, p0, Ldefpackage/qc3;->g:I

    .line 48
    .line 49
    sub-int/2addr v0, p0

    .line 50
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
.end method

.method public g()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ldefpackage/xi2;

    .line 26
    .line 27
    iget v0, v0, Ldefpackage/xi2;->l:I

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget p0, p0, Ldefpackage/qc3;->f:I

    .line 34
    .line 35
    neg-int p0, p0

    .line 36
    add-int/2addr v0, p0

    .line 37
    if-lez v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v0

    .line 41
    :goto_0
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public h()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/vc3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/vc3;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public i(Ljava/lang/CharSequence;IILdefpackage/k05;)Z
    .locals 6

    .line 1
    iget v0, p4, Ldefpackage/k05;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/wk0;

    .line 13
    .line 14
    invoke-virtual {p4}, Ldefpackage/k05;->b()Ldefpackage/vv2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Ldefpackage/zf2;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-object v5, v0, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v0, v0, Ldefpackage/zf2;->n:I

    .line 31
    .line 32
    add-int/2addr v4, v0

    .line 33
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v0, Ldefpackage/wk0;->b:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    if-ge p2, p3, :cond_2

    .line 65
    .line 66
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p0, p0, Ldefpackage/wk0;->a:Landroid/text/TextPaint;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    iget p1, p4, Ldefpackage/k05;->c:I

    .line 87
    .line 88
    and-int/lit8 p1, p1, 0x4

    .line 89
    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    or-int/lit8 p0, p1, 0x2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    or-int/lit8 p0, p1, 0x1

    .line 96
    .line 97
    :goto_1
    iput p0, p4, Ldefpackage/k05;->c:I

    .line 98
    .line 99
    :cond_4
    iget p0, p4, Ldefpackage/k05;->c:I

    .line 100
    .line 101
    and-int/lit8 p0, p0, 0x3

    .line 102
    .line 103
    if-ne p0, v1, :cond_5

    .line 104
    .line 105
    return v3

    .line 106
    :cond_5
    return v2
.end method

.method public j()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 29
    .line 30
    return v2

    .line 31
    :cond_1
    iget-object v0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/io/BufferedReader;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    :goto_0
    return v2

    .line 56
    :cond_2
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method public k(ILdefpackage/jc0;Ldefpackage/nr3;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/kr;

    .line 4
    .line 5
    iget-object v0, p2, Ldefpackage/jc0;->o0:[I

    .line 6
    .line 7
    iget-object v1, p2, Ldefpackage/jc0;->t:[I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget v3, v0, v2

    .line 11
    .line 12
    iput v3, p0, Ldefpackage/kr;->a:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aget v0, v0, v3

    .line 16
    .line 17
    iput v0, p0, Ldefpackage/kr;->b:I

    .line 18
    .line 19
    invoke-virtual {p2}, Ldefpackage/jc0;->o()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Ldefpackage/kr;->c:I

    .line 24
    .line 25
    invoke-virtual {p2}, Ldefpackage/jc0;->i()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Ldefpackage/kr;->d:I

    .line 30
    .line 31
    iput-boolean v2, p0, Ldefpackage/kr;->i:Z

    .line 32
    .line 33
    iput p1, p0, Ldefpackage/kr;->j:I

    .line 34
    .line 35
    iget p1, p0, Ldefpackage/kr;->a:I

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    if-ne p1, v0, :cond_0

    .line 39
    .line 40
    move p1, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move p1, v2

    .line 43
    :goto_0
    iget v4, p0, Ldefpackage/kr;->b:I

    .line 44
    .line 45
    if-ne v4, v0, :cond_1

    .line 46
    .line 47
    move v0, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v0, v2

    .line 50
    :goto_1
    const/4 v4, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget p1, p2, Ldefpackage/jc0;->V:F

    .line 54
    .line 55
    cmpl-float p1, p1, v4

    .line 56
    .line 57
    if-lez p1, :cond_2

    .line 58
    .line 59
    move p1, v3

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move p1, v2

    .line 62
    :goto_2
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget v0, p2, Ldefpackage/jc0;->V:F

    .line 65
    .line 66
    cmpl-float v0, v0, v4

    .line 67
    .line 68
    if-lez v0, :cond_3

    .line 69
    .line 70
    move v0, v3

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move v0, v2

    .line 73
    :goto_3
    const/4 v4, 0x4

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    aget p1, v1, v2

    .line 77
    .line 78
    if-ne p1, v4, :cond_4

    .line 79
    .line 80
    iput v3, p0, Ldefpackage/kr;->a:I

    .line 81
    .line 82
    :cond_4
    if-eqz v0, :cond_5

    .line 83
    .line 84
    aget p1, v1, v3

    .line 85
    .line 86
    if-ne p1, v4, :cond_5

    .line 87
    .line 88
    iput v3, p0, Ldefpackage/kr;->b:I

    .line 89
    .line 90
    :cond_5
    invoke-virtual {p3, p2, p0}, Ldefpackage/nr3;->d(Ldefpackage/jc0;Ldefpackage/kr;)V

    .line 91
    .line 92
    .line 93
    iget p1, p0, Ldefpackage/kr;->e:I

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ldefpackage/jc0;->K(I)V

    .line 96
    .line 97
    .line 98
    iget p1, p0, Ldefpackage/kr;->f:I

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Ldefpackage/jc0;->H(I)V

    .line 101
    .line 102
    .line 103
    iget-boolean p1, p0, Ldefpackage/kr;->h:Z

    .line 104
    .line 105
    iput-boolean p1, p2, Ldefpackage/jc0;->E:Z

    .line 106
    .line 107
    iget p1, p0, Ldefpackage/kr;->g:I

    .line 108
    .line 109
    iput p1, p2, Ldefpackage/jc0;->Z:I

    .line 110
    .line 111
    if-lez p1, :cond_6

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    move v3, v2

    .line 115
    :goto_4
    iput-boolean v3, p2, Ldefpackage/jc0;->E:Z

    .line 116
    .line 117
    iput v2, p0, Ldefpackage/kr;->j:I

    .line 118
    .line 119
    iget-boolean p0, p0, Ldefpackage/kr;->i:Z

    .line 120
    .line 121
    return p0
.end method

.method public l()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qp4;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public m(Ldefpackage/q92;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ua4;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ldefpackage/ua4;->run()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Ldefpackage/ua4;

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ldefpackage/ea2;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, Ldefpackage/ua4;-><init>(Ldefpackage/ea2;Ldefpackage/q92;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public n(Ljava/lang/CharSequence;IIIZLdefpackage/e01;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Ldefpackage/g01;

    .line 12
    .line 13
    iget-object v6, v0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Ldefpackage/na4;

    .line 16
    .line 17
    iget-object v6, v6, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Ldefpackage/zv2;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Ldefpackage/g01;-><init>(Ldefpackage/zv2;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_f

    .line 38
    .line 39
    if-ge v10, v3, :cond_f

    .line 40
    .line 41
    if-eqz v11, :cond_f

    .line 42
    .line 43
    iget-object v13, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v13, Ldefpackage/zv2;

    .line 46
    .line 47
    iget-object v13, v13, Ldefpackage/zv2;->a:Landroid/util/SparseArray;

    .line 48
    .line 49
    if-nez v13, :cond_1

    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v13

    .line 57
    check-cast v13, Ldefpackage/zv2;

    .line 58
    .line 59
    :goto_2
    iget v14, v5, Ldefpackage/g01;->a:I

    .line 60
    .line 61
    const/4 v15, 0x3

    .line 62
    if-eq v14, v12, :cond_3

    .line 63
    .line 64
    if-nez v13, :cond_2

    .line 65
    .line 66
    invoke-virtual {v5}, Ldefpackage/g01;->b()V

    .line 67
    .line 68
    .line 69
    :goto_3
    move v13, v8

    .line 70
    goto :goto_6

    .line 71
    :cond_2
    iput v12, v5, Ldefpackage/g01;->a:I

    .line 72
    .line 73
    iput-object v13, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 74
    .line 75
    iput v8, v5, Ldefpackage/g01;->c:I

    .line 76
    .line 77
    :goto_4
    move v13, v12

    .line 78
    goto :goto_6

    .line 79
    :cond_3
    if-eqz v13, :cond_4

    .line 80
    .line 81
    iput-object v13, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 82
    .line 83
    iget v13, v5, Ldefpackage/g01;->c:I

    .line 84
    .line 85
    add-int/2addr v13, v8

    .line 86
    iput v13, v5, Ldefpackage/g01;->c:I

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    const v13, 0xfe0e

    .line 90
    .line 91
    .line 92
    if-ne v9, v13, :cond_5

    .line 93
    .line 94
    invoke-virtual {v5}, Ldefpackage/g01;->b()V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const v13, 0xfe0f

    .line 99
    .line 100
    .line 101
    if-ne v9, v13, :cond_6

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_6
    iget-object v13, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v13, Ldefpackage/zv2;

    .line 107
    .line 108
    iget-object v14, v13, Ldefpackage/zv2;->b:Ldefpackage/k05;

    .line 109
    .line 110
    if-eqz v14, :cond_9

    .line 111
    .line 112
    iget v14, v5, Ldefpackage/g01;->c:I

    .line 113
    .line 114
    if-ne v14, v8, :cond_8

    .line 115
    .line 116
    invoke-virtual {v5}, Ldefpackage/g01;->c()Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-eqz v13, :cond_7

    .line 121
    .line 122
    iget-object v13, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v13, Ldefpackage/zv2;

    .line 125
    .line 126
    iput-object v13, v5, Ldefpackage/g01;->f:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v5}, Ldefpackage/g01;->b()V

    .line 129
    .line 130
    .line 131
    :goto_5
    move v13, v15

    .line 132
    goto :goto_6

    .line 133
    :cond_7
    invoke-virtual {v5}, Ldefpackage/g01;->b()V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    iput-object v13, v5, Ldefpackage/g01;->f:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v5}, Ldefpackage/g01;->b()V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    invoke-virtual {v5}, Ldefpackage/g01;->b()V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :goto_6
    iput v9, v5, Ldefpackage/g01;->b:I

    .line 148
    .line 149
    if-eq v13, v8, :cond_e

    .line 150
    .line 151
    if-eq v13, v12, :cond_c

    .line 152
    .line 153
    if-eq v13, v15, :cond_a

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_a
    if-nez p5, :cond_b

    .line 157
    .line 158
    iget-object v12, v5, Ldefpackage/g01;->f:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v12, Ldefpackage/zv2;

    .line 161
    .line 162
    iget-object v12, v12, Ldefpackage/zv2;->b:Ldefpackage/k05;

    .line 163
    .line 164
    invoke-virtual {v0, v1, v7, v6, v12}, Ldefpackage/qp4;->i(Ljava/lang/CharSequence;IILdefpackage/k05;)Z

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    if-nez v12, :cond_0

    .line 169
    .line 170
    :cond_b
    iget-object v11, v5, Ldefpackage/g01;->f:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v11, Ldefpackage/zv2;

    .line 173
    .line 174
    iget-object v11, v11, Ldefpackage/zv2;->b:Ldefpackage/k05;

    .line 175
    .line 176
    invoke-interface {v4, v1, v7, v6, v11}, Ldefpackage/e01;->b(Ljava/lang/CharSequence;IILdefpackage/k05;)Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    add-int/lit8 v10, v10, 0x1

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    add-int/2addr v12, v6

    .line 189
    if-ge v12, v2, :cond_d

    .line 190
    .line 191
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    move v9, v6

    .line 196
    :cond_d
    move v6, v12

    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    add-int/2addr v6, v7

    .line 208
    if-ge v6, v2, :cond_0

    .line 209
    .line 210
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    move v9, v7

    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_f
    iget v2, v5, Ldefpackage/g01;->a:I

    .line 218
    .line 219
    if-ne v2, v12, :cond_12

    .line 220
    .line 221
    iget-object v2, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v2, Ldefpackage/zv2;

    .line 224
    .line 225
    iget-object v2, v2, Ldefpackage/zv2;->b:Ldefpackage/k05;

    .line 226
    .line 227
    if-eqz v2, :cond_12

    .line 228
    .line 229
    iget v2, v5, Ldefpackage/g01;->c:I

    .line 230
    .line 231
    if-gt v2, v8, :cond_10

    .line 232
    .line 233
    invoke-virtual {v5}, Ldefpackage/g01;->c()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_12

    .line 238
    .line 239
    :cond_10
    if-ge v10, v3, :cond_12

    .line 240
    .line 241
    if-eqz v11, :cond_12

    .line 242
    .line 243
    if-nez p5, :cond_11

    .line 244
    .line 245
    iget-object v2, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v2, Ldefpackage/zv2;

    .line 248
    .line 249
    iget-object v2, v2, Ldefpackage/zv2;->b:Ldefpackage/k05;

    .line 250
    .line 251
    invoke-virtual {v0, v1, v7, v6, v2}, Ldefpackage/qp4;->i(Ljava/lang/CharSequence;IILdefpackage/k05;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_12

    .line 256
    .line 257
    :cond_11
    iget-object v0, v5, Ldefpackage/g01;->e:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Ldefpackage/zv2;

    .line 260
    .line 261
    iget-object v0, v0, Ldefpackage/zv2;->b:Ldefpackage/k05;

    .line 262
    .line 263
    invoke-interface {v4, v1, v7, v6, v0}, Ldefpackage/e01;->b(Ljava/lang/CharSequence;IILdefpackage/k05;)Z

    .line 264
    .line 265
    .line 266
    :cond_12
    invoke-interface {v4}, Ldefpackage/e01;->a()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/s24;

    .line 4
    .line 5
    new-instance v0, Ldefpackage/ps0;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-direct {v0, v1, p1, p2}, Ldefpackage/ps0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-static {p0, p1, p2, v0}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public p(Ldefpackage/kc0;III)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Ldefpackage/jc0;->a0:I

    .line 5
    .line 6
    iget v1, p1, Ldefpackage/jc0;->b0:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p1, Ldefpackage/jc0;->a0:I

    .line 10
    .line 11
    iput v2, p1, Ldefpackage/jc0;->b0:I

    .line 12
    .line 13
    invoke-virtual {p1, p3}, Ldefpackage/jc0;->K(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p4}, Ldefpackage/jc0;->H(I)V

    .line 17
    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    iput v2, p1, Ldefpackage/jc0;->a0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput v0, p1, Ldefpackage/jc0;->a0:I

    .line 25
    .line 26
    :goto_0
    if-gez v1, :cond_1

    .line 27
    .line 28
    iput v2, p1, Ldefpackage/jc0;->b0:I

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iput v1, p1, Ldefpackage/jc0;->b0:I

    .line 32
    .line 33
    :goto_1
    iget-object p0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ldefpackage/kc0;

    .line 36
    .line 37
    iput p2, p0, Ldefpackage/kc0;->s0:I

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/kc0;->Q()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public q(Ldefpackage/kc0;)V
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Ldefpackage/kc0;->p0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    const/4 v3, 0x1

    .line 17
    if-ge v2, v0, :cond_2

    .line 18
    .line 19
    iget-object v4, p1, Ldefpackage/kc0;->p0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ldefpackage/jc0;

    .line 26
    .line 27
    iget-object v5, v4, Ldefpackage/jc0;->o0:[I

    .line 28
    .line 29
    aget v6, v5, v1

    .line 30
    .line 31
    const/4 v7, 0x3

    .line 32
    if-eq v6, v7, :cond_0

    .line 33
    .line 34
    aget v3, v5, v3

    .line 35
    .line 36
    if-ne v3, v7, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p0, p1, Ldefpackage/kc0;->r0:Ldefpackage/xo0;

    .line 45
    .line 46
    iput-boolean v3, p0, Ldefpackage/xo0;->b:Z

    .line 47
    .line 48
    return-void
.end method
