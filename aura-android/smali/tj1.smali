.class final Ltj1;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:F

.field public final b:J

.field public final c:Lac4;

.field public final d:J

.field public final e:J

.field public final f:Lm62;


# direct methods
.method public constructor <init>(FJLac4;JJLm62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltj1;->a:F

    .line 5
    .line 6
    iput-wide p2, p0, Ltj1;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Ltj1;->c:Lac4;

    .line 9
    .line 10
    iput-wide p5, p0, Ltj1;->d:J

    .line 11
    .line 12
    iput-wide p7, p0, Ltj1;->e:J

    .line 13
    .line 14
    iput-object p9, p0, Ltj1;->f:Lm62;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 3

    .line 1
    new-instance v0, Lwe4;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput v1, v0, Lwe4;->B:F

    .line 9
    .line 10
    iput v1, v0, Lwe4;->C:F

    .line 11
    .line 12
    iget v1, p0, Ltj1;->a:F

    .line 13
    .line 14
    iput v1, v0, Lwe4;->D:F

    .line 15
    .line 16
    const/high16 v1, 0x41000000    # 8.0f

    .line 17
    .line 18
    iput v1, v0, Lwe4;->E:F

    .line 19
    .line 20
    iget-wide v1, p0, Ltj1;->b:J

    .line 21
    .line 22
    iput-wide v1, v0, Lwe4;->F:J

    .line 23
    .line 24
    iget-object v1, p0, Ltj1;->c:Lac4;

    .line 25
    .line 26
    iput-object v1, v0, Lwe4;->G:Lac4;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lwe4;->H:Z

    .line 30
    .line 31
    iget-wide v1, p0, Ltj1;->d:J

    .line 32
    .line 33
    iput-wide v1, v0, Lwe4;->I:J

    .line 34
    .line 35
    iget-wide v1, p0, Ltj1;->e:J

    .line 36
    .line 37
    iput-wide v1, v0, Lwe4;->J:J

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    iput v1, v0, Lwe4;->K:I

    .line 41
    .line 42
    iget-object p0, p0, Ltj1;->f:Lm62;

    .line 43
    .line 44
    iput-object p0, v0, Lwe4;->L:Lm62;

    .line 45
    .line 46
    new-instance p0, Lkl3;

    .line 47
    .line 48
    const/16 v1, 0x9

    .line 49
    .line 50
    invoke-direct {p0, v1, v0}, Lkl3;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p0, v0, Lwe4;->M:Lkl3;

    .line 54
    .line 55
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 3

    .line 1
    check-cast p1, Lwe4;

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput v0, p1, Lwe4;->B:F

    .line 6
    .line 7
    iput v0, p1, Lwe4;->C:F

    .line 8
    .line 9
    iget v0, p0, Ltj1;->a:F

    .line 10
    .line 11
    iput v0, p1, Lwe4;->D:F

    .line 12
    .line 13
    const/high16 v0, 0x41000000    # 8.0f

    .line 14
    .line 15
    iput v0, p1, Lwe4;->E:F

    .line 16
    .line 17
    iget-wide v0, p0, Ltj1;->b:J

    .line 18
    .line 19
    iput-wide v0, p1, Lwe4;->F:J

    .line 20
    .line 21
    iget-object v0, p0, Ltj1;->c:Lac4;

    .line 22
    .line 23
    iput-object v0, p1, Lwe4;->G:Lac4;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p1, Lwe4;->H:Z

    .line 27
    .line 28
    iget-wide v1, p0, Ltj1;->d:J

    .line 29
    .line 30
    iput-wide v1, p1, Lwe4;->I:J

    .line 31
    .line 32
    iget-wide v1, p0, Ltj1;->e:J

    .line 33
    .line 34
    iput-wide v1, p1, Lwe4;->J:J

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iput v1, p1, Lwe4;->K:I

    .line 38
    .line 39
    iget-object p0, p0, Ltj1;->f:Lm62;

    .line 40
    .line 41
    iput-object p0, p1, Lwe4;->L:Lm62;

    .line 42
    .line 43
    iget-object p0, p1, Lwe4;->M:Lkl3;

    .line 44
    .line 45
    iget-object v1, p1, Lcx2;->n:Lcx2;

    .line 46
    .line 47
    iget-boolean v1, v1, Lcx2;->A:Z

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v1, 0x2

    .line 53
    invoke-static {p1, v1}, Lj51;->M(Leo0;I)Lf63;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p1, p1, Lf63;->I:Lf63;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1, p0, v0}, Lf63;->Y0(Lif1;Z)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Ltj1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, Ltj1;

    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_2
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_3
    iget v0, p0, Ltj1;->a:F

    .line 33
    .line 34
    iget v2, p1, Ltj1;->a:F

    .line 35
    .line 36
    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :cond_4
    const/4 v0, 0x0

    .line 45
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_a

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_a
    const/high16 v0, 0x41000000    # 8.0f

    .line 89
    .line 90
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_b

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_b
    iget-wide v2, p1, Ltj1;->b:J

    .line 98
    .line 99
    sget v0, Ltw4;->b:I

    .line 100
    .line 101
    iget-wide v4, p0, Ltj1;->b:J

    .line 102
    .line 103
    cmp-long v0, v4, v2

    .line 104
    .line 105
    if-nez v0, :cond_10

    .line 106
    .line 107
    iget-object v0, p0, Ltj1;->c:Lac4;

    .line 108
    .line 109
    iget-object v2, p1, Ltj1;->c:Lac4;

    .line 110
    .line 111
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_c

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_c
    iget-wide v2, p0, Ltj1;->d:J

    .line 119
    .line 120
    iget-wide v4, p1, Ltj1;->d:J

    .line 121
    .line 122
    invoke-static {v2, v3, v4, v5}, Lx40;->c(JJ)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_d

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_d
    iget-wide v2, p0, Ltj1;->e:J

    .line 130
    .line 131
    iget-wide v4, p1, Ltj1;->e:J

    .line 132
    .line 133
    invoke-static {v2, v3, v4, v5}, Lx40;->c(JJ)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_e

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_e
    iget-object p0, p0, Ltj1;->f:Lm62;

    .line 141
    .line 142
    iget-object p1, p1, Ltj1;->f:Lm62;

    .line 143
    .line 144
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-nez p0, :cond_f

    .line 149
    .line 150
    :goto_0
    return v1

    .line 151
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 152
    return p0

    .line 153
    :cond_10
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    mul-int/2addr v1, v2

    .line 10
    invoke-static {v1, v0, v2}, Lb11;->d(IFI)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Ltj1;->a:F

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/high16 v1, 0x41000000    # 8.0f

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sget v1, Ltw4;->b:I

    .line 52
    .line 53
    iget-wide v3, p0, Ltj1;->b:J

    .line 54
    .line 55
    invoke-static {v0, v2, v3, v4}, Lxa3;->b(IIJ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Ltj1;->c:Lac4;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/2addr v1, v0

    .line 66
    mul-int/2addr v1, v2

    .line 67
    const/16 v0, 0x3c1

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-static {v1, v0, v3}, Lxa3;->c(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    sget v3, Lx40;->h:I

    .line 75
    .line 76
    iget-wide v3, p0, Ltj1;->d:J

    .line 77
    .line 78
    invoke-static {v1, v2, v3, v4}, Lxa3;->b(IIJ)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iget-wide v3, p0, Ltj1;->e:J

    .line 83
    .line 84
    invoke-static {v1, v2, v3, v4}, Lxa3;->b(IIJ)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-static {v3, v1, v2}, Lf34;->d(III)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    const/4 v2, 0x3

    .line 94
    invoke-static {v2, v1, v0}, Lf34;->d(III)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object p0, p0, Ltj1;->f:Lm62;

    .line 99
    .line 100
    invoke-virtual {p0}, Lm62;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    add-int/2addr p0, v0

    .line 105
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, Ltw4;->b:I

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "TransformOrigin(packedValue="

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-wide v1, p0, Ltj1;->b:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ")"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-wide v2, p0, Ltj1;->d:J

    .line 25
    .line 26
    invoke-static {v2, v3}, Lx40;->h(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-wide v3, p0, Ltj1;->e:J

    .line 31
    .line 32
    invoke-static {v3, v4}, Lx40;->h(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const/4 v4, 0x3

    .line 37
    invoke-static {v4}, Le35;->X(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-instance v5, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v6, "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha="

    .line 44
    .line 45
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget v6, p0, Ltj1;->a:F

    .line 49
    .line 50
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v6, ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin="

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ", shape="

    .line 62
    .line 63
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Ltj1;->c:Lac4;

    .line 67
    .line 68
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", clip=true, renderEffect=null, ambientShadowColor="

    .line 72
    .line 73
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v0, ", spotShadowColor="

    .line 80
    .line 81
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, ", compositingStrategy=CompositingStrategy(value=0), blendMode="

    .line 85
    .line 86
    const-string v2, ", colorFilter=null, outsets="

    .line 87
    .line 88
    invoke-static {v5, v3, v0, v4, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, Ltj1;->f:Lm62;

    .line 92
    .line 93
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method
