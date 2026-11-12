.class public final Ldr0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[J

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Z

.field public f:Z

.field public g:Lll;

.field public h:I

.field public i:J

.field public final synthetic j:Ljr0;


# direct methods
.method public constructor <init>(Ljr0;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldr0;->j:Ljr0;

    .line 8
    .line 9
    iput-object p2, p0, Ldr0;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    new-array v0, p1, [J

    .line 16
    .line 17
    iput-object v0, p0, Ldr0;->b:[J

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ldr0;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Ldr0;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/16 p2, 0x2e

    .line 39
    .line 40
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    const/4 v1, 0x0

    .line 48
    :goto_0
    if-ge v1, p1, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Ldr0;->c:Ljava/util/ArrayList;

    .line 54
    .line 55
    iget-object v3, p0, Ldr0;->j:Ljr0;

    .line 56
    .line 57
    iget-object v3, v3, Ljr0;->n:Lge3;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v3, v4}, Lge3;->d(Ljava/lang/String;)Lge3;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    const-string v2, ".tmp"

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Ldr0;->d:Ljava/util/ArrayList;

    .line 76
    .line 77
    iget-object v3, p0, Ldr0;->j:Ljr0;

    .line 78
    .line 79
    iget-object v3, v3, Ljr0;->n:Lge3;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v3, v4}, Lge3;->d(Ljava/lang/String;)Lge3;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lfr0;
    .locals 9

    .line 1
    sget-object v0, Lze5;->a:Ltl1;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldr0;->e:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    iget-object v0, p0, Ldr0;->j:Ljr0;

    .line 9
    .line 10
    iget-boolean v1, v0, Ljr0;->y:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Ldr0;->g:Lll;

    .line 15
    .line 16
    if-nez v1, :cond_5

    .line 17
    .line 18
    iget-boolean v1, p0, Ldr0;->f:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ldr0;->b:[J

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v8, v1

    .line 35
    check-cast v8, [J

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    move v2, v1

    .line 39
    :goto_0
    const/4 v3, 0x2

    .line 40
    if-ge v2, v3, :cond_3

    .line 41
    .line 42
    :try_start_0
    iget-object v3, v0, Ljr0;->o:Lhr0;

    .line 43
    .line 44
    iget-object v4, p0, Ldr0;->c:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lge3;

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Lhr0;->k(Lge3;)Lej4;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-boolean v4, v0, Ljr0;->y:Z

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iget v4, p0, Ldr0;->h:I

    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    iput v4, p0, Ldr0;->h:I

    .line 66
    .line 67
    new-instance v4, Lcr0;

    .line 68
    .line 69
    invoke-direct {v4, v3, v0, p0}, Lcr0;-><init>(Lej4;Ljr0;Ldr0;)V

    .line 70
    .line 71
    .line 72
    move-object v3, v4

    .line 73
    :goto_1
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    new-instance v2, Lfr0;

    .line 80
    .line 81
    iget-object v3, p0, Ldr0;->j:Ljr0;

    .line 82
    .line 83
    iget-object v4, p0, Ldr0;->a:Ljava/lang/String;

    .line 84
    .line 85
    iget-wide v5, p0, Ldr0;->i:J

    .line 86
    .line 87
    invoke-direct/range {v2 .. v8}, Lfr0;-><init>(Ljr0;Ljava/lang/String;JLjava/util/ArrayList;[J)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :catch_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :goto_2
    if-ge v1, v2, :cond_4

    .line 96
    .line 97
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    check-cast v3, Lej4;

    .line 104
    .line 105
    invoke-static {v3}, Lxe5;->b(Ljava/io/Closeable;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    :try_start_1
    invoke-virtual {v0, p0}, Ljr0;->K(Ldr0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    .line 111
    .line 112
    :catch_1
    :cond_5
    :goto_3
    const/4 p0, 0x0

    .line 113
    return-object p0
.end method
