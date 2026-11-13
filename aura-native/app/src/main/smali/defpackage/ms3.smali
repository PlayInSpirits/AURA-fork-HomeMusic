.class public final synthetic Ldefpackage/ms3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Ldefpackage/ms3;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/ns3;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Ldefpackage/ms3;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p1, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-wide p0, Ldefpackage/bt4;->c:J

    .line 10
    .line 11
    new-instance v0, Ldefpackage/bt4;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Ldefpackage/bt4;-><init>(J)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    check-cast v0, Ljava/lang/Float;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v0, v1

    .line 34
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v2, Ldefpackage/s54;->w:Ldefpackage/r54;

    .line 47
    .line 48
    invoke-static {p1, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object p0, v2, Ldefpackage/r54;->o:Ldefpackage/if1;

    .line 54
    .line 55
    invoke-interface {p0, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    move-object v1, p0

    .line 60
    check-cast v1, Ldefpackage/ct4;

    .line 61
    .line 62
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-wide p0, v1, Ldefpackage/ct4;->a:J

    .line 66
    .line 67
    invoke-static {p0, p1, v0}, Ldefpackage/su3;->z(JF)J

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    new-instance v0, Ldefpackage/bt4;

    .line 72
    .line 73
    invoke-direct {v0, p0, p1}, Ldefpackage/bt4;-><init>(J)V

    .line 74
    .line 75
    .line 76
    return-object v0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/util/List;

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v0

    .line 18
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v1, Ldefpackage/s54;->i:Ldefpackage/xc5;

    .line 27
    .line 28
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-static {p1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object v0, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ldefpackage/if1;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    move-object v0, p1

    .line 48
    check-cast v0, Ldefpackage/os4;

    .line 49
    .line 50
    :cond_2
    :goto_1
    new-instance p1, Ldefpackage/gb2;

    .line 51
    .line 52
    invoke-direct {p1, p0, v0}, Ldefpackage/gb2;-><init>(Ljava/lang/String;Ldefpackage/os4;)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p1, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    new-instance p0, Ldefpackage/g83;

    .line 10
    .line 11
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Ldefpackage/g83;-><init>(J)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v0, 0x0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    check-cast p0, Ljava/lang/Float;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p0, v0

    .line 37
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    move-object v0, p1

    .line 52
    check-cast v0, Ljava/lang/Float;

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    int-to-long v0, p0

    .line 66
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    int-to-long p0, p0

    .line 71
    const/16 v2, 0x20

    .line 72
    .line 73
    shl-long/2addr v0, v2

    .line 74
    const-wide v2, 0xffffffffL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long/2addr p0, v2

    .line 80
    or-long/2addr p0, v0

    .line 81
    new-instance v0, Ldefpackage/g83;

    .line 82
    .line 83
    invoke-direct {v0, p0, p1}, Ldefpackage/g83;-><init>(J)V

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/util/List;

    .line 5
    .line 6
    new-instance p0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_2

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget-object v3, Ldefpackage/s54;->z:Ldefpackage/xc5;

    .line 27
    .line 28
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-static {v2, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    if-eqz v2, :cond_1

    .line 39
    .line 40
    iget-object v3, v3, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ldefpackage/if1;

    .line 43
    .line 44
    invoke-interface {v3, v2}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    move-object v5, v2

    .line 49
    check-cast v5, Ldefpackage/ud2;

    .line 50
    .line 51
    :cond_1
    :goto_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance p1, Ldefpackage/vd2;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Ldefpackage/vd2;-><init>(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    return-object p1
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance p0, Ldefpackage/ud2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "und"

    .line 17
    .line 18
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, "The language tag "

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, " is not well-formed. Locale is resolved to Undetermined. Note that underscore \'_\' is not a valid subtag delimiter and must be replaced with \'-\'."

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-direct {p0, v0}, Ldefpackage/ud2;-><init>(Ljava/util/Locale;)V

    .line 49
    .line 50
    .line 51
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/util/List;

    .line 5
    .line 6
    new-instance p0, Ldefpackage/ra2;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget v1, Ldefpackage/oa2;->b:F

    .line 14
    .line 15
    sget-object v1, Ldefpackage/s54;->B:Ldefpackage/r54;

    .line 16
    .line 17
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Ldefpackage/r54;->o:Ldefpackage/if1;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ldefpackage/oa2;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v0, v3

    .line 35
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget v0, v0, Ldefpackage/oa2;->a:F

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v4, Ldefpackage/s54;->C:Ldefpackage/r54;

    .line 46
    .line 47
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object v4, v4, Ldefpackage/r54;->o:Ldefpackage/if1;

    .line 53
    .line 54
    invoke-interface {v4, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ldefpackage/qa2;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v1, v3

    .line 62
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget v1, v1, Ldefpackage/qa2;->a:I

    .line 66
    .line 67
    const/4 v4, 0x2

    .line 68
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    sget-object v4, Ldefpackage/s54;->D:Ldefpackage/r54;

    .line 73
    .line 74
    invoke-static {p1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    iget-object v2, v4, Ldefpackage/r54;->o:Ldefpackage/if1;

    .line 80
    .line 81
    invoke-interface {v2, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    move-object v3, p1

    .line 86
    check-cast v3, Ldefpackage/pa2;

    .line 87
    .line 88
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget p1, v3, Ldefpackage/pa2;->a:I

    .line 92
    .line 93
    invoke-direct {p0, v1, v0, p1}, Ldefpackage/ra2;-><init>(IFI)V

    .line 94
    .line 95
    .line 96
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 62

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ldefpackage/ms3;->n:I

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    packed-switch v2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-object v0, v1

    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    check-cast v1, Ldefpackage/je;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x0

    .line 30
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v2, Ljava/lang/Integer;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v2, 0x0

    .line 43
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    check-cast v3, Ljava/lang/Integer;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/4 v3, 0x0

    .line 60
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/4 v4, 0x4

    .line 68
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    const/4 v4, 0x0

    .line 78
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    packed-switch v1, :pswitch_data_1

    .line 86
    .line 87
    .line 88
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 89
    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    goto/16 :goto_c

    .line 93
    .line 94
    :pswitch_0
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    move-object v6, v0

    .line 101
    check-cast v6, Ljava/lang/String;

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    const/4 v6, 0x0

    .line 105
    :goto_4
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v0, Ldefpackage/ge;

    .line 109
    .line 110
    new-instance v1, Ldefpackage/om4;

    .line 111
    .line 112
    invoke-direct {v1, v6}, Ldefpackage/om4;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, v2, v3, v1, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :goto_5
    move-object v6, v0

    .line 119
    goto/16 :goto_c

    .line 120
    .line 121
    :pswitch_1
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget-object v1, Ldefpackage/s54;->f:Ldefpackage/xc5;

    .line 126
    .line 127
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-static {v0, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_6

    .line 134
    .line 135
    :cond_5
    const/4 v6, 0x0

    .line 136
    goto :goto_6

    .line 137
    :cond_6
    if-eqz v0, :cond_5

    .line 138
    .line 139
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Ldefpackage/if1;

    .line 142
    .line 143
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    move-object v6, v0

    .line 148
    check-cast v6, Ldefpackage/gb2;

    .line 149
    .line 150
    :goto_6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance v0, Ldefpackage/ge;

    .line 154
    .line 155
    invoke-direct {v0, v2, v3, v6, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_5

    .line 159
    :pswitch_2
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, Ldefpackage/s54;->e:Ldefpackage/xc5;

    .line 164
    .line 165
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-static {v0, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_8

    .line 172
    .line 173
    :cond_7
    const/4 v6, 0x0

    .line 174
    goto :goto_7

    .line 175
    :cond_8
    if-eqz v0, :cond_7

    .line 176
    .line 177
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Ldefpackage/if1;

    .line 180
    .line 181
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    move-object v6, v0

    .line 186
    check-cast v6, Ldefpackage/hb2;

    .line 187
    .line 188
    :goto_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v0, Ldefpackage/ge;

    .line 192
    .line 193
    invoke-direct {v0, v2, v3, v6, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :pswitch_3
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    sget-object v1, Ldefpackage/s54;->d:Ldefpackage/xc5;

    .line 202
    .line 203
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-static {v0, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_a

    .line 210
    .line 211
    :cond_9
    const/4 v6, 0x0

    .line 212
    goto :goto_8

    .line 213
    :cond_a
    if-eqz v0, :cond_9

    .line 214
    .line 215
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v1, Ldefpackage/if1;

    .line 218
    .line 219
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    move-object v6, v0

    .line 224
    check-cast v6, Ldefpackage/v25;

    .line 225
    .line 226
    :goto_8
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v0, Ldefpackage/ge;

    .line 230
    .line 231
    invoke-direct {v0, v2, v3, v6, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :pswitch_4
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sget-object v1, Ldefpackage/s54;->c:Ldefpackage/xc5;

    .line 240
    .line 241
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-static {v0, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-eqz v5, :cond_c

    .line 248
    .line 249
    :cond_b
    const/4 v6, 0x0

    .line 250
    goto :goto_9

    .line 251
    :cond_c
    if-eqz v0, :cond_b

    .line 252
    .line 253
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v1, Ldefpackage/if1;

    .line 256
    .line 257
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    move-object v6, v0

    .line 262
    check-cast v6, Ldefpackage/p45;

    .line 263
    .line 264
    :goto_9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance v0, Ldefpackage/ge;

    .line 268
    .line 269
    invoke-direct {v0, v2, v3, v6, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_5

    .line 273
    .line 274
    :pswitch_5
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    sget-object v1, Ldefpackage/s54;->h:Ldefpackage/xc5;

    .line 279
    .line 280
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 281
    .line 282
    invoke-static {v0, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-eqz v5, :cond_e

    .line 287
    .line 288
    :cond_d
    const/4 v6, 0x0

    .line 289
    goto :goto_a

    .line 290
    :cond_e
    if-eqz v0, :cond_d

    .line 291
    .line 292
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v1, Ldefpackage/if1;

    .line 295
    .line 296
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    move-object v6, v0

    .line 301
    check-cast v6, Ldefpackage/ij4;

    .line 302
    .line 303
    :goto_a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance v0, Ldefpackage/ge;

    .line 307
    .line 308
    invoke-direct {v0, v2, v3, v6, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    goto/16 :goto_5

    .line 312
    .line 313
    :pswitch_6
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    sget-object v1, Ldefpackage/s54;->g:Ldefpackage/xc5;

    .line 318
    .line 319
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-static {v0, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-eqz v5, :cond_10

    .line 326
    .line 327
    :cond_f
    const/4 v6, 0x0

    .line 328
    goto :goto_b

    .line 329
    :cond_10
    if-eqz v0, :cond_f

    .line 330
    .line 331
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v1, Ldefpackage/if1;

    .line 334
    .line 335
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    move-object v6, v0

    .line 340
    check-cast v6, Ldefpackage/sd3;

    .line 341
    .line 342
    :goto_b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    new-instance v0, Ldefpackage/ge;

    .line 346
    .line 347
    invoke-direct {v0, v2, v3, v6, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_5

    .line 351
    .line 352
    :goto_c
    return-object v6

    .line 353
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-object v0, v1

    .line 357
    check-cast v0, Ljava/lang/Integer;

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    new-instance v1, Ldefpackage/qa2;

    .line 364
    .line 365
    invoke-direct {v1, v0}, Ldefpackage/qa2;-><init>(I)V

    .line 366
    .line 367
    .line 368
    return-object v1

    .line 369
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-object v0, v1

    .line 373
    check-cast v0, Ljava/lang/Float;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    invoke-static {v0}, Ldefpackage/oa2;->a(F)V

    .line 380
    .line 381
    .line 382
    new-instance v1, Ldefpackage/oa2;

    .line 383
    .line 384
    invoke-direct {v1, v0}, Ldefpackage/oa2;-><init>(F)V

    .line 385
    .line 386
    .line 387
    return-object v1

    .line 388
    :pswitch_9
    invoke-direct/range {p0 .. p1}, Ldefpackage/ms3;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    return-object v0

    .line 393
    :pswitch_a
    invoke-direct/range {p0 .. p1}, Ldefpackage/ms3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :pswitch_b
    invoke-direct/range {p0 .. p1}, Ldefpackage/ms3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    return-object v0

    .line 403
    :pswitch_c
    invoke-direct/range {p0 .. p1}, Ldefpackage/ms3;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    return-object v0

    .line 408
    :pswitch_d
    invoke-direct/range {p0 .. p1}, Ldefpackage/ms3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    return-object v0

    .line 413
    :pswitch_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_11

    .line 422
    .line 423
    new-instance v0, Ldefpackage/ct4;

    .line 424
    .line 425
    const-wide v1, 0x200000000L

    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    invoke-direct {v0, v1, v2}, Ldefpackage/ct4;-><init>(J)V

    .line 431
    .line 432
    .line 433
    goto :goto_d

    .line 434
    :cond_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-static {v1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_12

    .line 443
    .line 444
    new-instance v0, Ldefpackage/ct4;

    .line 445
    .line 446
    const-wide v1, 0x100000000L

    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    invoke-direct {v0, v1, v2}, Ldefpackage/ct4;-><init>(J)V

    .line 452
    .line 453
    .line 454
    goto :goto_d

    .line 455
    :cond_12
    new-instance v0, Ldefpackage/ct4;

    .line 456
    .line 457
    const-wide/16 v1, 0x0

    .line 458
    .line 459
    invoke-direct {v0, v1, v2}, Ldefpackage/ct4;-><init>(J)V

    .line 460
    .line 461
    .line 462
    :goto_d
    return-object v0

    .line 463
    :pswitch_f
    invoke-direct/range {p0 .. p1}, Ldefpackage/ms3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0

    .line 468
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    move-object v0, v1

    .line 472
    check-cast v0, Ljava/lang/Integer;

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    new-instance v1, Ldefpackage/fb1;

    .line 479
    .line 480
    invoke-direct {v1, v0}, Ldefpackage/fb1;-><init>(I)V

    .line 481
    .line 482
    .line 483
    return-object v1

    .line 484
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    move-object v0, v1

    .line 488
    check-cast v0, Ljava/lang/Integer;

    .line 489
    .line 490
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    new-instance v1, Ldefpackage/eb1;

    .line 495
    .line 496
    invoke-direct {v1, v0}, Ldefpackage/eb1;-><init>(I)V

    .line 497
    .line 498
    .line 499
    return-object v1

    .line 500
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    move-object v0, v1

    .line 504
    check-cast v0, Ljava/util/List;

    .line 505
    .line 506
    new-instance v1, Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 513
    .line 514
    .line 515
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    :goto_e
    if-ge v7, v2, :cond_15

    .line 520
    .line 521
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    sget-object v4, Ldefpackage/s54;->b:Ldefpackage/xc5;

    .line 526
    .line 527
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 528
    .line 529
    invoke-static {v3, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    if-eqz v5, :cond_14

    .line 534
    .line 535
    :cond_13
    const/4 v3, 0x0

    .line 536
    goto :goto_f

    .line 537
    :cond_14
    if-eqz v3, :cond_13

    .line 538
    .line 539
    iget-object v4, v4, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v4, Ldefpackage/if1;

    .line 542
    .line 543
    invoke-interface {v4, v3}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    check-cast v3, Ldefpackage/ge;

    .line 548
    .line 549
    :goto_f
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    add-int/lit8 v7, v7, 0x1

    .line 556
    .line 557
    goto :goto_e

    .line 558
    :cond_15
    return-object v1

    .line 559
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    move-object v0, v1

    .line 563
    check-cast v0, Ljava/lang/Integer;

    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    new-instance v1, Ldefpackage/du1;

    .line 570
    .line 571
    invoke-direct {v1, v0}, Ldefpackage/du1;-><init>(I)V

    .line 572
    .line 573
    .line 574
    return-object v1

    .line 575
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    move-object v0, v1

    .line 579
    check-cast v0, Ljava/lang/Integer;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    new-instance v1, Ldefpackage/ur4;

    .line 586
    .line 587
    invoke-direct {v1, v0}, Ldefpackage/ur4;-><init>(I)V

    .line 588
    .line 589
    .line 590
    return-object v1

    .line 591
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    move-object v0, v1

    .line 595
    check-cast v0, Ljava/util/List;

    .line 596
    .line 597
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    if-eqz v1, :cond_16

    .line 602
    .line 603
    check-cast v1, Ljava/lang/String;

    .line 604
    .line 605
    goto :goto_10

    .line 606
    :cond_16
    const/4 v1, 0x0

    .line 607
    :goto_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    sget-object v2, Ldefpackage/s54;->i:Ldefpackage/xc5;

    .line 615
    .line 616
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 617
    .line 618
    invoke-static {v0, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    if-eqz v3, :cond_18

    .line 623
    .line 624
    :cond_17
    const/4 v6, 0x0

    .line 625
    goto :goto_11

    .line 626
    :cond_18
    if-eqz v0, :cond_17

    .line 627
    .line 628
    iget-object v2, v2, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v2, Ldefpackage/if1;

    .line 631
    .line 632
    invoke-interface {v2, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    move-object v6, v0

    .line 637
    check-cast v6, Ldefpackage/os4;

    .line 638
    .line 639
    :goto_11
    new-instance v0, Ldefpackage/hb2;

    .line 640
    .line 641
    invoke-direct {v0, v1, v6}, Ldefpackage/hb2;-><init>(Ljava/lang/String;Ldefpackage/os4;)V

    .line 642
    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    move-object v0, v1

    .line 649
    check-cast v0, Ljava/lang/Integer;

    .line 650
    .line 651
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    new-instance v1, Ldefpackage/mr4;

    .line 656
    .line 657
    invoke-direct {v1, v0}, Ldefpackage/mr4;-><init>(I)V

    .line 658
    .line 659
    .line 660
    return-object v1

    .line 661
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    move-object v0, v1

    .line 665
    check-cast v0, Ljava/util/List;

    .line 666
    .line 667
    new-instance v8, Ldefpackage/xb4;

    .line 668
    .line 669
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    sget v2, Ldefpackage/x40;->h:I

    .line 674
    .line 675
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 676
    .line 677
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    if-eqz v1, :cond_1a

    .line 681
    .line 682
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 683
    .line 684
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    if-eqz v3, :cond_19

    .line 689
    .line 690
    sget-wide v9, Ldefpackage/x40;->g:J

    .line 691
    .line 692
    new-instance v1, Ldefpackage/x40;

    .line 693
    .line 694
    invoke-direct {v1, v9, v10}, Ldefpackage/x40;-><init>(J)V

    .line 695
    .line 696
    .line 697
    goto :goto_12

    .line 698
    :cond_19
    check-cast v1, Ljava/lang/Integer;

    .line 699
    .line 700
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    invoke-static {v1}, Ldefpackage/e35;->b(I)J

    .line 705
    .line 706
    .line 707
    move-result-wide v9

    .line 708
    new-instance v1, Ldefpackage/x40;

    .line 709
    .line 710
    invoke-direct {v1, v9, v10}, Ldefpackage/x40;-><init>(J)V

    .line 711
    .line 712
    .line 713
    goto :goto_12

    .line 714
    :cond_1a
    const/4 v1, 0x0

    .line 715
    :goto_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    iget-wide v9, v1, Ldefpackage/x40;->a:J

    .line 719
    .line 720
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    sget-object v3, Ldefpackage/s54;->x:Ldefpackage/r54;

    .line 725
    .line 726
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    if-eqz v1, :cond_1b

    .line 730
    .line 731
    iget-object v2, v3, Ldefpackage/r54;->o:Ldefpackage/if1;

    .line 732
    .line 733
    invoke-interface {v2, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    check-cast v1, Ldefpackage/g83;

    .line 738
    .line 739
    goto :goto_13

    .line 740
    :cond_1b
    const/4 v1, 0x0

    .line 741
    :goto_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    iget-wide v11, v1, Ldefpackage/g83;->a:J

    .line 745
    .line 746
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    if-eqz v0, :cond_1c

    .line 751
    .line 752
    move-object v6, v0

    .line 753
    check-cast v6, Ljava/lang/Float;

    .line 754
    .line 755
    goto :goto_14

    .line 756
    :cond_1c
    const/4 v6, 0x0

    .line 757
    :goto_14
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 761
    .line 762
    .line 763
    move-result v13

    .line 764
    invoke-direct/range {v8 .. v13}, Ldefpackage/xb4;-><init>(JJF)V

    .line 765
    .line 766
    .line 767
    return-object v8

    .line 768
    :pswitch_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    move-object v0, v1

    .line 772
    check-cast v0, Ljava/util/List;

    .line 773
    .line 774
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    if-eqz v1, :cond_1d

    .line 779
    .line 780
    check-cast v1, Ljava/lang/Integer;

    .line 781
    .line 782
    goto :goto_15

    .line 783
    :cond_1d
    const/4 v1, 0x0

    .line 784
    :goto_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 788
    .line 789
    .line 790
    move-result v1

    .line 791
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    if-eqz v0, :cond_1e

    .line 796
    .line 797
    move-object v6, v0

    .line 798
    check-cast v6, Ljava/lang/Integer;

    .line 799
    .line 800
    goto :goto_16

    .line 801
    :cond_1e
    const/4 v6, 0x0

    .line 802
    :goto_16
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    invoke-static {v1, v0}, Ldefpackage/l93;->c(II)J

    .line 810
    .line 811
    .line 812
    move-result-wide v0

    .line 813
    new-instance v2, Ldefpackage/ss4;

    .line 814
    .line 815
    invoke-direct {v2, v0, v1}, Ldefpackage/ss4;-><init>(J)V

    .line 816
    .line 817
    .line 818
    return-object v2

    .line 819
    :pswitch_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    move-object v0, v1

    .line 823
    check-cast v0, Ljava/lang/Float;

    .line 824
    .line 825
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 826
    .line 827
    .line 828
    move-result v0

    .line 829
    new-instance v1, Ldefpackage/hr;

    .line 830
    .line 831
    invoke-direct {v1, v0}, Ldefpackage/hr;-><init>(F)V

    .line 832
    .line 833
    .line 834
    return-object v1

    .line 835
    :pswitch_1a
    new-instance v0, Ldefpackage/gb1;

    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    check-cast v1, Ljava/lang/Integer;

    .line 841
    .line 842
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 843
    .line 844
    .line 845
    move-result v1

    .line 846
    invoke-direct {v0, v1}, Ldefpackage/gb1;-><init>(I)V

    .line 847
    .line 848
    .line 849
    return-object v0

    .line 850
    :pswitch_1b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    move-object v0, v1

    .line 854
    check-cast v0, Ljava/util/List;

    .line 855
    .line 856
    new-instance v1, Ldefpackage/cs4;

    .line 857
    .line 858
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    sget-object v3, Ldefpackage/bt4;->b:[Ldefpackage/ct4;

    .line 863
    .line 864
    sget-object v3, Ldefpackage/s54;->v:Ldefpackage/r54;

    .line 865
    .line 866
    iget-object v3, v3, Ldefpackage/r54;->o:Ldefpackage/if1;

    .line 867
    .line 868
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 869
    .line 870
    invoke-static {v2, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    if-eqz v2, :cond_1f

    .line 874
    .line 875
    invoke-interface {v3, v2}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    check-cast v2, Ldefpackage/bt4;

    .line 880
    .line 881
    goto :goto_17

    .line 882
    :cond_1f
    const/4 v2, 0x0

    .line 883
    :goto_17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget-wide v7, v2, Ldefpackage/bt4;->a:J

    .line 887
    .line 888
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-static {v0, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    if-eqz v0, :cond_20

    .line 896
    .line 897
    invoke-interface {v3, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    move-object v6, v0

    .line 902
    check-cast v6, Ldefpackage/bt4;

    .line 903
    .line 904
    goto :goto_18

    .line 905
    :cond_20
    const/4 v6, 0x0

    .line 906
    :goto_18
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    iget-wide v2, v6, Ldefpackage/bt4;->a:J

    .line 910
    .line 911
    invoke-direct {v1, v7, v8, v2, v3}, Ldefpackage/cs4;-><init>(JJ)V

    .line 912
    .line 913
    .line 914
    return-object v1

    .line 915
    :pswitch_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    move-object v0, v1

    .line 919
    check-cast v0, Ljava/util/List;

    .line 920
    .line 921
    new-instance v1, Ldefpackage/bs4;

    .line 922
    .line 923
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    check-cast v2, Ljava/lang/Number;

    .line 928
    .line 929
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 930
    .line 931
    .line 932
    move-result v2

    .line 933
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    check-cast v0, Ljava/lang/Number;

    .line 938
    .line 939
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 940
    .line 941
    .line 942
    move-result v0

    .line 943
    invoke-direct {v1, v2, v0}, Ldefpackage/bs4;-><init>(FF)V

    .line 944
    .line 945
    .line 946
    return-object v1

    .line 947
    :pswitch_1d
    new-instance v0, Ldefpackage/sr4;

    .line 948
    .line 949
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    check-cast v1, Ljava/lang/Integer;

    .line 953
    .line 954
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 955
    .line 956
    .line 957
    move-result v1

    .line 958
    invoke-direct {v0, v1}, Ldefpackage/sr4;-><init>(I)V

    .line 959
    .line 960
    .line 961
    return-object v0

    .line 962
    :pswitch_1e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    move-object v0, v1

    .line 966
    check-cast v0, Ljava/util/List;

    .line 967
    .line 968
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    sget-object v2, Ldefpackage/s54;->a:Ldefpackage/xc5;

    .line 973
    .line 974
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 975
    .line 976
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-eqz v3, :cond_22

    .line 981
    .line 982
    :cond_21
    const/4 v1, 0x0

    .line 983
    goto :goto_19

    .line 984
    :cond_22
    if-eqz v1, :cond_21

    .line 985
    .line 986
    iget-object v2, v2, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v2, Ldefpackage/if1;

    .line 989
    .line 990
    invoke-interface {v2, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    check-cast v1, Ljava/util/List;

    .line 995
    .line 996
    :goto_19
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    if-eqz v0, :cond_23

    .line 1001
    .line 1002
    move-object v6, v0

    .line 1003
    check-cast v6, Ljava/lang/String;

    .line 1004
    .line 1005
    goto :goto_1a

    .line 1006
    :cond_23
    const/4 v6, 0x0

    .line 1007
    :goto_1a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    new-instance v0, Ldefpackage/he;

    .line 1011
    .line 1012
    invoke-direct {v0, v1, v6}, Ldefpackage/he;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    return-object v0

    .line 1016
    :pswitch_1f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    move-object v0, v1

    .line 1020
    check-cast v0, Ljava/util/List;

    .line 1021
    .line 1022
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v1

    .line 1026
    sget-object v2, Ldefpackage/s54;->h:Ldefpackage/xc5;

    .line 1027
    .line 1028
    iget-object v2, v2, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v2, Ldefpackage/if1;

    .line 1031
    .line 1032
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1033
    .line 1034
    invoke-static {v1, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v8

    .line 1038
    if-eqz v8, :cond_25

    .line 1039
    .line 1040
    :cond_24
    const/4 v1, 0x0

    .line 1041
    goto :goto_1b

    .line 1042
    :cond_25
    if-eqz v1, :cond_24

    .line 1043
    .line 1044
    invoke-interface {v2, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    check-cast v1, Ldefpackage/ij4;

    .line 1049
    .line 1050
    :goto_1b
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v5

    .line 1054
    invoke-static {v5, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v8

    .line 1058
    if-eqz v8, :cond_27

    .line 1059
    .line 1060
    :cond_26
    const/4 v5, 0x0

    .line 1061
    goto :goto_1c

    .line 1062
    :cond_27
    if-eqz v5, :cond_26

    .line 1063
    .line 1064
    invoke-interface {v2, v5}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v5

    .line 1068
    check-cast v5, Ldefpackage/ij4;

    .line 1069
    .line 1070
    :goto_1c
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v4

    .line 1074
    invoke-static {v4, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    move-result v8

    .line 1078
    if-eqz v8, :cond_29

    .line 1079
    .line 1080
    :cond_28
    const/4 v4, 0x0

    .line 1081
    goto :goto_1d

    .line 1082
    :cond_29
    if-eqz v4, :cond_28

    .line 1083
    .line 1084
    invoke-interface {v2, v4}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v4

    .line 1088
    check-cast v4, Ldefpackage/ij4;

    .line 1089
    .line 1090
    :goto_1d
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    invoke-static {v0, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v3

    .line 1098
    if-eqz v3, :cond_2b

    .line 1099
    .line 1100
    :cond_2a
    const/4 v6, 0x0

    .line 1101
    goto :goto_1e

    .line 1102
    :cond_2b
    if-eqz v0, :cond_2a

    .line 1103
    .line 1104
    invoke-interface {v2, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    move-object v6, v0

    .line 1109
    check-cast v6, Ldefpackage/ij4;

    .line 1110
    .line 1111
    :goto_1e
    new-instance v0, Ldefpackage/os4;

    .line 1112
    .line 1113
    invoke-direct {v0, v1, v5, v4, v6}, Ldefpackage/os4;-><init>(Ldefpackage/ij4;Ldefpackage/ij4;Ldefpackage/ij4;Ldefpackage/ij4;)V

    .line 1114
    .line 1115
    .line 1116
    return-object v0

    .line 1117
    :pswitch_20
    move-object v0, v1

    .line 1118
    check-cast v0, Ljava/util/Map;

    .line 1119
    .line 1120
    new-instance v1, Ldefpackage/w44;

    .line 1121
    .line 1122
    invoke-direct {v1, v0}, Ldefpackage/w44;-><init>(Ljava/util/Map;)V

    .line 1123
    .line 1124
    .line 1125
    return-object v1

    .line 1126
    :pswitch_21
    move-object v0, v1

    .line 1127
    check-cast v0, Ldefpackage/x34;

    .line 1128
    .line 1129
    const-string v1, "SELECT search FROM recent_search ORDER BY timestamp DESC"

    .line 1130
    .line 1131
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v1

    .line 1135
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 1136
    .line 1137
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1138
    .line 1139
    .line 1140
    :goto_1f
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 1141
    .line 1142
    .line 1143
    move-result v2

    .line 1144
    if-eqz v2, :cond_2d

    .line 1145
    .line 1146
    invoke-interface {v1, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v2

    .line 1150
    if-eqz v2, :cond_2c

    .line 1151
    .line 1152
    const/4 v2, 0x0

    .line 1153
    goto :goto_20

    .line 1154
    :cond_2c
    invoke-interface {v1, v7}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    :goto_20
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1159
    .line 1160
    .line 1161
    goto :goto_1f

    .line 1162
    :catchall_0
    move-exception v0

    .line 1163
    goto :goto_21

    .line 1164
    :cond_2d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1165
    .line 1166
    .line 1167
    return-object v0

    .line 1168
    :goto_21
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1169
    .line 1170
    .line 1171
    throw v0

    .line 1172
    :pswitch_22
    move-object v0, v1

    .line 1173
    check-cast v0, Ldefpackage/x34;

    .line 1174
    .line 1175
    const-string v1, "SELECT search FROM recent_search ORDER BY search DESC"

    .line 1176
    .line 1177
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v1

    .line 1181
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 1182
    .line 1183
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1184
    .line 1185
    .line 1186
    :goto_22
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 1187
    .line 1188
    .line 1189
    move-result v2

    .line 1190
    if-eqz v2, :cond_2f

    .line 1191
    .line 1192
    invoke-interface {v1, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v2

    .line 1196
    if-eqz v2, :cond_2e

    .line 1197
    .line 1198
    const/4 v2, 0x0

    .line 1199
    goto :goto_23

    .line 1200
    :cond_2e
    invoke-interface {v1, v7}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v2

    .line 1204
    :goto_23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1205
    .line 1206
    .line 1207
    goto :goto_22

    .line 1208
    :catchall_1
    move-exception v0

    .line 1209
    goto :goto_24

    .line 1210
    :cond_2f
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1211
    .line 1212
    .line 1213
    return-object v0

    .line 1214
    :goto_24
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1215
    .line 1216
    .line 1217
    throw v0

    .line 1218
    :pswitch_23
    move-object v0, v1

    .line 1219
    check-cast v0, Ldefpackage/x34;

    .line 1220
    .line 1221
    const-string v1, "SELECT * FROM queue ORDER BY track_order ASC"

    .line 1222
    .line 1223
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v1

    .line 1227
    :try_start_2
    const-string v0, "id"

    .line 1228
    .line 1229
    invoke-static {v1, v0}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    const-string v2, "track_order"

    .line 1234
    .line 1235
    invoke-static {v1, v2}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1236
    .line 1237
    .line 1238
    move-result v2

    .line 1239
    const-string v3, "last_play"

    .line 1240
    .line 1241
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1242
    .line 1243
    .line 1244
    move-result v3

    .line 1245
    const-string v4, "playing_changed"

    .line 1246
    .line 1247
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1248
    .line 1249
    .line 1250
    move-result v4

    .line 1251
    const-string v8, "stream_id"

    .line 1252
    .line 1253
    invoke-static {v1, v8}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1254
    .line 1255
    .line 1256
    move-result v8

    .line 1257
    const-string v9, "parent_id"

    .line 1258
    .line 1259
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1260
    .line 1261
    .line 1262
    move-result v9

    .line 1263
    const-string v10, "is_dir"

    .line 1264
    .line 1265
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1266
    .line 1267
    .line 1268
    move-result v10

    .line 1269
    const-string v11, "title"

    .line 1270
    .line 1271
    invoke-static {v1, v11}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1272
    .line 1273
    .line 1274
    move-result v11

    .line 1275
    const-string v12, "album"

    .line 1276
    .line 1277
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1278
    .line 1279
    .line 1280
    move-result v12

    .line 1281
    const-string v13, "artist"

    .line 1282
    .line 1283
    invoke-static {v1, v13}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1284
    .line 1285
    .line 1286
    move-result v13

    .line 1287
    const-string v14, "track"

    .line 1288
    .line 1289
    invoke-static {v1, v14}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1290
    .line 1291
    .line 1292
    move-result v14

    .line 1293
    const-string v15, "year"

    .line 1294
    .line 1295
    invoke-static {v1, v15}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1296
    .line 1297
    .line 1298
    move-result v15

    .line 1299
    const-string v5, "genre"

    .line 1300
    .line 1301
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1302
    .line 1303
    .line 1304
    move-result v5

    .line 1305
    const-string v6, "cover_art_id"

    .line 1306
    .line 1307
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1308
    .line 1309
    .line 1310
    move-result v6

    .line 1311
    const-string v7, "size"

    .line 1312
    .line 1313
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1314
    .line 1315
    .line 1316
    move-result v7

    .line 1317
    move/from16 p0, v7

    .line 1318
    .line 1319
    const-string v7, "content_type"

    .line 1320
    .line 1321
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1322
    .line 1323
    .line 1324
    move-result v7

    .line 1325
    move/from16 p1, v7

    .line 1326
    .line 1327
    const-string v7, "suffix"

    .line 1328
    .line 1329
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1330
    .line 1331
    .line 1332
    move-result v7

    .line 1333
    move/from16 v16, v7

    .line 1334
    .line 1335
    const-string v7, "transcoding_content_type"

    .line 1336
    .line 1337
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1338
    .line 1339
    .line 1340
    move-result v7

    .line 1341
    move/from16 v17, v7

    .line 1342
    .line 1343
    const-string v7, "transcoded_suffix"

    .line 1344
    .line 1345
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1346
    .line 1347
    .line 1348
    move-result v7

    .line 1349
    move/from16 v18, v7

    .line 1350
    .line 1351
    const-string v7, "duration"

    .line 1352
    .line 1353
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1354
    .line 1355
    .line 1356
    move-result v7

    .line 1357
    move/from16 v19, v7

    .line 1358
    .line 1359
    const-string v7, "bitrate"

    .line 1360
    .line 1361
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1362
    .line 1363
    .line 1364
    move-result v7

    .line 1365
    move/from16 v20, v7

    .line 1366
    .line 1367
    const-string v7, "sampling_rate"

    .line 1368
    .line 1369
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1370
    .line 1371
    .line 1372
    move-result v7

    .line 1373
    move/from16 v21, v7

    .line 1374
    .line 1375
    const-string v7, "bit_depth"

    .line 1376
    .line 1377
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1378
    .line 1379
    .line 1380
    move-result v7

    .line 1381
    move/from16 v22, v7

    .line 1382
    .line 1383
    const-string v7, "path"

    .line 1384
    .line 1385
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1386
    .line 1387
    .line 1388
    move-result v7

    .line 1389
    move/from16 v23, v7

    .line 1390
    .line 1391
    const-string v7, "is_video"

    .line 1392
    .line 1393
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1394
    .line 1395
    .line 1396
    move-result v7

    .line 1397
    move/from16 v24, v7

    .line 1398
    .line 1399
    const-string v7, "user_rating"

    .line 1400
    .line 1401
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1402
    .line 1403
    .line 1404
    move-result v7

    .line 1405
    move/from16 v25, v7

    .line 1406
    .line 1407
    const-string v7, "average_rating"

    .line 1408
    .line 1409
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1410
    .line 1411
    .line 1412
    move-result v7

    .line 1413
    move/from16 v26, v7

    .line 1414
    .line 1415
    const-string v7, "play_count"

    .line 1416
    .line 1417
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1418
    .line 1419
    .line 1420
    move-result v7

    .line 1421
    move/from16 v27, v7

    .line 1422
    .line 1423
    const-string v7, "disc_number"

    .line 1424
    .line 1425
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1426
    .line 1427
    .line 1428
    move-result v7

    .line 1429
    move/from16 v28, v7

    .line 1430
    .line 1431
    const-string v7, "created"

    .line 1432
    .line 1433
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1434
    .line 1435
    .line 1436
    move-result v7

    .line 1437
    move/from16 v29, v7

    .line 1438
    .line 1439
    const-string v7, "starred"

    .line 1440
    .line 1441
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1442
    .line 1443
    .line 1444
    move-result v7

    .line 1445
    move/from16 v30, v7

    .line 1446
    .line 1447
    const-string v7, "album_id"

    .line 1448
    .line 1449
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1450
    .line 1451
    .line 1452
    move-result v7

    .line 1453
    move/from16 v31, v7

    .line 1454
    .line 1455
    const-string v7, "artist_id"

    .line 1456
    .line 1457
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1458
    .line 1459
    .line 1460
    move-result v7

    .line 1461
    move/from16 v32, v7

    .line 1462
    .line 1463
    const-string v7, "type"

    .line 1464
    .line 1465
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1466
    .line 1467
    .line 1468
    move-result v7

    .line 1469
    move/from16 v33, v7

    .line 1470
    .line 1471
    const-string v7, "bookmark_position"

    .line 1472
    .line 1473
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1474
    .line 1475
    .line 1476
    move-result v7

    .line 1477
    move/from16 v34, v7

    .line 1478
    .line 1479
    const-string v7, "original_width"

    .line 1480
    .line 1481
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1482
    .line 1483
    .line 1484
    move-result v7

    .line 1485
    move/from16 v35, v7

    .line 1486
    .line 1487
    const-string v7, "original_height"

    .line 1488
    .line 1489
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1490
    .line 1491
    .line 1492
    move-result v7

    .line 1493
    move/from16 v36, v7

    .line 1494
    .line 1495
    const-string v7, "album_artist"

    .line 1496
    .line 1497
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1498
    .line 1499
    .line 1500
    move-result v7

    .line 1501
    move/from16 v37, v7

    .line 1502
    .line 1503
    const-string v7, "rg_track_gain"

    .line 1504
    .line 1505
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1506
    .line 1507
    .line 1508
    move-result v7

    .line 1509
    move/from16 v38, v6

    .line 1510
    .line 1511
    const-string v6, "rg_album_gain"

    .line 1512
    .line 1513
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1514
    .line 1515
    .line 1516
    move-result v6

    .line 1517
    move/from16 v39, v5

    .line 1518
    .line 1519
    const-string v5, "rg_track_peak"

    .line 1520
    .line 1521
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1522
    .line 1523
    .line 1524
    move-result v5

    .line 1525
    move/from16 v40, v15

    .line 1526
    .line 1527
    const-string v15, "rg_album_peak"

    .line 1528
    .line 1529
    invoke-static {v1, v15}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1530
    .line 1531
    .line 1532
    move-result v15

    .line 1533
    move/from16 v41, v14

    .line 1534
    .line 1535
    const-string v14, "rg_base_gain"

    .line 1536
    .line 1537
    invoke-static {v1, v14}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1538
    .line 1539
    .line 1540
    move-result v14

    .line 1541
    move/from16 v42, v13

    .line 1542
    .line 1543
    const-string v13, "rg_fallback_gain"

    .line 1544
    .line 1545
    invoke-static {v1, v13}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1546
    .line 1547
    .line 1548
    move-result v13

    .line 1549
    move/from16 v43, v12

    .line 1550
    .line 1551
    new-instance v12, Ljava/util/ArrayList;

    .line 1552
    .line 1553
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1554
    .line 1555
    .line 1556
    :goto_25
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 1557
    .line 1558
    .line 1559
    move-result v44

    .line 1560
    if-eqz v44, :cond_5b

    .line 1561
    .line 1562
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v44

    .line 1566
    if-eqz v44, :cond_30

    .line 1567
    .line 1568
    const/16 v46, 0x0

    .line 1569
    .line 1570
    move/from16 v44, v11

    .line 1571
    .line 1572
    move-object/from16 v53, v12

    .line 1573
    .line 1574
    goto :goto_26

    .line 1575
    :cond_30
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v44

    .line 1579
    move-object/from16 v46, v44

    .line 1580
    .line 1581
    move-object/from16 v53, v12

    .line 1582
    .line 1583
    move/from16 v44, v11

    .line 1584
    .line 1585
    :goto_26
    invoke-interface {v1, v2}, Ldefpackage/z34;->getLong(I)J

    .line 1586
    .line 1587
    .line 1588
    move-result-wide v11

    .line 1589
    long-to-int v11, v11

    .line 1590
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1591
    .line 1592
    .line 1593
    move-result-wide v48

    .line 1594
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 1595
    .line 1596
    .line 1597
    move-result-wide v50

    .line 1598
    invoke-interface {v1, v8}, Ldefpackage/z34;->isNull(I)Z

    .line 1599
    .line 1600
    .line 1601
    move-result v12

    .line 1602
    if-eqz v12, :cond_31

    .line 1603
    .line 1604
    const/16 v52, 0x0

    .line 1605
    .line 1606
    goto :goto_27

    .line 1607
    :cond_31
    invoke-interface {v1, v8}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v12

    .line 1611
    move-object/from16 v52, v12

    .line 1612
    .line 1613
    :goto_27
    invoke-interface {v1, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 1614
    .line 1615
    .line 1616
    move-result v12

    .line 1617
    if-eqz v12, :cond_33

    .line 1618
    .line 1619
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 1620
    .line 1621
    .line 1622
    move-result v12

    .line 1623
    if-eqz v12, :cond_33

    .line 1624
    .line 1625
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 1626
    .line 1627
    .line 1628
    move-result v12

    .line 1629
    if-eqz v12, :cond_33

    .line 1630
    .line 1631
    invoke-interface {v1, v15}, Ldefpackage/z34;->isNull(I)Z

    .line 1632
    .line 1633
    .line 1634
    move-result v12

    .line 1635
    if-eqz v12, :cond_33

    .line 1636
    .line 1637
    invoke-interface {v1, v14}, Ldefpackage/z34;->isNull(I)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v12

    .line 1641
    if-eqz v12, :cond_33

    .line 1642
    .line 1643
    invoke-interface {v1, v13}, Ldefpackage/z34;->isNull(I)Z

    .line 1644
    .line 1645
    .line 1646
    move-result v12

    .line 1647
    if-nez v12, :cond_32

    .line 1648
    .line 1649
    goto :goto_28

    .line 1650
    :cond_32
    move v12, v2

    .line 1651
    move/from16 v54, v3

    .line 1652
    .line 1653
    const/4 v2, 0x0

    .line 1654
    goto/16 :goto_2f

    .line 1655
    .line 1656
    :catchall_2
    move-exception v0

    .line 1657
    goto/16 :goto_52

    .line 1658
    .line 1659
    :cond_33
    :goto_28
    invoke-interface {v1, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 1660
    .line 1661
    .line 1662
    move-result v12

    .line 1663
    if-eqz v12, :cond_34

    .line 1664
    .line 1665
    move v12, v2

    .line 1666
    move/from16 v54, v3

    .line 1667
    .line 1668
    const/16 v56, 0x0

    .line 1669
    .line 1670
    goto :goto_29

    .line 1671
    :cond_34
    move v12, v2

    .line 1672
    move/from16 v54, v3

    .line 1673
    .line 1674
    invoke-interface {v1, v7}, Ldefpackage/z34;->getDouble(I)D

    .line 1675
    .line 1676
    .line 1677
    move-result-wide v2

    .line 1678
    double-to-float v2, v2

    .line 1679
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v2

    .line 1683
    move-object/from16 v56, v2

    .line 1684
    .line 1685
    :goto_29
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v2

    .line 1689
    if-eqz v2, :cond_35

    .line 1690
    .line 1691
    const/16 v57, 0x0

    .line 1692
    .line 1693
    goto :goto_2a

    .line 1694
    :cond_35
    invoke-interface {v1, v6}, Ldefpackage/z34;->getDouble(I)D

    .line 1695
    .line 1696
    .line 1697
    move-result-wide v2

    .line 1698
    double-to-float v2, v2

    .line 1699
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v2

    .line 1703
    move-object/from16 v57, v2

    .line 1704
    .line 1705
    :goto_2a
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v2

    .line 1709
    if-eqz v2, :cond_36

    .line 1710
    .line 1711
    const/16 v58, 0x0

    .line 1712
    .line 1713
    goto :goto_2b

    .line 1714
    :cond_36
    invoke-interface {v1, v5}, Ldefpackage/z34;->getDouble(I)D

    .line 1715
    .line 1716
    .line 1717
    move-result-wide v2

    .line 1718
    double-to-float v2, v2

    .line 1719
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v2

    .line 1723
    move-object/from16 v58, v2

    .line 1724
    .line 1725
    :goto_2b
    invoke-interface {v1, v15}, Ldefpackage/z34;->isNull(I)Z

    .line 1726
    .line 1727
    .line 1728
    move-result v2

    .line 1729
    if-eqz v2, :cond_37

    .line 1730
    .line 1731
    const/16 v59, 0x0

    .line 1732
    .line 1733
    goto :goto_2c

    .line 1734
    :cond_37
    invoke-interface {v1, v15}, Ldefpackage/z34;->getDouble(I)D

    .line 1735
    .line 1736
    .line 1737
    move-result-wide v2

    .line 1738
    double-to-float v2, v2

    .line 1739
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v2

    .line 1743
    move-object/from16 v59, v2

    .line 1744
    .line 1745
    :goto_2c
    invoke-interface {v1, v14}, Ldefpackage/z34;->isNull(I)Z

    .line 1746
    .line 1747
    .line 1748
    move-result v2

    .line 1749
    if-eqz v2, :cond_38

    .line 1750
    .line 1751
    const/16 v60, 0x0

    .line 1752
    .line 1753
    goto :goto_2d

    .line 1754
    :cond_38
    invoke-interface {v1, v14}, Ldefpackage/z34;->getDouble(I)D

    .line 1755
    .line 1756
    .line 1757
    move-result-wide v2

    .line 1758
    double-to-float v2, v2

    .line 1759
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v2

    .line 1763
    move-object/from16 v60, v2

    .line 1764
    .line 1765
    :goto_2d
    invoke-interface {v1, v13}, Ldefpackage/z34;->isNull(I)Z

    .line 1766
    .line 1767
    .line 1768
    move-result v2

    .line 1769
    if-eqz v2, :cond_39

    .line 1770
    .line 1771
    const/16 v61, 0x0

    .line 1772
    .line 1773
    goto :goto_2e

    .line 1774
    :cond_39
    invoke-interface {v1, v13}, Ldefpackage/z34;->getDouble(I)D

    .line 1775
    .line 1776
    .line 1777
    move-result-wide v2

    .line 1778
    double-to-float v2, v2

    .line 1779
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v2

    .line 1783
    move-object/from16 v61, v2

    .line 1784
    .line 1785
    :goto_2e
    new-instance v55, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 1786
    .line 1787
    invoke-direct/range {v55 .. v61}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 1788
    .line 1789
    .line 1790
    move-object/from16 v2, v55

    .line 1791
    .line 1792
    :goto_2f
    new-instance v45, Lcom/eddyizm/tempus/model/Queue;

    .line 1793
    .line 1794
    move/from16 v47, v11

    .line 1795
    .line 1796
    invoke-direct/range {v45 .. v52}, Lcom/eddyizm/tempus/model/Queue;-><init>(Ljava/lang/String;IJJLjava/lang/String;)V

    .line 1797
    .line 1798
    .line 1799
    move-object/from16 v3, v45

    .line 1800
    .line 1801
    invoke-interface {v1, v9}, Ldefpackage/z34;->isNull(I)Z

    .line 1802
    .line 1803
    .line 1804
    move-result v11

    .line 1805
    if-eqz v11, :cond_3a

    .line 1806
    .line 1807
    const/4 v11, 0x0

    .line 1808
    goto :goto_30

    .line 1809
    :cond_3a
    invoke-interface {v1, v9}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v11

    .line 1813
    :goto_30
    invoke-virtual {v3, v11}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 1814
    .line 1815
    .line 1816
    move v11, v4

    .line 1817
    move/from16 v45, v5

    .line 1818
    .line 1819
    invoke-interface {v1, v10}, Ldefpackage/z34;->getLong(I)J

    .line 1820
    .line 1821
    .line 1822
    move-result-wide v4

    .line 1823
    long-to-int v4, v4

    .line 1824
    if-eqz v4, :cond_3b

    .line 1825
    .line 1826
    const/4 v4, 0x1

    .line 1827
    goto :goto_31

    .line 1828
    :cond_3b
    const/4 v4, 0x0

    .line 1829
    :goto_31
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 1830
    .line 1831
    .line 1832
    move/from16 v4, v44

    .line 1833
    .line 1834
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 1835
    .line 1836
    .line 1837
    move-result v5

    .line 1838
    if-eqz v5, :cond_3c

    .line 1839
    .line 1840
    const/4 v5, 0x0

    .line 1841
    goto :goto_32

    .line 1842
    :cond_3c
    invoke-interface {v1, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v5

    .line 1846
    :goto_32
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 1847
    .line 1848
    .line 1849
    move/from16 v5, v43

    .line 1850
    .line 1851
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 1852
    .line 1853
    .line 1854
    move-result v43

    .line 1855
    if-eqz v43, :cond_3d

    .line 1856
    .line 1857
    move/from16 v44, v0

    .line 1858
    .line 1859
    const/4 v0, 0x0

    .line 1860
    goto :goto_33

    .line 1861
    :cond_3d
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v43

    .line 1865
    move/from16 v44, v0

    .line 1866
    .line 1867
    move-object/from16 v0, v43

    .line 1868
    .line 1869
    :goto_33
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 1870
    .line 1871
    .line 1872
    move/from16 v0, v42

    .line 1873
    .line 1874
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 1875
    .line 1876
    .line 1877
    move-result v42

    .line 1878
    if-eqz v42, :cond_3e

    .line 1879
    .line 1880
    move/from16 v43, v0

    .line 1881
    .line 1882
    const/4 v0, 0x0

    .line 1883
    goto :goto_34

    .line 1884
    :cond_3e
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v42

    .line 1888
    move/from16 v43, v0

    .line 1889
    .line 1890
    move-object/from16 v0, v42

    .line 1891
    .line 1892
    :goto_34
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 1893
    .line 1894
    .line 1895
    move/from16 v0, v41

    .line 1896
    .line 1897
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 1898
    .line 1899
    .line 1900
    move-result v41

    .line 1901
    if-eqz v41, :cond_3f

    .line 1902
    .line 1903
    move/from16 v41, v4

    .line 1904
    .line 1905
    move/from16 v42, v5

    .line 1906
    .line 1907
    const/4 v4, 0x0

    .line 1908
    goto :goto_35

    .line 1909
    :cond_3f
    move/from16 v41, v4

    .line 1910
    .line 1911
    move/from16 v42, v5

    .line 1912
    .line 1913
    invoke-interface {v1, v0}, Ldefpackage/z34;->getLong(I)J

    .line 1914
    .line 1915
    .line 1916
    move-result-wide v4

    .line 1917
    long-to-int v4, v4

    .line 1918
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v4

    .line 1922
    :goto_35
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 1923
    .line 1924
    .line 1925
    move/from16 v4, v40

    .line 1926
    .line 1927
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v5

    .line 1931
    if-eqz v5, :cond_40

    .line 1932
    .line 1933
    move/from16 v40, v6

    .line 1934
    .line 1935
    const/4 v5, 0x0

    .line 1936
    goto :goto_36

    .line 1937
    :cond_40
    move/from16 v40, v6

    .line 1938
    .line 1939
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 1940
    .line 1941
    .line 1942
    move-result-wide v5

    .line 1943
    long-to-int v5, v5

    .line 1944
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v5

    .line 1948
    :goto_36
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 1949
    .line 1950
    .line 1951
    move/from16 v5, v39

    .line 1952
    .line 1953
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 1954
    .line 1955
    .line 1956
    move-result v6

    .line 1957
    if-eqz v6, :cond_41

    .line 1958
    .line 1959
    const/4 v6, 0x0

    .line 1960
    goto :goto_37

    .line 1961
    :cond_41
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v6

    .line 1965
    :goto_37
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setGenre(Ljava/lang/String;)V

    .line 1966
    .line 1967
    .line 1968
    move/from16 v6, v38

    .line 1969
    .line 1970
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 1971
    .line 1972
    .line 1973
    move-result v38

    .line 1974
    if-eqz v38, :cond_42

    .line 1975
    .line 1976
    move/from16 v39, v0

    .line 1977
    .line 1978
    const/4 v0, 0x0

    .line 1979
    goto :goto_38

    .line 1980
    :cond_42
    invoke-interface {v1, v6}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v38

    .line 1984
    move/from16 v39, v0

    .line 1985
    .line 1986
    move-object/from16 v0, v38

    .line 1987
    .line 1988
    :goto_38
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 1989
    .line 1990
    .line 1991
    move/from16 v0, p0

    .line 1992
    .line 1993
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 1994
    .line 1995
    .line 1996
    move-result v38

    .line 1997
    if-eqz v38, :cond_43

    .line 1998
    .line 1999
    move/from16 p0, v0

    .line 2000
    .line 2001
    const/4 v0, 0x0

    .line 2002
    goto :goto_39

    .line 2003
    :cond_43
    invoke-interface {v1, v0}, Ldefpackage/z34;->getLong(I)J

    .line 2004
    .line 2005
    .line 2006
    move-result-wide v46

    .line 2007
    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v38

    .line 2011
    move/from16 p0, v0

    .line 2012
    .line 2013
    move-object/from16 v0, v38

    .line 2014
    .line 2015
    :goto_39
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSize(Ljava/lang/Long;)V

    .line 2016
    .line 2017
    .line 2018
    move/from16 v0, p1

    .line 2019
    .line 2020
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2021
    .line 2022
    .line 2023
    move-result v38

    .line 2024
    if-eqz v38, :cond_44

    .line 2025
    .line 2026
    move/from16 p1, v0

    .line 2027
    .line 2028
    const/4 v0, 0x0

    .line 2029
    goto :goto_3a

    .line 2030
    :cond_44
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v38

    .line 2034
    move/from16 p1, v0

    .line 2035
    .line 2036
    move-object/from16 v0, v38

    .line 2037
    .line 2038
    :goto_3a
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setContentType(Ljava/lang/String;)V

    .line 2039
    .line 2040
    .line 2041
    move/from16 v0, v16

    .line 2042
    .line 2043
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2044
    .line 2045
    .line 2046
    move-result v16

    .line 2047
    if-eqz v16, :cond_45

    .line 2048
    .line 2049
    move/from16 v38, v0

    .line 2050
    .line 2051
    const/4 v0, 0x0

    .line 2052
    goto :goto_3b

    .line 2053
    :cond_45
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v16

    .line 2057
    move/from16 v38, v0

    .line 2058
    .line 2059
    move-object/from16 v0, v16

    .line 2060
    .line 2061
    :goto_3b
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSuffix(Ljava/lang/String;)V

    .line 2062
    .line 2063
    .line 2064
    move/from16 v0, v17

    .line 2065
    .line 2066
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2067
    .line 2068
    .line 2069
    move-result v16

    .line 2070
    if-eqz v16, :cond_46

    .line 2071
    .line 2072
    move/from16 v17, v0

    .line 2073
    .line 2074
    const/4 v0, 0x0

    .line 2075
    goto :goto_3c

    .line 2076
    :cond_46
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v16

    .line 2080
    move/from16 v17, v0

    .line 2081
    .line 2082
    move-object/from16 v0, v16

    .line 2083
    .line 2084
    :goto_3c
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedContentType(Ljava/lang/String;)V

    .line 2085
    .line 2086
    .line 2087
    move/from16 v0, v18

    .line 2088
    .line 2089
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2090
    .line 2091
    .line 2092
    move-result v16

    .line 2093
    if-eqz v16, :cond_47

    .line 2094
    .line 2095
    move/from16 v18, v0

    .line 2096
    .line 2097
    const/4 v0, 0x0

    .line 2098
    goto :goto_3d

    .line 2099
    :cond_47
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v16

    .line 2103
    move/from16 v18, v0

    .line 2104
    .line 2105
    move-object/from16 v0, v16

    .line 2106
    .line 2107
    :goto_3d
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedSuffix(Ljava/lang/String;)V

    .line 2108
    .line 2109
    .line 2110
    move/from16 v0, v19

    .line 2111
    .line 2112
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2113
    .line 2114
    .line 2115
    move-result v16

    .line 2116
    if-eqz v16, :cond_48

    .line 2117
    .line 2118
    move/from16 v16, v4

    .line 2119
    .line 2120
    move/from16 v19, v5

    .line 2121
    .line 2122
    const/4 v4, 0x0

    .line 2123
    goto :goto_3e

    .line 2124
    :cond_48
    move/from16 v16, v4

    .line 2125
    .line 2126
    move/from16 v19, v5

    .line 2127
    .line 2128
    invoke-interface {v1, v0}, Ldefpackage/z34;->getLong(I)J

    .line 2129
    .line 2130
    .line 2131
    move-result-wide v4

    .line 2132
    long-to-int v4, v4

    .line 2133
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v4

    .line 2137
    :goto_3e
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 2138
    .line 2139
    .line 2140
    move/from16 v4, v20

    .line 2141
    .line 2142
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 2143
    .line 2144
    .line 2145
    move-result v5

    .line 2146
    if-eqz v5, :cond_49

    .line 2147
    .line 2148
    move/from16 v20, v6

    .line 2149
    .line 2150
    const/4 v5, 0x0

    .line 2151
    goto :goto_3f

    .line 2152
    :cond_49
    move/from16 v20, v6

    .line 2153
    .line 2154
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 2155
    .line 2156
    .line 2157
    move-result-wide v5

    .line 2158
    long-to-int v5, v5

    .line 2159
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v5

    .line 2163
    :goto_3f
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitrate(Ljava/lang/Integer;)V

    .line 2164
    .line 2165
    .line 2166
    move/from16 v5, v21

    .line 2167
    .line 2168
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 2169
    .line 2170
    .line 2171
    move-result v6

    .line 2172
    if-eqz v6, :cond_4a

    .line 2173
    .line 2174
    move/from16 v21, v7

    .line 2175
    .line 2176
    const/4 v6, 0x0

    .line 2177
    goto :goto_40

    .line 2178
    :cond_4a
    move/from16 v21, v7

    .line 2179
    .line 2180
    invoke-interface {v1, v5}, Ldefpackage/z34;->getLong(I)J

    .line 2181
    .line 2182
    .line 2183
    move-result-wide v6

    .line 2184
    long-to-int v6, v6

    .line 2185
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v6

    .line 2189
    :goto_40
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSamplingRate(Ljava/lang/Integer;)V

    .line 2190
    .line 2191
    .line 2192
    move/from16 v6, v22

    .line 2193
    .line 2194
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 2195
    .line 2196
    .line 2197
    move-result v7

    .line 2198
    if-eqz v7, :cond_4b

    .line 2199
    .line 2200
    move v7, v4

    .line 2201
    move/from16 v22, v5

    .line 2202
    .line 2203
    const/4 v4, 0x0

    .line 2204
    goto :goto_41

    .line 2205
    :cond_4b
    move v7, v4

    .line 2206
    move/from16 v22, v5

    .line 2207
    .line 2208
    invoke-interface {v1, v6}, Ldefpackage/z34;->getLong(I)J

    .line 2209
    .line 2210
    .line 2211
    move-result-wide v4

    .line 2212
    long-to-int v4, v4

    .line 2213
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2214
    .line 2215
    .line 2216
    move-result-object v4

    .line 2217
    :goto_41
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitDepth(Ljava/lang/Integer;)V

    .line 2218
    .line 2219
    .line 2220
    move/from16 v4, v23

    .line 2221
    .line 2222
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 2223
    .line 2224
    .line 2225
    move-result v5

    .line 2226
    if-eqz v5, :cond_4c

    .line 2227
    .line 2228
    const/4 v5, 0x0

    .line 2229
    goto :goto_42

    .line 2230
    :cond_4c
    invoke-interface {v1, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v5

    .line 2234
    :goto_42
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPath(Ljava/lang/String;)V

    .line 2235
    .line 2236
    .line 2237
    move/from16 v23, v6

    .line 2238
    .line 2239
    move/from16 v5, v24

    .line 2240
    .line 2241
    move/from16 v24, v7

    .line 2242
    .line 2243
    invoke-interface {v1, v5}, Ldefpackage/z34;->getLong(I)J

    .line 2244
    .line 2245
    .line 2246
    move-result-wide v6

    .line 2247
    long-to-int v6, v6

    .line 2248
    if-eqz v6, :cond_4d

    .line 2249
    .line 2250
    const/4 v6, 0x1

    .line 2251
    goto :goto_43

    .line 2252
    :cond_4d
    const/4 v6, 0x0

    .line 2253
    :goto_43
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setVideo(Z)V

    .line 2254
    .line 2255
    .line 2256
    move/from16 v6, v25

    .line 2257
    .line 2258
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 2259
    .line 2260
    .line 2261
    move-result v7

    .line 2262
    if-eqz v7, :cond_4e

    .line 2263
    .line 2264
    move v7, v4

    .line 2265
    move/from16 v25, v5

    .line 2266
    .line 2267
    const/4 v4, 0x0

    .line 2268
    goto :goto_44

    .line 2269
    :cond_4e
    move v7, v4

    .line 2270
    move/from16 v25, v5

    .line 2271
    .line 2272
    invoke-interface {v1, v6}, Ldefpackage/z34;->getLong(I)J

    .line 2273
    .line 2274
    .line 2275
    move-result-wide v4

    .line 2276
    long-to-int v4, v4

    .line 2277
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v4

    .line 2281
    :goto_44
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 2282
    .line 2283
    .line 2284
    move/from16 v4, v26

    .line 2285
    .line 2286
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 2287
    .line 2288
    .line 2289
    move-result v5

    .line 2290
    if-eqz v5, :cond_4f

    .line 2291
    .line 2292
    const/4 v5, 0x0

    .line 2293
    goto :goto_45

    .line 2294
    :cond_4f
    invoke-interface {v1, v4}, Ldefpackage/z34;->getDouble(I)D

    .line 2295
    .line 2296
    .line 2297
    move-result-wide v46

    .line 2298
    invoke-static/range {v46 .. v47}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v5

    .line 2302
    :goto_45
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAverageRating(Ljava/lang/Double;)V

    .line 2303
    .line 2304
    .line 2305
    move/from16 v5, v27

    .line 2306
    .line 2307
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 2308
    .line 2309
    .line 2310
    move-result v26

    .line 2311
    if-eqz v26, :cond_50

    .line 2312
    .line 2313
    move/from16 v27, v0

    .line 2314
    .line 2315
    const/4 v0, 0x0

    .line 2316
    goto :goto_46

    .line 2317
    :cond_50
    invoke-interface {v1, v5}, Ldefpackage/z34;->getLong(I)J

    .line 2318
    .line 2319
    .line 2320
    move-result-wide v26

    .line 2321
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v26

    .line 2325
    move/from16 v27, v0

    .line 2326
    .line 2327
    move-object/from16 v0, v26

    .line 2328
    .line 2329
    :goto_46
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPlayCount(Ljava/lang/Long;)V

    .line 2330
    .line 2331
    .line 2332
    move/from16 v0, v28

    .line 2333
    .line 2334
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2335
    .line 2336
    .line 2337
    move-result v26

    .line 2338
    if-eqz v26, :cond_51

    .line 2339
    .line 2340
    move/from16 v26, v4

    .line 2341
    .line 2342
    move/from16 v28, v5

    .line 2343
    .line 2344
    const/4 v4, 0x0

    .line 2345
    goto :goto_47

    .line 2346
    :cond_51
    move/from16 v26, v4

    .line 2347
    .line 2348
    move/from16 v28, v5

    .line 2349
    .line 2350
    invoke-interface {v1, v0}, Ldefpackage/z34;->getLong(I)J

    .line 2351
    .line 2352
    .line 2353
    move-result-wide v4

    .line 2354
    long-to-int v4, v4

    .line 2355
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v4

    .line 2359
    :goto_47
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 2360
    .line 2361
    .line 2362
    move/from16 v4, v29

    .line 2363
    .line 2364
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 2365
    .line 2366
    .line 2367
    move-result v5

    .line 2368
    if-eqz v5, :cond_52

    .line 2369
    .line 2370
    const/4 v5, 0x0

    .line 2371
    goto :goto_48

    .line 2372
    :cond_52
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 2373
    .line 2374
    .line 2375
    move-result-wide v46

    .line 2376
    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v5

    .line 2380
    :goto_48
    invoke-static {v5}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v5

    .line 2384
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCreated(Ljava/util/Date;)V

    .line 2385
    .line 2386
    .line 2387
    move/from16 v5, v30

    .line 2388
    .line 2389
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 2390
    .line 2391
    .line 2392
    move-result v29

    .line 2393
    if-eqz v29, :cond_53

    .line 2394
    .line 2395
    const/16 v29, 0x0

    .line 2396
    .line 2397
    :goto_49
    move/from16 v30, v0

    .line 2398
    .line 2399
    goto :goto_4a

    .line 2400
    :cond_53
    invoke-interface {v1, v5}, Ldefpackage/z34;->getLong(I)J

    .line 2401
    .line 2402
    .line 2403
    move-result-wide v29

    .line 2404
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v29

    .line 2408
    goto :goto_49

    .line 2409
    :goto_4a
    invoke-static/range {v29 .. v29}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v0

    .line 2413
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 2414
    .line 2415
    .line 2416
    move/from16 v0, v31

    .line 2417
    .line 2418
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2419
    .line 2420
    .line 2421
    move-result v29

    .line 2422
    if-eqz v29, :cond_54

    .line 2423
    .line 2424
    move/from16 v31, v0

    .line 2425
    .line 2426
    const/4 v0, 0x0

    .line 2427
    goto :goto_4b

    .line 2428
    :cond_54
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v29

    .line 2432
    move/from16 v31, v0

    .line 2433
    .line 2434
    move-object/from16 v0, v29

    .line 2435
    .line 2436
    :goto_4b
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 2437
    .line 2438
    .line 2439
    move/from16 v0, v32

    .line 2440
    .line 2441
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2442
    .line 2443
    .line 2444
    move-result v29

    .line 2445
    if-eqz v29, :cond_55

    .line 2446
    .line 2447
    move/from16 v32, v0

    .line 2448
    .line 2449
    const/4 v0, 0x0

    .line 2450
    goto :goto_4c

    .line 2451
    :cond_55
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v29

    .line 2455
    move/from16 v32, v0

    .line 2456
    .line 2457
    move-object/from16 v0, v29

    .line 2458
    .line 2459
    :goto_4c
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 2460
    .line 2461
    .line 2462
    move/from16 v0, v33

    .line 2463
    .line 2464
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2465
    .line 2466
    .line 2467
    move-result v29

    .line 2468
    if-eqz v29, :cond_56

    .line 2469
    .line 2470
    move/from16 v33, v0

    .line 2471
    .line 2472
    const/4 v0, 0x0

    .line 2473
    goto :goto_4d

    .line 2474
    :cond_56
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v29

    .line 2478
    move/from16 v33, v0

    .line 2479
    .line 2480
    move-object/from16 v0, v29

    .line 2481
    .line 2482
    :goto_4d
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 2483
    .line 2484
    .line 2485
    move/from16 v0, v34

    .line 2486
    .line 2487
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2488
    .line 2489
    .line 2490
    move-result v29

    .line 2491
    if-eqz v29, :cond_57

    .line 2492
    .line 2493
    move/from16 v34, v0

    .line 2494
    .line 2495
    const/4 v0, 0x0

    .line 2496
    goto :goto_4e

    .line 2497
    :cond_57
    invoke-interface {v1, v0}, Ldefpackage/z34;->getLong(I)J

    .line 2498
    .line 2499
    .line 2500
    move-result-wide v46

    .line 2501
    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v29

    .line 2505
    move/from16 v34, v0

    .line 2506
    .line 2507
    move-object/from16 v0, v29

    .line 2508
    .line 2509
    :goto_4e
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBookmarkPosition(Ljava/lang/Long;)V

    .line 2510
    .line 2511
    .line 2512
    move/from16 v0, v35

    .line 2513
    .line 2514
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 2515
    .line 2516
    .line 2517
    move-result v29

    .line 2518
    if-eqz v29, :cond_58

    .line 2519
    .line 2520
    move/from16 v29, v4

    .line 2521
    .line 2522
    move/from16 v35, v5

    .line 2523
    .line 2524
    const/4 v4, 0x0

    .line 2525
    goto :goto_4f

    .line 2526
    :cond_58
    move/from16 v29, v4

    .line 2527
    .line 2528
    move/from16 v35, v5

    .line 2529
    .line 2530
    invoke-interface {v1, v0}, Ldefpackage/z34;->getLong(I)J

    .line 2531
    .line 2532
    .line 2533
    move-result-wide v4

    .line 2534
    long-to-int v4, v4

    .line 2535
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2536
    .line 2537
    .line 2538
    move-result-object v4

    .line 2539
    :goto_4f
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalWidth(Ljava/lang/Integer;)V

    .line 2540
    .line 2541
    .line 2542
    move/from16 v4, v36

    .line 2543
    .line 2544
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 2545
    .line 2546
    .line 2547
    move-result v5

    .line 2548
    if-eqz v5, :cond_59

    .line 2549
    .line 2550
    move/from16 v36, v6

    .line 2551
    .line 2552
    const/4 v5, 0x0

    .line 2553
    goto :goto_50

    .line 2554
    :cond_59
    move/from16 v36, v6

    .line 2555
    .line 2556
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 2557
    .line 2558
    .line 2559
    move-result-wide v5

    .line 2560
    long-to-int v5, v5

    .line 2561
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v5

    .line 2565
    :goto_50
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalHeight(Ljava/lang/Integer;)V

    .line 2566
    .line 2567
    .line 2568
    move/from16 v5, v37

    .line 2569
    .line 2570
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 2571
    .line 2572
    .line 2573
    move-result v6

    .line 2574
    if-eqz v6, :cond_5a

    .line 2575
    .line 2576
    const/4 v6, 0x0

    .line 2577
    goto :goto_51

    .line 2578
    :cond_5a
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v6

    .line 2582
    :goto_51
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumArtist(Ljava/lang/String;)V

    .line 2583
    .line 2584
    .line 2585
    invoke-virtual {v3, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V

    .line 2586
    .line 2587
    .line 2588
    move-object/from16 v2, v53

    .line 2589
    .line 2590
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 2591
    .line 2592
    .line 2593
    move v3, v12

    .line 2594
    move-object v12, v2

    .line 2595
    move v2, v3

    .line 2596
    move/from16 v3, v23

    .line 2597
    .line 2598
    move/from16 v23, v7

    .line 2599
    .line 2600
    move/from16 v7, v21

    .line 2601
    .line 2602
    move/from16 v21, v22

    .line 2603
    .line 2604
    move/from16 v22, v3

    .line 2605
    .line 2606
    move/from16 v3, v43

    .line 2607
    .line 2608
    move/from16 v43, v42

    .line 2609
    .line 2610
    move/from16 v42, v3

    .line 2611
    .line 2612
    move/from16 v37, v5

    .line 2613
    .line 2614
    move/from16 v6, v40

    .line 2615
    .line 2616
    move/from16 v5, v45

    .line 2617
    .line 2618
    move/from16 v3, v54

    .line 2619
    .line 2620
    move/from16 v40, v16

    .line 2621
    .line 2622
    move/from16 v16, v38

    .line 2623
    .line 2624
    move/from16 v38, v20

    .line 2625
    .line 2626
    move/from16 v20, v24

    .line 2627
    .line 2628
    move/from16 v24, v25

    .line 2629
    .line 2630
    move/from16 v25, v36

    .line 2631
    .line 2632
    move/from16 v36, v4

    .line 2633
    .line 2634
    move v4, v11

    .line 2635
    move/from16 v11, v41

    .line 2636
    .line 2637
    move/from16 v41, v39

    .line 2638
    .line 2639
    move/from16 v39, v19

    .line 2640
    .line 2641
    move/from16 v19, v27

    .line 2642
    .line 2643
    move/from16 v27, v28

    .line 2644
    .line 2645
    move/from16 v28, v30

    .line 2646
    .line 2647
    move/from16 v30, v35

    .line 2648
    .line 2649
    move/from16 v35, v0

    .line 2650
    .line 2651
    move/from16 v0, v44

    .line 2652
    .line 2653
    goto/16 :goto_25

    .line 2654
    .line 2655
    :cond_5b
    move-object v2, v12

    .line 2656
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2657
    .line 2658
    .line 2659
    return-object v2

    .line 2660
    :goto_52
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2661
    .line 2662
    .line 2663
    throw v0

    .line 2664
    nop

    .line 2665
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
