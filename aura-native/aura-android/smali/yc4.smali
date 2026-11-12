.class public final Lyc4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final d:Ljava/util/Map;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lkd3;

    .line 2
    .line 3
    const-string v1, "audio/mpeg"

    .line 4
    .line 5
    const-string v2, "mp3"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lkd3;

    .line 11
    .line 12
    const-string v3, "audio/mp3"

    .line 13
    .line 14
    invoke-direct {v1, v3, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lkd3;

    .line 18
    .line 19
    const-string v3, "audio/mp4"

    .line 20
    .line 21
    const-string v4, "m4a"

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lkd3;

    .line 27
    .line 28
    const-string v5, "audio/x-m4a"

    .line 29
    .line 30
    invoke-direct {v3, v5, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v5, v4

    .line 34
    new-instance v4, Lkd3;

    .line 35
    .line 36
    const-string v6, "audio/m4a"

    .line 37
    .line 38
    invoke-direct {v4, v6, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v5, Lkd3;

    .line 42
    .line 43
    const-string v6, "audio/aac"

    .line 44
    .line 45
    const-string v7, "aac"

    .line 46
    .line 47
    invoke-direct {v5, v6, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Lkd3;

    .line 51
    .line 52
    const-string v7, "audio/flac"

    .line 53
    .line 54
    const-string v8, "flac"

    .line 55
    .line 56
    invoke-direct {v6, v7, v8}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v7, Lkd3;

    .line 60
    .line 61
    const-string v9, "audio/x-flac"

    .line 62
    .line 63
    invoke-direct {v7, v9, v8}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v8, Lkd3;

    .line 67
    .line 68
    const-string v9, "audio/ogg"

    .line 69
    .line 70
    const-string v10, "ogg"

    .line 71
    .line 72
    invoke-direct {v8, v9, v10}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v9, Lkd3;

    .line 76
    .line 77
    const-string v10, "audio/opus"

    .line 78
    .line 79
    const-string v11, "opus"

    .line 80
    .line 81
    invoke-direct {v9, v10, v11}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance v10, Lkd3;

    .line 85
    .line 86
    const-string v11, "audio/wav"

    .line 87
    .line 88
    const-string v12, "wav"

    .line 89
    .line 90
    invoke-direct {v10, v11, v12}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v11, Lkd3;

    .line 94
    .line 95
    const-string v13, "audio/x-wav"

    .line 96
    .line 97
    invoke-direct {v11, v13, v12}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v13, v12

    .line 101
    new-instance v12, Lkd3;

    .line 102
    .line 103
    const-string v14, "audio/wave"

    .line 104
    .line 105
    invoke-direct {v12, v14, v13}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    filled-new-array/range {v0 .. v12}, [Lkd3;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    sput-object v0, Lyc4;->d:Ljava/util/Map;

    .line 117
    .line 118
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyc4;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lyc4;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p2, p0, Lyc4;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyc4;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyc4;

    .line 10
    .line 11
    iget-object v0, p0, Lyc4;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lyc4;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lyc4;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, Lyc4;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-wide v0, p0, Lyc4;->c:J

    .line 34
    .line 35
    iget-wide p0, p1, Lyc4;->c:J

    .line 36
    .line 37
    cmp-long p0, v0, p0

    .line 38
    .line 39
    if-eqz p0, :cond_4

    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 44
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyc4;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lyc4;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v1, p0, Lyc4;->c:J

    .line 17
    .line 18
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", mime="

    .line 2
    .line 3
    const-string v1, ", size="

    .line 4
    .line 5
    const-string v2, "SharedFile(name="

    .line 6
    .line 7
    iget-object v3, p0, Lyc4;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lyc4;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ")"

    .line 16
    .line 17
    iget-wide v2, p0, Lyc4;->c:J

    .line 18
    .line 19
    invoke-static {v0, v2, v3, v1}, Lb11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
