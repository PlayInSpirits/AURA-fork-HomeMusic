.class public final Ldefpackage/il;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final i:Ldefpackage/il;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Z

.field public final g:Z

.field public h:Landroid/media/AudioAttributes;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ldefpackage/il;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    move v2, v1

    .line 6
    move v4, v3

    .line 7
    move v5, v1

    .line 8
    move v6, v1

    .line 9
    move v7, v3

    .line 10
    invoke-direct/range {v0 .. v7}, Ldefpackage/il;-><init>(IIIIIZZ)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldefpackage/il;->i:Ldefpackage/il;

    .line 14
    .line 15
    sget-object v0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0x24

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Ldefpackage/il;->j:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Ldefpackage/il;->k:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Ldefpackage/il;->l:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Ldefpackage/il;->m:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Ldefpackage/il;->n:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v0, 0x5

    .line 55
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Ldefpackage/il;->o:Ljava/lang/String;

    .line 60
    .line 61
    const/4 v0, 0x6

    .line 62
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Ldefpackage/il;->p:Ljava/lang/String;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(IIIIIZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldefpackage/il;->a:I

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/il;->b:I

    .line 7
    .line 8
    iput p3, p0, Ldefpackage/il;->c:I

    .line 9
    .line 10
    iput p4, p0, Ldefpackage/il;->d:I

    .line 11
    .line 12
    iput p5, p0, Ldefpackage/il;->e:I

    .line 13
    .line 14
    iput-boolean p6, p0, Ldefpackage/il;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Ldefpackage/il;->g:Z

    .line 17
    .line 18
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Ldefpackage/il;
    .locals 11

    .line 1
    sget-object v0, Ldefpackage/il;->j:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    move v4, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v4, v2

    .line 17
    :goto_0
    sget-object v0, Ldefpackage/il;->k:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    move v5, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v2

    .line 32
    :goto_1
    sget-object v0, Ldefpackage/il;->l:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    move v6, v0

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v6, v3

    .line 48
    :goto_2
    sget-object v0, Ldefpackage/il;->m:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    move v7, v0

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move v7, v3

    .line 63
    :goto_3
    sget-object v0, Ldefpackage/il;->n:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    move v8, v0

    .line 76
    goto :goto_4

    .line 77
    :cond_4
    move v8, v2

    .line 78
    :goto_4
    sget-object v0, Ldefpackage/il;->o:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    :cond_5
    move v9, v2

    .line 91
    sget-object v0, Ldefpackage/il;->p:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    :cond_6
    move v10, v3

    .line 104
    new-instance v3, Ldefpackage/il;

    .line 105
    .line 106
    invoke-direct/range {v3 .. v10}, Ldefpackage/il;-><init>(IIIIIZZ)V

    .line 107
    .line 108
    .line 109
    return-object v3
.end method

.method public static b(Landroid/media/AudioAttributes;)Ldefpackage/il;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getContentType()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getFlags()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getUsage()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v4, 0x1d

    .line 16
    .line 17
    if-lt v0, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Ldefpackage/z9;->a(Landroid/media/AudioAttributes;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-static {p0}, Ldefpackage/z9;->v(Landroid/media/AudioAttributes;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    move v7, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x1

    .line 30
    move v7, v4

    .line 31
    :goto_0
    const/16 v5, 0x20

    .line 32
    .line 33
    if-lt v0, v5, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Ldefpackage/m3;->a(Landroid/media/AudioAttributes;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {p0}, Ldefpackage/m3;->j(Landroid/media/AudioAttributes;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    move v6, p0

    .line 44
    move v5, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    move v5, v0

    .line 48
    move v6, v5

    .line 49
    :goto_1
    new-instance v0, Ldefpackage/il;

    .line 50
    .line 51
    invoke-direct/range {v0 .. v7}, Ldefpackage/il;-><init>(IIIIIZZ)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method


# virtual methods
.method public final c()Landroid/media/AudioAttributes;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/il;->h:Landroid/media/AudioAttributes;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Ldefpackage/il;->a:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Ldefpackage/il;->b:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v1, p0, Ldefpackage/il;->c:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v2, 0x1d

    .line 31
    .line 32
    if-lt v1, v2, :cond_0

    .line 33
    .line 34
    iget v2, p0, Ldefpackage/il;->d:I

    .line 35
    .line 36
    invoke-static {v0, v2}, Ldefpackage/z9;->k(Landroid/media/AudioAttributes$Builder;I)V

    .line 37
    .line 38
    .line 39
    iget-boolean v2, p0, Ldefpackage/il;->g:Z

    .line 40
    .line 41
    invoke-static {v0, v2}, Ldefpackage/z9;->l(Landroid/media/AudioAttributes$Builder;Z)V

    .line 42
    .line 43
    .line 44
    :cond_0
    const/16 v2, 0x20

    .line 45
    .line 46
    if-lt v1, v2, :cond_1

    .line 47
    .line 48
    iget v1, p0, Ldefpackage/il;->e:I

    .line 49
    .line 50
    invoke-static {v0, v1}, Ldefpackage/m3;->f(Landroid/media/AudioAttributes$Builder;I)V

    .line 51
    .line 52
    .line 53
    iget-boolean v1, p0, Ldefpackage/il;->f:Z

    .line 54
    .line 55
    invoke-static {v0, v1}, Ldefpackage/m3;->g(Landroid/media/AudioAttributes$Builder;Z)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Ldefpackage/il;->h:Landroid/media/AudioAttributes;

    .line 63
    .line 64
    :cond_2
    iget-object p0, p0, Ldefpackage/il;->h:Landroid/media/AudioAttributes;

    .line 65
    .line 66
    return-object p0
.end method

.method public final d()Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Ldefpackage/il;->a:I

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v2, Ldefpackage/il;->j:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v1, p0, Ldefpackage/il;->b:I

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    sget-object v2, Ldefpackage/il;->k:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    iget v2, p0, Ldefpackage/il;->c:I

    .line 26
    .line 27
    if-eq v2, v1, :cond_2

    .line 28
    .line 29
    sget-object v3, Ldefpackage/il;->l:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    iget v2, p0, Ldefpackage/il;->d:I

    .line 35
    .line 36
    if-eq v2, v1, :cond_3

    .line 37
    .line 38
    sget-object v1, Ldefpackage/il;->m:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    :cond_3
    iget v1, p0, Ldefpackage/il;->e:I

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    sget-object v2, Ldefpackage/il;->n:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    :cond_4
    iget-boolean v1, p0, Ldefpackage/il;->f:Z

    .line 53
    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    sget-object v2, Ldefpackage/il;->o:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    :cond_5
    iget-boolean p0, p0, Ldefpackage/il;->g:Z

    .line 62
    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    sget-object v1, Ldefpackage/il;->p:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    :cond_6
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Ldefpackage/il;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Ldefpackage/il;

    .line 18
    .line 19
    iget v2, p0, Ldefpackage/il;->a:I

    .line 20
    .line 21
    iget v3, p1, Ldefpackage/il;->a:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget v2, p0, Ldefpackage/il;->b:I

    .line 26
    .line 27
    iget v3, p1, Ldefpackage/il;->b:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    iget v2, p0, Ldefpackage/il;->c:I

    .line 32
    .line 33
    iget v3, p1, Ldefpackage/il;->c:I

    .line 34
    .line 35
    if-ne v2, v3, :cond_2

    .line 36
    .line 37
    iget v2, p0, Ldefpackage/il;->d:I

    .line 38
    .line 39
    iget v3, p1, Ldefpackage/il;->d:I

    .line 40
    .line 41
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    iget v2, p0, Ldefpackage/il;->e:I

    .line 44
    .line 45
    iget v3, p1, Ldefpackage/il;->e:I

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    iget-boolean v2, p0, Ldefpackage/il;->f:Z

    .line 50
    .line 51
    iget-boolean v3, p1, Ldefpackage/il;->f:Z

    .line 52
    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    iget-boolean p0, p0, Ldefpackage/il;->g:Z

    .line 56
    .line 57
    iget-boolean p1, p1, Ldefpackage/il;->g:Z

    .line 58
    .line 59
    if-ne p0, p1, :cond_2

    .line 60
    .line 61
    return v0

    .line 62
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const/16 v0, 0x20f

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/il;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, Ldefpackage/il;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget v1, p0, Ldefpackage/il;->c:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget v1, p0, Ldefpackage/il;->d:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget v1, p0, Ldefpackage/il;->e:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-boolean v1, p0, Ldefpackage/il;->f:Z

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    mul-int/lit8 v0, v0, 0x1f

    .line 32
    .line 33
    iget-boolean p0, p0, Ldefpackage/il;->g:Z

    .line 34
    .line 35
    add-int/2addr v0, p0

    .line 36
    return v0
.end method
