.class public final Lwe4;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lu62;
.implements Lg94;


# instance fields
.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:J

.field public G:Lac4;

.field public H:Z

.field public I:J

.field public J:J

.field public K:I

.field public L:Lm62;

.field public M:Lkl3;


# virtual methods
.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final c0(Lq94;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwe4;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lwe4;->G:Lac4;

    .line 7
    .line 8
    invoke-static {p1, p0}, Lo94;->b(Lq94;Lac4;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final r(Lcf2;Lpi2;J)Lvi2;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Lpi2;->r(J)Ljg3;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Ljg3;->n:I

    .line 6
    .line 7
    iget p4, p2, Ljg3;->o:I

    .line 8
    .line 9
    new-instance v0, Lo;

    .line 10
    .line 11
    const/16 v1, 0x1c

    .line 12
    .line 13
    invoke-direct {v0, v1, p2, p0}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lv01;->n:Lv01;

    .line 17
    .line 18
    invoke-interface {p1, p3, p4, p0, v0}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    .line 1
    iget v0, p0, Lwe4;->B:F

    .line 2
    .line 3
    iget v1, p0, Lwe4;->C:F

    .line 4
    .line 5
    iget v2, p0, Lwe4;->D:F

    .line 6
    .line 7
    iget v3, p0, Lwe4;->E:F

    .line 8
    .line 9
    iget-wide v4, p0, Lwe4;->F:J

    .line 10
    .line 11
    sget v6, Ltw4;->b:I

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "TransformOrigin(packedValue="

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v4, ")"

    .line 24
    .line 25
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, p0, Lwe4;->G:Lac4;

    .line 33
    .line 34
    iget-boolean v7, p0, Lwe4;->H:Z

    .line 35
    .line 36
    iget-wide v8, p0, Lwe4;->I:J

    .line 37
    .line 38
    invoke-static {v8, v9}, Lx40;->h(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    iget-wide v9, p0, Lwe4;->J:J

    .line 43
    .line 44
    invoke-static {v9, v10}, Lx40;->h(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    iget v10, p0, Lwe4;->K:I

    .line 49
    .line 50
    invoke-static {v10}, Le35;->X(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    iget-object p0, p0, Lwe4;->L:Lm62;

    .line 55
    .line 56
    const-string v11, ", scaleY="

    .line 57
    .line 58
    const-string v12, ", alpha = "

    .line 59
    .line 60
    const-string v13, "SimpleGraphicsLayerModifier(scaleX="

    .line 61
    .line 62
    invoke-static {v13, v0, v11, v1, v12}, Lb11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance="

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", transformOrigin="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", shape="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", clip="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", renderEffect=null, ambientShadowColor="

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v1, ", spotShadowColor="

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", compositingStrategy=CompositingStrategy(value=0), blendMode="

    .line 115
    .line 116
    const-string v2, ", colorFilter=nulloutsets="

    .line 117
    .line 118
    invoke-static {v0, v9, v1, v10, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method
