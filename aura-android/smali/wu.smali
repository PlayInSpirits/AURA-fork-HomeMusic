.class public abstract Lwu;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v1, "OpusHead"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lwu;->a:[B

    .line 12
    .line 13
    return-void
.end method

.method public static a(Lbe3;)V
    .locals 3

    .line 1
    iget v0, p0, Lbe3;->b:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {p0, v1}, Lbe3;->O(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lbe3;->m()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const v2, 0x68646c72    # 4.3148E24f

    .line 12
    .line 13
    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x4

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Lbe3;->N(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static b(Lbe3;IIIILjava/lang/String;ZLow0;Ltu;I)V
    .locals 49

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    .line 1
    sget-object v7, Lfu;->q:[I

    sget-object v8, Lfu;->o:[I

    add-int/lit8 v9, v2, 0x10

    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    const/4 v9, 0x6

    const/16 v10, 0x8

    if-eqz p6, :cond_0

    .line 2
    invoke-virtual {v0}, Lbe3;->H()I

    move-result v12

    .line 3
    invoke-virtual {v0, v9}, Lbe3;->O(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, v10}, Lbe3;->O(I)V

    const/4 v12, 0x0

    :goto_0
    const/16 v15, 0x18

    const/4 v14, 0x4

    const/4 v11, 0x2

    const/4 v9, 0x1

    const/16 v13, 0x10

    if-eqz v12, :cond_1

    if-ne v12, v9, :cond_2

    :cond_1
    move/from16 v22, v11

    move/from16 v20, v14

    goto/16 :goto_4

    :cond_2
    if-ne v12, v11, :cond_a4

    .line 5
    invoke-virtual {v0, v13}, Lbe3;->O(I)V

    .line 6
    invoke-virtual {v0}, Lbe3;->u()J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v20

    move/from16 v22, v11

    .line 7
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    long-to-int v11, v11

    .line 8
    invoke-virtual {v0}, Lbe3;->E()I

    move-result v12

    .line 9
    invoke-virtual {v0, v14}, Lbe3;->O(I)V

    move/from16 v20, v14

    .line 10
    invoke-virtual {v0}, Lbe3;->E()I

    move-result v14

    .line 11
    invoke-virtual {v0}, Lbe3;->E()I

    move-result v21

    and-int/lit8 v23, v21, 0x1

    if-eqz v23, :cond_3

    move/from16 v23, v9

    goto :goto_1

    :cond_3
    const/16 v23, 0x0

    :goto_1
    and-int/lit8 v21, v21, 0x2

    if-eqz v21, :cond_4

    move/from16 v21, v9

    goto :goto_2

    :cond_4
    const/16 v21, 0x0

    :goto_2
    if-nez v23, :cond_b

    if-ne v14, v10, :cond_5

    const/4 v14, 0x3

    goto :goto_3

    :cond_5
    if-ne v14, v13, :cond_7

    if-eqz v21, :cond_6

    const/high16 v14, 0x10000000

    goto :goto_3

    :cond_6
    move/from16 v14, v22

    goto :goto_3

    :cond_7
    if-ne v14, v15, :cond_9

    if-eqz v21, :cond_8

    const/high16 v14, 0x50000000

    goto :goto_3

    :cond_8
    const/16 v14, 0x15

    goto :goto_3

    :cond_9
    const/16 v15, 0x20

    if-ne v14, v15, :cond_c

    if-eqz v21, :cond_a

    const/high16 v14, 0x60000000

    goto :goto_3

    :cond_a
    const/16 v14, 0x16

    goto :goto_3

    :cond_b
    const/16 v15, 0x20

    if-ne v14, v15, :cond_c

    move/from16 v14, v20

    goto :goto_3

    :cond_c
    const/4 v14, -0x1

    .line 12
    :goto_3
    invoke-virtual {v0, v10}, Lbe3;->O(I)V

    move v15, v12

    move v12, v11

    move v11, v15

    const/4 v15, 0x0

    goto :goto_5

    .line 13
    :goto_4
    invoke-virtual {v0}, Lbe3;->H()I

    move-result v11

    const/4 v14, 0x6

    .line 14
    invoke-virtual {v0, v14}, Lbe3;->O(I)V

    .line 15
    invoke-virtual {v0}, Lbe3;->B()I

    move-result v14

    .line 16
    iget v15, v0, Lbe3;->b:I

    add-int/lit8 v15, v15, -0x4

    .line 17
    invoke-virtual {v0, v15}, Lbe3;->N(I)V

    .line 18
    invoke-virtual {v0}, Lbe3;->m()I

    move-result v15

    if-ne v12, v9, :cond_d

    .line 19
    invoke-virtual {v0, v13}, Lbe3;->O(I)V

    :cond_d
    move v12, v14

    const/4 v14, -0x1

    :goto_5
    const v13, 0x73617762

    const v10, 0x73616d72

    const v9, 0x69616d66

    if-ne v1, v9, :cond_e

    const/4 v11, -0x1

    const/4 v12, -0x1

    goto :goto_7

    :cond_e
    if-ne v1, v10, :cond_f

    const/16 v11, 0x1f40

    :goto_6
    move v12, v11

    const/4 v11, 0x1

    goto :goto_7

    :cond_f
    if-ne v1, v13, :cond_10

    const/16 v11, 0x3e80

    goto :goto_6

    .line 20
    :cond_10
    :goto_7
    iget v9, v0, Lbe3;->b:I

    const v13, 0x656e6361

    if-ne v1, v13, :cond_13

    .line 21
    invoke-static {v0, v2, v3}, Lwu;->h(Lbe3;II)Landroid/util/Pair;

    move-result-object v13

    if-eqz v13, :cond_12

    .line 22
    iget-object v1, v13, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v5, :cond_11

    const/4 v10, 0x0

    goto :goto_8

    .line 23
    :cond_11
    iget-object v10, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Lqv4;

    iget-object v10, v10, Lqv4;->b:Ljava/lang/String;

    invoke-virtual {v5, v10}, Low0;->a(Ljava/lang/String;)Low0;

    move-result-object v5

    move-object v10, v5

    .line 24
    :goto_8
    iget-object v5, v6, Ltu;->c:Ljava/lang/Object;

    check-cast v5, [Lqv4;

    iget-object v13, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, Lqv4;

    aput-object v13, v5, p9

    goto :goto_9

    :cond_12
    move-object v10, v5

    .line 25
    :goto_9
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    goto :goto_a

    :cond_13
    move-object v10, v5

    :goto_a
    const v5, 0x61632d33

    .line 26
    const-string v13, "audio/mhm1"

    const-string v29, "audio/ac4"

    const-string v30, "audio/eac3"

    const-string v31, "audio/ac3"

    const-string v32, "audio/raw"

    if-ne v1, v5, :cond_14

    move-object/from16 v5, v31

    goto/16 :goto_e

    :cond_14
    const v5, 0x65632d33

    if-ne v1, v5, :cond_15

    move-object/from16 v5, v30

    goto/16 :goto_e

    :cond_15
    const v5, 0x61632d34

    if-ne v1, v5, :cond_16

    move-object/from16 v5, v29

    goto/16 :goto_e

    :cond_16
    const v5, 0x64747363

    if-ne v1, v5, :cond_17

    .line 27
    const-string v5, "audio/vnd.dts"

    goto/16 :goto_e

    :cond_17
    const v5, 0x64747368

    if-eq v1, v5, :cond_2c

    const v5, 0x6474736c

    if-ne v1, v5, :cond_18

    goto/16 :goto_d

    :cond_18
    const v5, 0x64747365

    if-ne v1, v5, :cond_19

    .line 28
    const-string v5, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_e

    :cond_19
    const v5, 0x64747378

    if-ne v1, v5, :cond_1a

    .line 29
    const-string v5, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_e

    :cond_1a
    const v5, 0x73616d72

    if-ne v1, v5, :cond_1b

    .line 30
    const-string v5, "audio/3gpp"

    goto/16 :goto_e

    :cond_1b
    const v5, 0x73617762

    if-ne v1, v5, :cond_1c

    .line 31
    const-string v5, "audio/amr-wb"

    goto/16 :goto_e

    :cond_1c
    const v5, 0x736f7774

    if-ne v1, v5, :cond_1e

    :goto_b
    move/from16 v14, v22

    :cond_1d
    move-object/from16 v5, v32

    goto/16 :goto_e

    :cond_1e
    const v5, 0x74776f73

    if-ne v1, v5, :cond_1f

    move-object/from16 v5, v32

    const/high16 v14, 0x10000000

    goto/16 :goto_e

    :cond_1f
    const v5, 0x6c70636d

    if-ne v1, v5, :cond_20

    const/4 v5, -0x1

    if-ne v14, v5, :cond_1d

    goto :goto_b

    :cond_20
    const v5, 0x2e6d7032

    if-eq v1, v5, :cond_2b

    const v5, 0x2e6d7033

    if-ne v1, v5, :cond_21

    goto :goto_c

    :cond_21
    const v5, 0x6d686131

    if-ne v1, v5, :cond_22

    .line 32
    const-string v5, "audio/mha1"

    goto :goto_e

    :cond_22
    const v5, 0x6d686d31

    if-ne v1, v5, :cond_23

    move-object v5, v13

    goto :goto_e

    :cond_23
    const v5, 0x616c6163

    if-ne v1, v5, :cond_24

    .line 33
    const-string v5, "audio/alac"

    goto :goto_e

    :cond_24
    const v5, 0x616c6177

    if-ne v1, v5, :cond_25

    .line 34
    const-string v5, "audio/g711-alaw"

    goto :goto_e

    :cond_25
    const v5, 0x756c6177

    if-ne v1, v5, :cond_26

    .line 35
    const-string v5, "audio/g711-mlaw"

    goto :goto_e

    :cond_26
    const v5, 0x4f707573

    if-ne v1, v5, :cond_27

    .line 36
    const-string v5, "audio/opus"

    goto :goto_e

    :cond_27
    const v5, 0x664c6143

    if-ne v1, v5, :cond_28

    .line 37
    const-string v5, "audio/flac"

    goto :goto_e

    :cond_28
    const v5, 0x6d6c7061

    if-ne v1, v5, :cond_29

    .line 38
    const-string v5, "audio/true-hd"

    goto :goto_e

    :cond_29
    const v5, 0x69616d66

    if-ne v1, v5, :cond_2a

    .line 39
    const-string v5, "audio/iamf"

    goto :goto_e

    :cond_2a
    const/4 v5, 0x0

    goto :goto_e

    .line 40
    :cond_2b
    :goto_c
    const-string v5, "audio/mpeg"

    goto :goto_e

    .line 41
    :cond_2c
    :goto_d
    const-string v5, "audio/vnd.dts.hd"

    :goto_e
    move-object/from16 v16, v7

    move-object/from16 v26, v8

    const/16 p7, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/16 v33, 0x0

    :goto_f
    sub-int v8, v9, p2

    if-ge v8, v3, :cond_a1

    .line 42
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    .line 43
    invoke-virtual {v0}, Lbe3;->m()I

    move-result v8

    if-lez v8, :cond_2d

    const/4 v3, 0x1

    :goto_10
    move/from16 v27, v14

    goto :goto_11

    :cond_2d
    const/4 v3, 0x0

    goto :goto_10

    .line 44
    :goto_11
    const-string v14, "childAtomSize must be positive"

    invoke-static {v14, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 45
    invoke-virtual {v0}, Lbe3;->m()I

    move-result v3

    move-object/from16 v28, v2

    const v2, 0x6d686143

    if-ne v3, v2, :cond_30

    add-int/lit8 v2, v9, 0x8

    .line 46
    invoke-virtual {v0, v2}, Lbe3;->N(I)V

    const/4 v2, 0x1

    .line 47
    invoke-virtual {v0, v2}, Lbe3;->O(I)V

    .line 48
    invoke-virtual {v0}, Lbe3;->A()I

    move-result v3

    .line 49
    invoke-virtual {v0, v2}, Lbe3;->O(I)V

    .line 50
    invoke-static {v5, v13}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "mhm1.%02X"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_12

    .line 52
    :cond_2e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "mha1.%02X"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 53
    :goto_12
    invoke-virtual {v0}, Lbe3;->H()I

    move-result v3

    .line 54
    new-array v14, v3, [B

    move-object/from16 p9, v2

    const/4 v2, 0x0

    .line 55
    invoke-virtual {v0, v14, v2, v3}, Lbe3;->k([BII)V

    if-nez v7, :cond_2f

    .line 56
    invoke-static {v14}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    move-result-object v3

    move-object v7, v3

    goto :goto_13

    .line 57
    :cond_2f
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v14, v3}, Lyw1;->p(Ljava/lang/Object;Ljava/lang/Object;)Lgy3;

    move-result-object v2

    move-object v7, v2

    :goto_13
    move-object/from16 v2, p9

    move-object/from16 v38, v7

    move/from16 v39, v8

    move-object/from16 v35, v13

    :goto_14
    const/4 v14, 0x0

    const/16 v17, 0x3

    move-object/from16 v8, p7

    move v7, v1

    goto/16 :goto_62

    :cond_30
    const v2, 0x6d686150

    if-ne v3, v2, :cond_33

    add-int/lit8 v2, v9, 0x8

    .line 58
    invoke-virtual {v0, v2}, Lbe3;->N(I)V

    .line 59
    invoke-virtual {v0}, Lbe3;->A()I

    move-result v2

    if-lez v2, :cond_32

    .line 60
    new-array v3, v2, [B

    const/4 v14, 0x0

    .line 61
    invoke-virtual {v0, v3, v14, v2}, Lbe3;->k([BII)V

    if-nez v7, :cond_31

    .line 62
    invoke-static {v3}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    move-result-object v7

    goto :goto_15

    .line 63
    :cond_31
    invoke-interface {v7, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v2, v3}, Lyw1;->p(Ljava/lang/Object;Ljava/lang/Object;)Lgy3;

    move-result-object v7

    :cond_32
    :goto_15
    move-object/from16 v38, v7

    move/from16 v39, v8

    move-object/from16 v35, v13

    move-object/from16 v2, v28

    goto :goto_14

    :cond_33
    const v2, 0x65736473

    if-eq v3, v2, :cond_34

    if-eqz p6, :cond_35

    const v2, 0x77617665

    if-ne v3, v2, :cond_35

    :cond_34
    move-object/from16 v36, v5

    move-object/from16 v38, v7

    move/from16 v39, v8

    move/from16 v43, v9

    move v2, v11

    move-object/from16 v35, v13

    move/from16 v13, v20

    const/4 v5, 0x6

    const/16 v8, 0x20

    const/16 v11, 0x10

    const/16 v17, 0x3

    move v7, v1

    const v1, 0x65736473

    goto/16 :goto_55

    :cond_35
    const v2, 0x62747274

    if-ne v3, v2, :cond_36

    add-int/lit8 v2, v9, 0x8

    .line 64
    invoke-virtual {v0, v2}, Lbe3;->N(I)V

    move/from16 v2, v20

    .line 65
    invoke-virtual {v0, v2}, Lbe3;->O(I)V

    .line 66
    invoke-virtual {v0}, Lbe3;->C()J

    move-result-wide v2

    move-object/from16 v35, v13

    .line 67
    invoke-virtual {v0}, Lbe3;->C()J

    move-result-wide v13

    move-object/from16 v36, v5

    .line 68
    new-instance v5, Lpu;

    invoke-direct {v5, v13, v14, v2, v3}, Lpu;-><init>(JJ)V

    move-object/from16 v33, v5

    move-object/from16 v38, v7

    move/from16 v39, v8

    move-object/from16 v2, v28

    move-object/from16 v5, v36

    goto/16 :goto_14

    :cond_36
    move-object/from16 v36, v5

    move-object/from16 v35, v13

    const v2, 0x64616333

    if-ne v3, v2, :cond_38

    add-int/lit8 v2, v9, 0x8

    .line 69
    invoke-virtual {v0, v2}, Lbe3;->N(I)V

    .line 70
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 71
    new-instance v3, Lh00;

    invoke-direct {v3}, Lh00;-><init>()V

    .line 72
    invoke-virtual {v3, v0}, Lh00;->p(Lbe3;)V

    move/from16 v13, v22

    .line 73
    invoke-virtual {v3, v13}, Lh00;->i(I)I

    move-result v14

    .line 74
    aget v13, v26, v14

    const/16 v14, 0x8

    .line 75
    invoke-virtual {v3, v14}, Lh00;->t(I)V

    const/4 v14, 0x3

    .line 76
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v34

    aget v14, v16, v34

    const/4 v5, 0x1

    .line 77
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    move-result v37

    if-eqz v37, :cond_37

    add-int/lit8 v14, v14, 0x1

    :cond_37
    const/4 v5, 0x5

    .line 78
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    move-result v5

    .line 79
    sget-object v34, Lfu;->r:[I

    aget v5, v34, v5

    mul-int/lit16 v5, v5, 0x3e8

    .line 80
    invoke-virtual {v3}, Lh00;->c()V

    .line 81
    invoke-virtual {v3}, Lh00;->f()I

    move-result v3

    invoke-virtual {v0, v3}, Lbe3;->N(I)V

    .line 82
    new-instance v3, Lsb1;

    invoke-direct {v3}, Lsb1;-><init>()V

    .line 83
    iput-object v2, v3, Lsb1;->a:Ljava/lang/String;

    .line 84
    invoke-static/range {v31 .. v31}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lsb1;->m:Ljava/lang/String;

    .line 85
    iput v14, v3, Lsb1;->E:I

    .line 86
    iput v13, v3, Lsb1;->F:I

    .line 87
    iput-object v10, v3, Lsb1;->q:Low0;

    .line 88
    iput-object v4, v3, Lsb1;->d:Ljava/lang/String;

    .line 89
    iput v5, v3, Lsb1;->h:I

    .line 90
    iput v5, v3, Lsb1;->i:I

    .line 91
    new-instance v2, Ltb1;

    invoke-direct {v2, v3}, Ltb1;-><init>(Lsb1;)V

    .line 92
    iput-object v2, v6, Ltu;->d:Ljava/lang/Object;

    move-object/from16 v38, v7

    move/from16 v39, v8

    move/from16 v43, v9

    move v2, v11

    const/4 v5, 0x6

    const/16 v8, 0x20

    const/16 v11, 0x10

    const/4 v13, 0x4

    const/16 v17, 0x3

    move v7, v1

    goto/16 :goto_54

    :cond_38
    const v2, 0x64656333

    const/16 v5, 0xa

    const/16 v13, 0xd

    if-ne v3, v2, :cond_3d

    add-int/lit8 v2, v9, 0x8

    .line 93
    invoke-virtual {v0, v2}, Lbe3;->N(I)V

    .line 94
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 95
    new-instance v3, Lh00;

    invoke-direct {v3}, Lh00;-><init>()V

    .line 96
    invoke-virtual {v3, v0}, Lh00;->p(Lbe3;)V

    .line 97
    invoke-virtual {v3, v13}, Lh00;->i(I)I

    move-result v13

    mul-int/lit16 v13, v13, 0x3e8

    const/4 v14, 0x3

    .line 98
    invoke-virtual {v3, v14}, Lh00;->t(I)V

    const/4 v14, 0x2

    .line 99
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v34

    .line 100
    aget v14, v26, v34

    .line 101
    invoke-virtual {v3, v5}, Lh00;->t(I)V

    const/4 v5, 0x3

    .line 102
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    move-result v17

    aget v17, v16, v17

    const/4 v5, 0x1

    .line 103
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    move-result v25

    if-eqz v25, :cond_39

    add-int/lit8 v17, v17, 0x1

    :cond_39
    move/from16 v25, v17

    const/4 v5, 0x3

    .line 104
    invoke-virtual {v3, v5}, Lh00;->t(I)V

    const/4 v5, 0x4

    .line 105
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    move-result v38

    const/4 v5, 0x1

    .line 106
    invoke-virtual {v3, v5}, Lh00;->t(I)V

    if-lez v38, :cond_3b

    move-object/from16 v38, v7

    const/4 v7, 0x6

    .line 107
    invoke-virtual {v3, v7}, Lh00;->t(I)V

    .line 108
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    move-result v7

    if-eqz v7, :cond_3a

    add-int/lit8 v25, v25, 0x2

    .line 109
    :cond_3a
    invoke-virtual {v3, v5}, Lh00;->t(I)V

    :goto_16
    move/from16 v7, v25

    goto :goto_17

    :cond_3b
    move-object/from16 v38, v7

    goto :goto_16

    .line 110
    :goto_17
    invoke-virtual {v3}, Lh00;->b()I

    move-result v5

    move/from16 v39, v8

    const/4 v8, 0x7

    if-le v5, v8, :cond_3c

    .line 111
    invoke-virtual {v3, v8}, Lh00;->t(I)V

    const/4 v5, 0x1

    .line 112
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    move-result v8

    if-eqz v8, :cond_3c

    .line 113
    const-string v5, "audio/eac3-joc"

    goto :goto_18

    :cond_3c
    move-object/from16 v5, v30

    .line 114
    :goto_18
    invoke-virtual {v3}, Lh00;->c()V

    .line 115
    invoke-virtual {v3}, Lh00;->f()I

    move-result v3

    invoke-virtual {v0, v3}, Lbe3;->N(I)V

    .line 116
    new-instance v3, Lsb1;

    invoke-direct {v3}, Lsb1;-><init>()V

    .line 117
    iput-object v2, v3, Lsb1;->a:Ljava/lang/String;

    .line 118
    invoke-static {v5}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lsb1;->m:Ljava/lang/String;

    .line 119
    iput v7, v3, Lsb1;->E:I

    .line 120
    iput v14, v3, Lsb1;->F:I

    .line 121
    iput-object v10, v3, Lsb1;->q:Low0;

    .line 122
    iput-object v4, v3, Lsb1;->d:Ljava/lang/String;

    .line 123
    iput v13, v3, Lsb1;->i:I

    .line 124
    new-instance v2, Ltb1;

    invoke-direct {v2, v3}, Ltb1;-><init>(Lsb1;)V

    .line 125
    iput-object v2, v6, Ltu;->d:Ljava/lang/Object;

    move v7, v1

    move/from16 v43, v9

    move v2, v11

    const/4 v5, 0x6

    const/16 v8, 0x20

    const/16 v11, 0x10

    :goto_19
    const/4 v13, 0x4

    const/16 v17, 0x3

    goto/16 :goto_54

    :cond_3d
    move-object/from16 v38, v7

    move/from16 v39, v8

    const v2, 0x64616334

    const/16 v14, 0x9

    if-ne v3, v2, :cond_79

    add-int/lit8 v2, v9, 0x8

    .line 126
    invoke-virtual {v0, v2}, Lbe3;->N(I)V

    .line 127
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 128
    new-instance v3, Lh00;

    invoke-direct {v3}, Lh00;-><init>()V

    .line 129
    invoke-virtual {v3, v0}, Lh00;->p(Lbe3;)V

    .line 130
    invoke-virtual {v3}, Lh00;->b()I

    move-result v40

    const/4 v13, 0x3

    .line 131
    invoke-virtual {v3, v13}, Lh00;->i(I)I

    move-result v5

    const/4 v13, 0x1

    if-gt v5, v13, :cond_78

    const/4 v7, 0x7

    .line 132
    invoke-virtual {v3, v7}, Lh00;->i(I)I

    move-result v8

    .line 133
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v7

    if-eqz v7, :cond_3e

    const v7, 0xbb80

    :goto_1a
    const/4 v13, 0x4

    goto :goto_1b

    :cond_3e
    const v7, 0xac44

    goto :goto_1a

    .line 134
    :goto_1b
    invoke-virtual {v3, v13}, Lh00;->t(I)V

    .line 135
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v13

    const/4 v14, 0x1

    if-le v8, v14, :cond_40

    if-eqz v5, :cond_3f

    .line 136
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v14

    if-eqz v14, :cond_40

    const/16 v14, 0x10

    .line 137
    invoke-virtual {v3, v14}, Lh00;->t(I)V

    .line 138
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v14

    if-eqz v14, :cond_40

    const/16 v14, 0x80

    .line 139
    invoke-virtual {v3, v14}, Lh00;->t(I)V

    goto :goto_1c

    .line 140
    :cond_3f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_40
    :goto_1c
    const/4 v14, 0x1

    if-ne v5, v14, :cond_42

    .line 141
    invoke-virtual {v3}, Lh00;->b()I

    move-result v14

    move/from16 v42, v8

    const/16 v8, 0x42

    if-lt v14, v8, :cond_41

    .line 142
    invoke-virtual {v3, v8}, Lh00;->t(I)V

    .line 143
    invoke-virtual {v3}, Lh00;->c()V

    goto :goto_1d

    .line 144
    :cond_41
    const-string v0, "Invalid AC-4 DSI bitrate."

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_42
    move/from16 v42, v8

    .line 145
    :goto_1d
    new-instance v8, Lu2;

    .line 146
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    const/4 v14, 0x1

    .line 147
    iput-boolean v14, v8, Lu2;->a:Z

    const/4 v14, -0x1

    .line 148
    iput v14, v8, Lu2;->b:I

    .line 149
    iput v14, v8, Lu2;->c:I

    const/4 v14, 0x1

    .line 150
    iput-boolean v14, v8, Lu2;->d:Z

    move/from16 v43, v9

    const/4 v9, 0x2

    .line 151
    iput v9, v8, Lu2;->e:I

    .line 152
    iput v14, v8, Lu2;->f:I

    const/4 v14, 0x0

    .line 153
    iput v14, v8, Lu2;->g:I

    const/4 v9, 0x0

    :goto_1e
    if-ge v9, v13, :cond_68

    if-nez v5, :cond_43

    .line 154
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v13

    const/4 v14, 0x5

    .line 155
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v41

    .line 156
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v44

    move/from16 v45, v12

    move/from16 p9, v13

    move/from16 v13, v41

    move/from16 v14, v44

    const/4 v12, 0x0

    const/16 v41, 0x0

    const/16 v44, 0x0

    goto :goto_22

    :cond_43
    move/from16 v44, v13

    const/16 v14, 0x8

    .line 157
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v13

    move/from16 v45, v12

    .line 158
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v12

    const/16 v14, 0xff

    if-ne v12, v14, :cond_44

    const/16 v14, 0x10

    .line 159
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v46

    add-int v46, v46, v12

    :goto_1f
    const/4 v14, 0x2

    goto :goto_20

    :cond_44
    move/from16 v46, v12

    goto :goto_1f

    :goto_20
    if-le v13, v14, :cond_45

    mul-int/lit8 v12, v46, 0x8

    .line 160
    invoke-virtual {v3, v12}, Lh00;->t(I)V

    add-int/lit8 v9, v9, 0x1

    move/from16 v13, v44

    move/from16 v12, v45

    goto :goto_1e

    .line 161
    :cond_45
    invoke-virtual {v3}, Lh00;->b()I

    move-result v12

    sub-int v12, v40, v12

    const/16 v24, 0x8

    div-int/lit8 v12, v12, 0x8

    move/from16 p9, v12

    const/4 v14, 0x5

    .line 162
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v12

    const/16 v14, 0x1f

    if-ne v12, v14, :cond_46

    const/4 v14, 0x1

    goto :goto_21

    :cond_46
    const/4 v14, 0x0

    :goto_21
    move/from16 v41, p9

    move/from16 v44, v14

    const/16 p9, 0x0

    move v14, v13

    move v13, v12

    move/from16 v12, v46

    .line 163
    :goto_22
    iput v14, v8, Lu2;->f:I

    move/from16 v46, v11

    if-nez p9, :cond_47

    if-nez v44, :cond_47

    const/4 v11, 0x6

    if-ne v13, v11, :cond_47

    move/from16 v47, v1

    move/from16 v48, v14

    const/4 v1, 0x1

    goto/16 :goto_35

    :cond_47
    move/from16 v47, v1

    const/4 v11, 0x3

    .line 164
    invoke-virtual {v3, v11}, Lh00;->i(I)I

    move-result v1

    iput v1, v8, Lu2;->g:I

    .line 165
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v1

    if-eqz v1, :cond_48

    const/4 v1, 0x5

    .line 166
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    :cond_48
    const/4 v1, 0x2

    .line 167
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    const/4 v11, 0x1

    if-ne v5, v11, :cond_49

    if-eq v14, v11, :cond_4a

    if-ne v14, v1, :cond_49

    goto :goto_24

    :cond_49
    :goto_23
    const/4 v1, 0x5

    goto :goto_25

    .line 168
    :cond_4a
    :goto_24
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    goto :goto_23

    .line 169
    :goto_25
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    const/16 v1, 0xa

    .line 170
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    if-ne v5, v11, :cond_51

    if-lez v14, :cond_4b

    .line 171
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v1

    iput-boolean v1, v8, Lu2;->a:Z

    .line 172
    :cond_4b
    iget-boolean v1, v8, Lu2;->a:Z

    if-eqz v1, :cond_50

    if-eq v14, v11, :cond_4c

    const/4 v1, 0x2

    if-ne v14, v1, :cond_4d

    :cond_4c
    const/4 v1, 0x5

    goto :goto_27

    :cond_4d
    :goto_26
    const/16 v11, 0x18

    goto :goto_28

    .line 173
    :goto_27
    invoke-virtual {v3, v1}, Lh00;->i(I)I

    move-result v11

    if-ltz v11, :cond_4e

    const/16 v1, 0xf

    if-gt v11, v1, :cond_4e

    .line 174
    iput v11, v8, Lu2;->b:I

    :cond_4e
    const/16 v1, 0xb

    if-lt v11, v1, :cond_4f

    const/16 v1, 0xe

    if-gt v11, v1, :cond_4f

    .line 175
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v1

    iput-boolean v1, v8, Lu2;->d:Z

    const/4 v1, 0x2

    .line 176
    invoke-virtual {v3, v1}, Lh00;->i(I)I

    move-result v11

    iput v11, v8, Lu2;->e:I

    goto :goto_26

    :cond_4f
    const/4 v1, 0x2

    goto :goto_26

    .line 177
    :goto_28
    invoke-virtual {v3, v11}, Lh00;->t(I)V

    const/4 v11, 0x1

    goto :goto_29

    :cond_50
    const/4 v1, 0x2

    :goto_29
    if-eq v14, v11, :cond_52

    if-ne v14, v1, :cond_51

    goto :goto_2a

    :cond_51
    move/from16 v48, v14

    goto :goto_2c

    .line 178
    :cond_52
    :goto_2a
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v11

    if-eqz v11, :cond_53

    .line 179
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v11

    if-eqz v11, :cond_53

    .line 180
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    .line 181
    :cond_53
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v1

    if-eqz v1, :cond_51

    .line 182
    invoke-virtual {v3}, Lh00;->s()V

    const/16 v1, 0x8

    .line 183
    invoke-virtual {v3, v1}, Lh00;->i(I)I

    move-result v11

    move/from16 v48, v14

    const/4 v14, 0x0

    :goto_2b
    if-ge v14, v11, :cond_54

    .line 184
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    add-int/lit8 v14, v14, 0x1

    const/16 v1, 0x8

    goto :goto_2b

    :cond_54
    :goto_2c
    if-nez p9, :cond_5c

    if-eqz v44, :cond_55

    goto/16 :goto_33

    .line 185
    :cond_55
    invoke-virtual {v3}, Lh00;->s()V

    if-eqz v13, :cond_5a

    const/4 v14, 0x1

    if-eq v13, v14, :cond_5a

    const/4 v1, 0x2

    if-eq v13, v1, :cond_5a

    const/4 v14, 0x3

    if-eq v13, v14, :cond_58

    const/4 v1, 0x4

    if-eq v13, v1, :cond_58

    const/4 v1, 0x5

    if-eq v13, v1, :cond_56

    const/4 v1, 0x7

    .line 186
    invoke-virtual {v3, v1}, Lh00;->i(I)I

    move-result v11

    const/4 v1, 0x0

    :goto_2d
    if-ge v1, v11, :cond_5e

    const/16 v14, 0x8

    .line 187
    invoke-virtual {v3, v14}, Lh00;->t(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2d

    :cond_56
    if-nez v48, :cond_57

    .line 188
    invoke-static {v3, v8}, Lhw;->E(Lh00;Lu2;)V

    goto :goto_34

    :cond_57
    const/4 v14, 0x3

    .line 189
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v1

    const/4 v11, 0x0

    :goto_2e
    const/16 v22, 0x2

    add-int/lit8 v13, v1, 0x2

    if-ge v11, v13, :cond_5e

    .line 190
    invoke-static {v3, v8}, Lhw;->F(Lh00;Lu2;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_2e

    :cond_58
    if-nez v48, :cond_59

    const/4 v1, 0x0

    const/4 v14, 0x3

    :goto_2f
    if-ge v1, v14, :cond_5e

    .line 191
    invoke-static {v3, v8}, Lhw;->E(Lh00;Lu2;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2f

    :cond_59
    const/4 v1, 0x0

    :goto_30
    const/4 v14, 0x3

    if-ge v1, v14, :cond_5e

    .line 192
    invoke-static {v3, v8}, Lhw;->F(Lh00;Lu2;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_30

    :cond_5a
    if-nez v48, :cond_5b

    const/4 v1, 0x0

    const/4 v14, 0x2

    :goto_31
    if-ge v1, v14, :cond_5e

    .line 193
    invoke-static {v3, v8}, Lhw;->E(Lh00;Lu2;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_31

    :cond_5b
    const/4 v1, 0x0

    :goto_32
    const/4 v14, 0x2

    if-ge v1, v14, :cond_5e

    .line 194
    invoke-static {v3, v8}, Lhw;->F(Lh00;Lu2;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_32

    :cond_5c
    :goto_33
    if-nez v48, :cond_5d

    .line 195
    invoke-static {v3, v8}, Lhw;->E(Lh00;Lu2;)V

    goto :goto_34

    .line 196
    :cond_5d
    invoke-static {v3, v8}, Lhw;->F(Lh00;Lu2;)V

    .line 197
    :cond_5e
    :goto_34
    invoke-virtual {v3}, Lh00;->s()V

    .line 198
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v1

    :goto_35
    if-eqz v1, :cond_5f

    const/4 v1, 0x7

    .line 199
    invoke-virtual {v3, v1}, Lh00;->i(I)I

    move-result v11

    const/4 v13, 0x0

    :goto_36
    if-ge v13, v11, :cond_60

    const/16 v14, 0xf

    .line 200
    invoke-virtual {v3, v14}, Lh00;->t(I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_36

    :cond_5f
    const/4 v1, 0x7

    :cond_60
    if-lez v48, :cond_64

    .line 201
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v11

    if-eqz v11, :cond_62

    .line 202
    invoke-virtual {v3}, Lh00;->b()I

    move-result v11

    const/16 v13, 0x42

    if-lt v11, v13, :cond_61

    .line 203
    invoke-virtual {v3, v13}, Lh00;->t(I)V

    goto :goto_37

    .line 204
    :cond_61
    const-string v0, "Can\'t parse bitrate DSI."

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 205
    :cond_62
    :goto_37
    invoke-virtual {v3}, Lh00;->h()Z

    move-result v11

    if-eqz v11, :cond_64

    .line 206
    invoke-virtual {v3}, Lh00;->c()V

    const/16 v11, 0x10

    .line 207
    invoke-virtual {v3, v11}, Lh00;->i(I)I

    move-result v13

    .line 208
    invoke-virtual {v3, v13}, Lh00;->u(I)V

    const/4 v14, 0x5

    .line 209
    invoke-virtual {v3, v14}, Lh00;->i(I)I

    move-result v13

    const/4 v14, 0x0

    :goto_38
    if-ge v14, v13, :cond_63

    const/4 v1, 0x3

    .line 210
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    const/16 v1, 0x8

    .line 211
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    add-int/lit8 v14, v14, 0x1

    const/4 v1, 0x7

    goto :goto_38

    :cond_63
    const/16 v1, 0x8

    goto :goto_39

    :cond_64
    const/16 v1, 0x8

    const/16 v11, 0x10

    .line 212
    :goto_39
    invoke-virtual {v3}, Lh00;->c()V

    const/4 v14, 0x1

    if-ne v5, v14, :cond_66

    .line 213
    invoke-virtual {v3}, Lh00;->b()I

    move-result v5

    sub-int v40, v40, v5

    div-int/lit8 v40, v40, 0x8

    sub-int v5, v40, v41

    if-lt v12, v5, :cond_65

    sub-int/2addr v12, v5

    .line 214
    invoke-virtual {v3, v12}, Lh00;->u(I)V

    goto :goto_3a

    .line 215
    :cond_65
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 216
    :cond_66
    :goto_3a
    iget-boolean v3, v8, Lu2;->a:Z

    if-eqz v3, :cond_69

    iget v3, v8, Lu2;->b:I

    const/4 v14, -0x1

    if-eq v3, v14, :cond_67

    goto :goto_3b

    .line 217
    :cond_67
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t determine channel mode of presentation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_68
    move/from16 v47, v1

    move/from16 v46, v11

    move/from16 v45, v12

    const/16 v1, 0x8

    const/16 v11, 0x10

    .line 218
    :cond_69
    :goto_3b
    iget-boolean v3, v8, Lu2;->a:Z

    const/16 v5, 0xc

    if-eqz v3, :cond_6f

    .line 219
    iget v3, v8, Lu2;->b:I

    iget-boolean v9, v8, Lu2;->d:Z

    iget v12, v8, Lu2;->e:I

    packed-switch v3, :pswitch_data_0

    const/16 v13, 0xb

    const/16 v34, -0x1

    goto :goto_3d

    :pswitch_0
    const/16 v13, 0xb

    const/16 v34, 0x18

    goto :goto_3d

    :pswitch_1
    const/16 v13, 0xb

    const/16 v34, 0xe

    goto :goto_3d

    :pswitch_2
    const/16 v13, 0xb

    const/16 v34, 0xd

    goto :goto_3d

    :pswitch_3
    move/from16 v34, v5

    :goto_3c
    const/16 v13, 0xb

    goto :goto_3d

    :pswitch_4
    const/16 v13, 0xb

    const/16 v34, 0xb

    goto :goto_3d

    :pswitch_5
    move/from16 v34, v1

    goto :goto_3c

    :pswitch_6
    const/16 v13, 0xb

    const/16 v34, 0x7

    goto :goto_3d

    :pswitch_7
    const/16 v13, 0xb

    const/16 v34, 0x6

    goto :goto_3d

    :pswitch_8
    const/16 v13, 0xb

    const/16 v34, 0x5

    goto :goto_3d

    :pswitch_9
    const/16 v13, 0xb

    const/16 v34, 0x3

    goto :goto_3d

    :pswitch_a
    const/16 v13, 0xb

    const/16 v34, 0x2

    goto :goto_3d

    :pswitch_b
    const/16 v13, 0xb

    const/16 v34, 0x1

    :goto_3d
    if-eq v3, v13, :cond_6a

    if-eq v3, v5, :cond_6a

    const/16 v5, 0xd

    if-eq v3, v5, :cond_6a

    const/16 v5, 0xe

    if-ne v3, v5, :cond_6e

    :cond_6a
    if-nez v9, :cond_6b

    add-int/lit8 v34, v34, -0x2

    :cond_6b
    if-eqz v12, :cond_6d

    const/4 v14, 0x1

    if-eq v12, v14, :cond_6c

    goto :goto_3e

    :cond_6c
    add-int/lit8 v34, v34, -0x2

    goto :goto_3e

    :cond_6d
    add-int/lit8 v34, v34, -0x4

    :cond_6e
    :goto_3e
    move/from16 v3, v34

    goto :goto_3f

    .line 220
    :cond_6f
    iget v3, v8, Lu2;->c:I

    .line 221
    iget v9, v8, Lu2;->g:I

    if-lez v3, :cond_70

    add-int/lit8 v3, v3, 0x1

    const/4 v13, 0x4

    if-ne v9, v13, :cond_76

    const/16 v5, 0x11

    if-ne v3, v5, :cond_76

    const/16 v3, 0x15

    goto :goto_3f

    :cond_70
    if-eqz v9, :cond_71

    const/4 v14, 0x1

    if-eq v9, v14, :cond_75

    const/4 v14, 0x2

    if-eq v9, v14, :cond_74

    const/4 v14, 0x3

    if-eq v9, v14, :cond_73

    const/4 v13, 0x4

    if-eq v9, v13, :cond_72

    .line 222
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "AC-4 level "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v8, Lu2;->g:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " has not been defined."

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Ac4Util"

    invoke-static {v5, v3}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_71
    const/4 v3, 0x2

    goto :goto_3f

    :cond_72
    move v3, v5

    goto :goto_3f

    :cond_73
    const/16 v3, 0xa

    goto :goto_3f

    :cond_74
    move v3, v1

    goto :goto_3f

    :cond_75
    const/4 v3, 0x6

    :cond_76
    :goto_3f
    if-lez v3, :cond_77

    .line 223
    iget v5, v8, Lu2;->f:I

    iget v8, v8, Lu2;->g:I

    .line 224
    invoke-static/range {v42 .. v42}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v9, v5, v8}, [Ljava/lang/Object;

    move-result-object v5

    .line 225
    sget-object v8, Lf35;->a:Ljava/lang/String;

    .line 226
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "ac-4.%02d.%02d.%02d"

    invoke-static {v8, v9, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 227
    new-instance v8, Lsb1;

    invoke-direct {v8}, Lsb1;-><init>()V

    .line 228
    iput-object v2, v8, Lsb1;->a:Ljava/lang/String;

    .line 229
    invoke-static/range {v29 .. v29}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v8, Lsb1;->m:Ljava/lang/String;

    .line 230
    iput v3, v8, Lsb1;->E:I

    .line 231
    iput v7, v8, Lsb1;->F:I

    .line 232
    iput-object v10, v8, Lsb1;->q:Low0;

    .line 233
    iput-object v4, v8, Lsb1;->d:Ljava/lang/String;

    .line 234
    iput-object v5, v8, Lsb1;->j:Ljava/lang/String;

    .line 235
    new-instance v2, Ltb1;

    invoke-direct {v2, v8}, Ltb1;-><init>(Lsb1;)V

    .line 236
    iput-object v2, v6, Ltu;->d:Ljava/lang/Object;

    move/from16 v12, v45

    move/from16 v2, v46

    move/from16 v7, v47

    const/4 v5, 0x6

    const/16 v8, 0x20

    goto/16 :goto_19

    .line 237
    :cond_77
    const-string v0, "Cannot determine channel count of presentation."

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 238
    :cond_78
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_79
    move/from16 v47, v1

    move/from16 v43, v9

    move/from16 v46, v11

    move/from16 v45, v12

    const/16 v1, 0x8

    const/16 v11, 0x10

    const v2, 0x646d6c70

    if-ne v3, v2, :cond_7b

    if-lez v15, :cond_7a

    move-object/from16 v8, p7

    move v12, v15

    move-object/from16 v2, v28

    move-object/from16 v5, v36

    move/from16 v9, v43

    move/from16 v7, v47

    const/4 v11, 0x2

    :goto_40
    const/4 v14, 0x0

    const/16 v17, 0x3

    goto/16 :goto_62

    .line 239
    :cond_7a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_7b
    const v2, 0x64647473

    if-eq v3, v2, :cond_7c

    const v2, 0x75647473

    if-ne v3, v2, :cond_7d

    :cond_7c
    move/from16 v7, v47

    const/4 v5, 0x6

    const/16 v8, 0x20

    const/4 v13, 0x4

    const/16 v17, 0x3

    goto/16 :goto_53

    :cond_7d
    const v2, 0x644f7073

    if-ne v3, v2, :cond_7e

    add-int/lit8 v8, v39, -0x8

    .line 240
    sget-object v2, Lwu;->a:[B

    array-length v3, v2

    add-int/2addr v3, v8

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    add-int/lit8 v9, v43, 0x8

    .line 241
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    .line 242
    array-length v2, v2

    invoke-virtual {v0, v3, v2, v8}, Lbe3;->k([BII)V

    .line 243
    invoke-static {v3}, Lsu3;->j([B)Ljava/util/ArrayList;

    move-result-object v7

    move-object/from16 v8, p7

    move-object/from16 v38, v7

    move-object/from16 v2, v28

    move-object/from16 v5, v36

    move/from16 v9, v43

    move/from16 v12, v45

    move/from16 v11, v46

    move/from16 v7, v47

    goto :goto_40

    :cond_7e
    const v2, 0x64664c61

    if-ne v3, v2, :cond_7f

    add-int/lit8 v8, v39, -0xc

    add-int/lit8 v2, v39, -0x8

    .line 244
    new-array v2, v2, [B

    const/16 v3, 0x66

    const/16 v18, 0x0

    .line 245
    aput-byte v3, v2, v18

    const/16 v3, 0x4c

    const/16 v25, 0x1

    .line 246
    aput-byte v3, v2, v25

    const/16 v3, 0x61

    const/16 v22, 0x2

    .line 247
    aput-byte v3, v2, v22

    const/16 v3, 0x43

    const/16 v17, 0x3

    .line 248
    aput-byte v3, v2, v17

    add-int/lit8 v9, v43, 0xc

    .line 249
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    const/4 v13, 0x4

    .line 250
    invoke-virtual {v0, v2, v13, v8}, Lbe3;->k([BII)V

    .line 251
    invoke-static {v2}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    move-result-object v7

    move-object/from16 v8, p7

    move-object/from16 v38, v7

    move-object/from16 v2, v28

    :goto_41
    move-object/from16 v5, v36

    move/from16 v9, v43

    move/from16 v12, v45

    move/from16 v11, v46

    move/from16 v7, v47

    :goto_42
    const/4 v14, 0x0

    goto/16 :goto_62

    :cond_7f
    const v5, 0x616c6163

    const/16 v17, 0x3

    if-ne v3, v5, :cond_80

    add-int/lit8 v8, v39, -0xc

    .line 252
    new-array v2, v8, [B

    add-int/lit8 v9, v43, 0xc

    .line 253
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    const/4 v3, 0x0

    .line 254
    invoke-virtual {v0, v2, v3, v8}, Lbe3;->k([BII)V

    .line 255
    sget-object v3, Li40;->a:[B

    .line 256
    new-instance v3, Lbe3;

    invoke-direct {v3, v2}, Lbe3;-><init>([B)V

    const/4 v7, 0x5

    .line 257
    invoke-virtual {v3, v7}, Lbe3;->N(I)V

    .line 258
    invoke-virtual {v3}, Lbe3;->A()I

    move-result v7

    .line 259
    invoke-virtual {v3, v14}, Lbe3;->N(I)V

    .line 260
    invoke-virtual {v3}, Lbe3;->A()I

    move-result v8

    const/16 v9, 0x14

    .line 261
    invoke-virtual {v3, v9}, Lbe3;->N(I)V

    .line 262
    invoke-virtual {v3}, Lbe3;->E()I

    move-result v3

    .line 263
    filled-new-array {v3, v8, v7}, [I

    move-result-object v3

    const/16 v18, 0x0

    .line 264
    aget v7, v3, v18

    const/16 v25, 0x1

    .line 265
    aget v8, v3, v25

    const/16 v22, 0x2

    .line 266
    aget v3, v3, v22

    .line 267
    sget-object v9, Lf35;->a:Ljava/lang/String;

    .line 268
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v9}, Lf35;->C(ILjava/nio/ByteOrder;)I

    move-result v3

    .line 269
    invoke-static {v2}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    move-result-object v2

    move-object/from16 v38, v2

    move/from16 v27, v3

    move v12, v7

    move v11, v8

    move-object/from16 v2, v28

    move-object/from16 v5, v36

    move/from16 v9, v43

    move/from16 v7, v47

    const/4 v14, 0x0

    move-object/from16 v8, p7

    goto/16 :goto_62

    :cond_80
    const v2, 0x69616362

    if-ne v3, v2, :cond_8f

    add-int/lit8 v9, v43, 0x9

    .line 270
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    .line 271
    invoke-virtual {v0}, Lbe3;->F()I

    move-result v2

    .line 272
    new-array v3, v2, [B

    const/4 v14, 0x0

    .line 273
    invoke-virtual {v0, v3, v14, v2}, Lbe3;->k([BII)V

    .line 274
    sget-object v2, Li40;->a:[B

    .line 275
    new-instance v2, Lbe3;

    invoke-direct {v2, v3}, Lbe3;-><init>([B)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 276
    :goto_43
    invoke-virtual {v2}, Lbe3;->a()I

    move-result v9

    if-lez v9, :cond_81

    if-eqz v7, :cond_82

    if-nez v8, :cond_81

    goto :goto_44

    :cond_81
    const/4 v5, 0x6

    const/4 v13, 0x4

    goto/16 :goto_4d

    .line 277
    :cond_82
    :goto_44
    invoke-virtual {v2}, Lbe3;->A()I

    move-result v9

    shr-int/lit8 v12, v9, 0x3

    and-int/lit8 v13, v9, 0x2

    if-eqz v13, :cond_83

    const/4 v13, 0x1

    goto :goto_45

    :cond_83
    const/4 v13, 0x0

    :goto_45
    and-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_84

    const/4 v9, 0x1

    goto :goto_46

    :cond_84
    const/4 v9, 0x0

    .line 278
    :goto_46
    invoke-virtual {v2}, Lbe3;->F()I

    move-result v14

    const/4 v1, 0x4

    if-le v12, v1, :cond_86

    const/16 v1, 0x18

    if-ge v12, v1, :cond_86

    if-eqz v13, :cond_86

    .line 279
    :goto_47
    invoke-virtual {v2}, Lbe3;->A()I

    move-result v13

    const/16 v1, 0x80

    and-int/2addr v13, v1

    if-eqz v13, :cond_85

    const/16 v1, 0x18

    goto :goto_47

    .line 280
    :cond_85
    :goto_48
    invoke-virtual {v2}, Lbe3;->A()I

    move-result v13

    and-int/2addr v13, v1

    if-eqz v13, :cond_86

    const/16 v1, 0x80

    goto :goto_48

    :cond_86
    if-eqz v9, :cond_87

    .line 281
    invoke-virtual {v2}, Lbe3;->F()I

    move-result v1

    .line 282
    invoke-virtual {v2, v1}, Lbe3;->O(I)V

    .line 283
    :cond_87
    iget v1, v2, Lbe3;->b:I

    add-int/2addr v1, v14

    const/16 v14, 0x1f

    if-ne v12, v14, :cond_89

    const/4 v13, 0x4

    .line 284
    invoke-virtual {v2, v13}, Lbe3;->O(I)V

    .line 285
    invoke-virtual {v2}, Lbe3;->A()I

    move-result v7

    .line 286
    invoke-virtual {v2}, Lbe3;->A()I

    move-result v9

    .line 287
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v7, v9}, [Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lf35;->a:Ljava/lang/String;

    .line 288
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v12, "iamf.%03X.%03X"

    invoke-static {v9, v12, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    :cond_88
    const/4 v5, 0x6

    const/4 v13, 0x4

    const/16 v14, 0x80

    goto :goto_4c

    :cond_89
    if-nez v12, :cond_88

    .line 289
    :goto_49
    invoke-virtual {v2}, Lbe3;->A()I

    move-result v8

    const/16 v14, 0x80

    and-int/2addr v8, v14

    if-eqz v8, :cond_8a

    goto :goto_49

    .line 290
    :cond_8a
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v13, 0x4

    invoke-virtual {v2, v13, v8}, Lbe3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    .line 291
    const-string v9, "mp4a"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8d

    .line 292
    :goto_4a
    invoke-virtual {v2}, Lbe3;->A()I

    move-result v9

    and-int/2addr v9, v14

    if-eqz v9, :cond_8b

    goto :goto_4a

    :cond_8b
    const/4 v9, 0x2

    .line 293
    invoke-virtual {v2, v9}, Lbe3;->O(I)V

    .line 294
    new-instance v12, Lh00;

    invoke-direct {v12}, Lh00;-><init>()V

    .line 295
    invoke-virtual {v12, v2}, Lh00;->p(Lbe3;)V

    const/4 v5, 0x5

    .line 296
    invoke-virtual {v12, v5}, Lh00;->i(I)I

    move-result v9

    const/16 v5, 0x1f

    if-ne v9, v5, :cond_8c

    const/4 v5, 0x6

    .line 297
    invoke-virtual {v12, v5}, Lh00;->i(I)I

    move-result v9

    const/16 v19, 0x20

    add-int/lit8 v9, v9, 0x20

    goto :goto_4b

    :cond_8c
    const/4 v5, 0x6

    .line 298
    :goto_4b
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ".40."

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_4c

    :cond_8d
    const/4 v5, 0x6

    .line 299
    :goto_4c
    invoke-virtual {v2, v1}, Lbe3;->N(I)V

    const/16 v1, 0x8

    const v5, 0x616c6163

    goto/16 :goto_43

    :goto_4d
    if-eqz v7, :cond_8e

    if-eqz v8, :cond_8e

    .line 300
    const-string v1, "."

    .line 301
    invoke-static {v7, v1, v8}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    goto :goto_4e

    :cond_8e
    const/4 v2, 0x0

    .line 302
    :goto_4e
    invoke-static {v3}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    move-result-object v7

    move-object/from16 v8, p7

    move-object/from16 v38, v7

    goto/16 :goto_41

    :cond_8f
    const/4 v5, 0x6

    const/4 v13, 0x4

    const v1, 0x70636d43

    if-ne v3, v1, :cond_94

    add-int/lit8 v9, v43, 0xc

    .line 303
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    .line 304
    invoke-virtual {v0}, Lbe3;->A()I

    move-result v1

    const/16 v25, 0x1

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_90

    .line 305
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_4f

    :cond_90
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 306
    :goto_4f
    invoke-virtual {v0}, Lbe3;->A()I

    move-result v2

    const v3, 0x6970636d

    move/from16 v7, v47

    if-ne v7, v3, :cond_91

    .line 307
    invoke-static {v2, v1}, Lf35;->C(ILjava/nio/ByteOrder;)I

    move-result v14

    const/4 v1, -0x1

    const/16 v8, 0x20

    goto :goto_51

    :cond_91
    const v3, 0x6670636d

    const/16 v8, 0x20

    if-ne v7, v3, :cond_92

    if-ne v2, v8, :cond_92

    .line 308
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 309
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_92

    move v14, v13

    :goto_50
    const/4 v1, -0x1

    goto :goto_51

    :cond_92
    move/from16 v14, v27

    goto :goto_50

    :goto_51
    move-object/from16 v8, p7

    move/from16 v27, v14

    move-object/from16 v2, v28

    if-eq v14, v1, :cond_93

    move-object/from16 v5, v32

    :goto_52
    move/from16 v9, v43

    move/from16 v12, v45

    move/from16 v11, v46

    goto/16 :goto_42

    :cond_93
    move-object/from16 v5, v36

    goto :goto_52

    :cond_94
    move/from16 v7, v47

    const/16 v8, 0x20

    move/from16 v12, v45

    move/from16 v2, v46

    goto :goto_54

    .line 310
    :goto_53
    new-instance v1, Lsb1;

    invoke-direct {v1}, Lsb1;-><init>()V

    .line 311
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lsb1;->a:Ljava/lang/String;

    .line 312
    invoke-static/range {v36 .. v36}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lsb1;->m:Ljava/lang/String;

    move/from16 v2, v46

    .line 313
    iput v2, v1, Lsb1;->E:I

    move/from16 v12, v45

    .line 314
    iput v12, v1, Lsb1;->F:I

    .line 315
    iput-object v10, v1, Lsb1;->q:Low0;

    .line 316
    iput-object v4, v1, Lsb1;->d:Ljava/lang/String;

    .line 317
    new-instance v3, Ltb1;

    invoke-direct {v3, v1}, Ltb1;-><init>(Lsb1;)V

    .line 318
    iput-object v3, v6, Ltu;->d:Ljava/lang/Object;

    :goto_54
    move-object/from16 v8, p7

    move v11, v2

    move-object/from16 v2, v28

    move-object/from16 v5, v36

    move/from16 v9, v43

    goto/16 :goto_42

    :goto_55
    if-ne v3, v1, :cond_95

    move/from16 v5, v39

    move/from16 v1, v43

    move v9, v1

    :goto_56
    const/4 v14, -0x1

    goto :goto_5b

    .line 319
    :cond_95
    iget v1, v0, Lbe3;->b:I

    move/from16 v9, v43

    if-lt v1, v9, :cond_96

    const/4 v3, 0x1

    :goto_57
    const/4 v5, 0x0

    goto :goto_58

    :cond_96
    const/4 v3, 0x0

    goto :goto_57

    .line 320
    :goto_58
    invoke-static {v5, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    :goto_59
    sub-int v3, v1, v9

    move/from16 v5, v39

    if-ge v3, v5, :cond_99

    .line 321
    invoke-virtual {v0, v1}, Lbe3;->N(I)V

    .line 322
    invoke-virtual {v0}, Lbe3;->m()I

    move-result v3

    if-lez v3, :cond_97

    const/4 v8, 0x1

    goto :goto_5a

    :cond_97
    const/4 v8, 0x0

    .line 323
    :goto_5a
    invoke-static {v14, v8}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 324
    invoke-virtual {v0}, Lbe3;->m()I

    move-result v8

    const v11, 0x65736473

    if-ne v8, v11, :cond_98

    goto :goto_56

    :cond_98
    add-int/2addr v1, v3

    move/from16 v39, v5

    const/4 v5, 0x0

    const/16 v8, 0x20

    const/16 v11, 0x10

    goto :goto_59

    :cond_99
    const/4 v1, -0x1

    goto :goto_56

    :goto_5b
    if-eq v1, v14, :cond_a0

    .line 325
    invoke-static {v1, v0}, Lwu;->c(ILbe3;)Lru;

    move-result-object v8

    .line 326
    iget-object v1, v8, Lru;->p:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 327
    iget-object v3, v8, Lru;->q:Ljava/lang/Object;

    check-cast v3, [B

    if-eqz v3, :cond_9f

    .line 328
    const-string v11, "audio/vorbis"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9d

    .line 329
    new-instance v11, Lbe3;

    invoke-direct {v11, v3}, Lbe3;-><init>([B)V

    const/4 v13, 0x1

    .line 330
    invoke-virtual {v11, v13}, Lbe3;->O(I)V

    const/4 v14, 0x0

    .line 331
    :goto_5c
    invoke-virtual {v11}, Lbe3;->a()I

    move-result v25

    if-lez v25, :cond_9a

    invoke-virtual {v11}, Lbe3;->j()I

    move-result v13

    const/16 v0, 0xff

    if-ne v13, v0, :cond_9a

    add-int/lit16 v14, v14, 0xff

    const/4 v13, 0x1

    .line 332
    invoke-virtual {v11, v13}, Lbe3;->O(I)V

    move-object/from16 v0, p0

    goto :goto_5c

    .line 333
    :cond_9a
    invoke-virtual {v11}, Lbe3;->A()I

    move-result v0

    add-int/2addr v0, v14

    const/4 v13, 0x0

    .line 334
    :goto_5d
    invoke-virtual {v11}, Lbe3;->a()I

    move-result v14

    if-lez v14, :cond_9c

    invoke-virtual {v11}, Lbe3;->j()I

    move-result v14

    move/from16 v39, v5

    const/16 v5, 0xff

    if-ne v14, v5, :cond_9b

    add-int/lit16 v13, v13, 0xff

    const/4 v14, 0x1

    .line 335
    invoke-virtual {v11, v14}, Lbe3;->O(I)V

    move/from16 v5, v39

    goto :goto_5d

    :cond_9b
    :goto_5e
    const/4 v14, 0x1

    goto :goto_5f

    :cond_9c
    move/from16 v39, v5

    goto :goto_5e

    .line 336
    :goto_5f
    invoke-virtual {v11}, Lbe3;->A()I

    move-result v5

    add-int/2addr v5, v13

    .line 337
    new-array v13, v0, [B

    .line 338
    iget v11, v11, Lbe3;->b:I

    const/4 v14, 0x0

    .line 339
    invoke-static {v3, v11, v13, v14, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v11, v0

    add-int/2addr v11, v5

    .line 340
    array-length v0, v3

    sub-int/2addr v0, v11

    .line 341
    new-array v5, v0, [B

    .line 342
    invoke-static {v3, v11, v5, v14, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 343
    invoke-static {v13, v5}, Lyw1;->p(Ljava/lang/Object;Ljava/lang/Object;)Lgy3;

    move-result-object v0

    move-object/from16 v38, v0

    :goto_60
    move-object v5, v1

    move v11, v2

    move-object/from16 v2, v28

    goto :goto_62

    :cond_9d
    move/from16 v39, v5

    const/4 v14, 0x0

    .line 344
    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9e

    .line 345
    new-instance v0, Lh00;

    .line 346
    array-length v2, v3

    invoke-direct {v0, v2, v3}, Lh00;-><init>(I[B)V

    .line 347
    invoke-static {v0, v14}, Lxl;->D(Lh00;Z)Lg;

    move-result-object v0

    .line 348
    iget v12, v0, Lg;->b:I

    .line 349
    iget v11, v0, Lg;->c:I

    .line 350
    iget-object v2, v0, Lg;->a:Ljava/lang/String;

    goto :goto_61

    :cond_9e
    move v11, v2

    move-object/from16 v2, v28

    .line 351
    :goto_61
    invoke-static {v3}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    move-result-object v0

    move-object/from16 v38, v0

    move-object v5, v1

    goto :goto_62

    :cond_9f
    move/from16 v39, v5

    const/4 v14, 0x0

    goto :goto_60

    :cond_a0
    move/from16 v39, v5

    const/4 v14, 0x0

    move-object/from16 v8, p7

    move v11, v2

    move-object/from16 v2, v28

    move-object/from16 v5, v36

    :goto_62
    add-int v9, v9, v39

    const/16 v20, 0x4

    const/16 v22, 0x2

    move-object/from16 v0, p0

    move/from16 v3, p3

    move v1, v7

    move-object/from16 p7, v8

    move/from16 v14, v27

    move-object/from16 v13, v35

    move-object/from16 v7, v38

    goto/16 :goto_f

    :cond_a1
    move-object/from16 v28, v2

    move-object/from16 v36, v5

    move-object/from16 v38, v7

    move v2, v11

    move/from16 v27, v14

    .line 352
    iget-object v0, v6, Ltu;->d:Ljava/lang/Object;

    check-cast v0, Ltb1;

    if-nez v0, :cond_a4

    if-eqz v36, :cond_a4

    .line 353
    new-instance v0, Lsb1;

    invoke-direct {v0}, Lsb1;-><init>()V

    .line 354
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lsb1;->a:Ljava/lang/String;

    .line 355
    invoke-static/range {v36 .. v36}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lsb1;->m:Ljava/lang/String;

    move-object/from16 v1, v28

    .line 356
    iput-object v1, v0, Lsb1;->j:Ljava/lang/String;

    .line 357
    iput v2, v0, Lsb1;->E:I

    .line 358
    iput v12, v0, Lsb1;->F:I

    move/from16 v14, v27

    .line 359
    iput v14, v0, Lsb1;->G:I

    move-object/from16 v1, v38

    .line 360
    iput-object v1, v0, Lsb1;->p:Ljava/util/List;

    .line 361
    iput-object v10, v0, Lsb1;->q:Low0;

    .line 362
    iput-object v4, v0, Lsb1;->d:Ljava/lang/String;

    if-eqz p7, :cond_a2

    move-object/from16 v8, p7

    .line 363
    iget-wide v1, v8, Lru;->n:J

    .line 364
    invoke-static {v1, v2}, Ljz4;->I(J)I

    move-result v1

    .line 365
    iput v1, v0, Lsb1;->h:I

    .line 366
    iget-wide v1, v8, Lru;->o:J

    .line 367
    invoke-static {v1, v2}, Ljz4;->I(J)I

    move-result v1

    .line 368
    iput v1, v0, Lsb1;->i:I

    goto :goto_63

    :cond_a2
    move-object/from16 v1, v33

    if-eqz v1, :cond_a3

    .line 369
    iget-wide v2, v1, Lpu;->a:J

    .line 370
    invoke-static {v2, v3}, Ljz4;->I(J)I

    move-result v2

    .line 371
    iput v2, v0, Lsb1;->h:I

    .line 372
    iget-wide v1, v1, Lpu;->b:J

    .line 373
    invoke-static {v1, v2}, Ljz4;->I(J)I

    move-result v1

    .line 374
    iput v1, v0, Lsb1;->i:I

    .line 375
    :cond_a3
    :goto_63
    new-instance v1, Ltb1;

    invoke-direct {v1, v0}, Ltb1;-><init>(Lsb1;)V

    .line 376
    iput-object v1, v6, Ltu;->d:Ljava/lang/Object;

    :cond_a4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(ILbe3;)Lru;
    .locals 10

    .line 1
    add-int/lit8 p0, p0, 0xc

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lbe3;->N(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Lbe3;->O(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lwu;->d(Lbe3;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0}, Lbe3;->O(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lbe3;->A()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lbe3;->O(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Lbe3;->A()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v2}, Lbe3;->O(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lbe3;->O(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1, p0}, Lbe3;->O(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lwu;->d(Lbe3;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lbe3;->A()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Llw2;->e(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p1, v0}, Lbe3;->O(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lbe3;->C()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p1}, Lbe3;->C()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p1, p0}, Lbe3;->O(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lwu;->d(Lbe3;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p0, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p1, v3, v6, p0}, Lbe3;->k([BII)V

    .line 109
    .line 110
    .line 111
    move-wide p0, v0

    .line 112
    new-instance v1, Lru;

    .line 113
    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    cmp-long v0, v4, v6

    .line 117
    .line 118
    const-wide/16 v8, -0x1

    .line 119
    .line 120
    if-lez v0, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move-wide v4, v8

    .line 124
    :goto_0
    cmp-long v0, p0, v6

    .line 125
    .line 126
    if-lez v0, :cond_5

    .line 127
    .line 128
    move-wide v6, p0

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    move-wide v6, v8

    .line 131
    :goto_1
    invoke-direct/range {v1 .. v7}, Lru;-><init>(Ljava/lang/String;[BJJ)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_6
    :goto_2
    new-instance v1, Lru;

    .line 136
    .line 137
    const-wide/16 v4, -0x1

    .line 138
    .line 139
    const-wide/16 v6, -0x1

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-direct/range {v1 .. v7}, Lru;-><init>(Ljava/lang/String;[BJJ)V

    .line 143
    .line 144
    .line 145
    return-object v1
.end method

.method public static d(Lbe3;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbe3;->A()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lbe3;->A()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method

.method public static e(I)I
    .locals 0

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method public static f(Loy2;)Lqv2;
    .locals 14

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Loy2;->s(I)Lpy2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x6b657973

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Loy2;->s(I)Lpy2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x696c7374

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Loy2;->s(I)Lpy2;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_8

    .line 24
    .line 25
    if-eqz v1, :cond_8

    .line 26
    .line 27
    if-eqz p0, :cond_8

    .line 28
    .line 29
    iget-object v0, v0, Lpy2;->p:Lbe3;

    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Lbe3;->N(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lbe3;->m()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const v3, 0x6d647461

    .line 41
    .line 42
    .line 43
    if-eq v0, v3, :cond_0

    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_0
    iget-object v0, v1, Lpy2;->p:Lbe3;

    .line 48
    .line 49
    const/16 v1, 0xc

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lbe3;->N(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lbe3;->m()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    new-array v3, v1, [Ljava/lang/String;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    move v5, v4

    .line 62
    :goto_0
    const/16 v6, 0x8

    .line 63
    .line 64
    if-ge v5, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0}, Lbe3;->m()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    const/4 v8, 0x4

    .line 71
    invoke-virtual {v0, v8}, Lbe3;->O(I)V

    .line 72
    .line 73
    .line 74
    sub-int/2addr v7, v6

    .line 75
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 76
    .line 77
    invoke-virtual {v0, v7, v6}, Lbe3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    aput-object v6, v3, v5

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    iget-object p0, p0, Lpy2;->p:Lbe3;

    .line 87
    .line 88
    invoke-virtual {p0, v6}, Lbe3;->N(I)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    :goto_1
    invoke-virtual {p0}, Lbe3;->a()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-le v5, v6, :cond_6

    .line 101
    .line 102
    iget v5, p0, Lbe3;->b:I

    .line 103
    .line 104
    invoke-virtual {p0}, Lbe3;->m()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    invoke-virtual {p0}, Lbe3;->m()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    add-int/lit8 v8, v8, -0x1

    .line 113
    .line 114
    if-ltz v8, :cond_4

    .line 115
    .line 116
    if-ge v8, v1, :cond_4

    .line 117
    .line 118
    aget-object v8, v3, v8

    .line 119
    .line 120
    add-int v9, v5, v7

    .line 121
    .line 122
    :goto_2
    iget v10, p0, Lbe3;->b:I

    .line 123
    .line 124
    if-ge v10, v9, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, Lbe3;->m()I

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    invoke-virtual {p0}, Lbe3;->m()I

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    const v13, 0x64617461

    .line 135
    .line 136
    .line 137
    if-ne v12, v13, :cond_2

    .line 138
    .line 139
    invoke-virtual {p0}, Lbe3;->m()I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    invoke-virtual {p0}, Lbe3;->m()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    add-int/lit8 v11, v11, -0x10

    .line 148
    .line 149
    new-array v12, v11, [B

    .line 150
    .line 151
    invoke-virtual {p0, v12, v4, v11}, Lbe3;->k([BII)V

    .line 152
    .line 153
    .line 154
    new-instance v11, Loi2;

    .line 155
    .line 156
    invoke-direct {v11, v8, v12, v10, v9}, Loi2;-><init>(Ljava/lang/String;[BII)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_2
    add-int/2addr v10, v11

    .line 161
    invoke-virtual {p0, v10}, Lbe3;->N(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    move-object v11, v2

    .line 166
    :goto_3
    if-eqz v11, :cond_5

    .line 167
    .line 168
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_4
    const-string v9, "BoxParsers"

    .line 173
    .line 174
    const-string v10, "Skipped metadata with unknown key index: "

    .line 175
    .line 176
    invoke-static {v8, v10, v9}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_5
    :goto_4
    add-int/2addr v5, v7

    .line 180
    invoke-virtual {p0, v5}, Lbe3;->N(I)V

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_7

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_7
    new-instance p0, Lqv2;

    .line 192
    .line 193
    invoke-direct {p0, v0}, Lqv2;-><init>(Ljava/util/List;)V

    .line 194
    .line 195
    .line 196
    return-object p0

    .line 197
    :cond_8
    :goto_5
    return-object v2
.end method

.method public static g(Lbe3;)Luy2;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbe3;->N(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbe3;->m()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lwu;->e(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lbe3;->C()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lbe3;->C()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lbe3;->u()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lbe3;->u()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Lbe3;->C()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, Luy2;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Luy2;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
.end method

.method public static h(Lbe3;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbe3;->b:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p1

    .line 6
    .line 7
    move/from16 v4, p2

    .line 8
    .line 9
    if-ge v2, v4, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lbe3;->N(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lbe3;->m()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    move v7, v6

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v7, v5

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lbe3;->m()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    move v12, v5

    .line 43
    move v9, v8

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    :goto_2
    sub-int v13, v7, v1

    .line 47
    .line 48
    const/4 v14, 0x4

    .line 49
    if-ge v13, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, Lbe3;->N(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lbe3;->m()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    invoke-virtual {v0}, Lbe3;->m()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const v3, 0x66726d61

    .line 65
    .line 66
    .line 67
    if-ne v15, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, Lbe3;->m()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const v3, 0x7363686d

    .line 79
    .line 80
    .line 81
    if-ne v15, v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0, v14}, Lbe3;->O(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {v0, v14, v3}, Lbe3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    const v3, 0x73636869

    .line 94
    .line 95
    .line 96
    if-ne v15, v3, :cond_3

    .line 97
    .line 98
    move v9, v7

    .line 99
    move v12, v13

    .line 100
    :cond_3
    :goto_3
    add-int/2addr v7, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const/16 v16, 0x0

    .line 103
    .line 104
    const-string v3, "cenc"

    .line 105
    .line 106
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    const-string v3, "cbc1"

    .line 113
    .line 114
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    const-string v3, "cens"

    .line 121
    .line 122
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_6

    .line 127
    .line 128
    const-string v3, "cbcs"

    .line 129
    .line 130
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move-object/from16 v3, v16

    .line 138
    .line 139
    goto/16 :goto_b

    .line 140
    .line 141
    :cond_6
    :goto_4
    if-eqz v10, :cond_7

    .line 142
    .line 143
    move v3, v6

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move v3, v5

    .line 146
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 147
    .line 148
    invoke-static {v7, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    if-eq v9, v8, :cond_8

    .line 152
    .line 153
    move v3, v6

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move v3, v5

    .line 156
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 157
    .line 158
    invoke-static {v7, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v3, v9, 0x8

    .line 162
    .line 163
    :goto_7
    sub-int v7, v3, v9

    .line 164
    .line 165
    if-ge v7, v12, :cond_d

    .line 166
    .line 167
    invoke-virtual {v0, v3}, Lbe3;->N(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lbe3;->m()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v0}, Lbe3;->m()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const v13, 0x74656e63

    .line 179
    .line 180
    .line 181
    if-ne v8, v13, :cond_c

    .line 182
    .line 183
    invoke-virtual {v0}, Lbe3;->m()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, Lwu;->e(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v0, v6}, Lbe3;->O(I)V

    .line 192
    .line 193
    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v0, v6}, Lbe3;->O(I)V

    .line 197
    .line 198
    .line 199
    move v14, v5

    .line 200
    move v15, v14

    .line 201
    goto :goto_8

    .line 202
    :cond_9
    invoke-virtual {v0}, Lbe3;->A()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    and-int/lit16 v7, v3, 0xf0

    .line 207
    .line 208
    shr-int/2addr v7, v14

    .line 209
    and-int/lit8 v3, v3, 0xf

    .line 210
    .line 211
    move v15, v3

    .line 212
    move v14, v7

    .line 213
    :goto_8
    invoke-virtual {v0}, Lbe3;->A()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-ne v3, v6, :cond_a

    .line 218
    .line 219
    move-object v3, v10

    .line 220
    move v10, v6

    .line 221
    goto :goto_9

    .line 222
    :cond_a
    move-object v3, v10

    .line 223
    move v10, v5

    .line 224
    :goto_9
    invoke-virtual {v0}, Lbe3;->A()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    const/16 v7, 0x10

    .line 229
    .line 230
    new-array v13, v7, [B

    .line 231
    .line 232
    invoke-virtual {v0, v13, v5, v7}, Lbe3;->k([BII)V

    .line 233
    .line 234
    .line 235
    if-eqz v10, :cond_b

    .line 236
    .line 237
    if-nez v12, :cond_b

    .line 238
    .line 239
    invoke-virtual {v0}, Lbe3;->A()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    new-array v8, v7, [B

    .line 244
    .line 245
    invoke-virtual {v0, v8, v5, v7}, Lbe3;->k([BII)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v8

    .line 249
    .line 250
    :cond_b
    new-instance v9, Lqv4;

    .line 251
    .line 252
    move-object v8, v3

    .line 253
    invoke-direct/range {v9 .. v16}, Lqv4;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 254
    .line 255
    .line 256
    move-object v3, v9

    .line 257
    goto :goto_a

    .line 258
    :cond_c
    move-object v8, v10

    .line 259
    add-int/2addr v3, v7

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-object v8, v10

    .line 262
    move-object/from16 v3, v16

    .line 263
    .line 264
    :goto_a
    if-eqz v3, :cond_e

    .line 265
    .line 266
    move v5, v6

    .line 267
    :cond_e
    const-string v6, "tenc atom is mandatory"

    .line 268
    .line 269
    invoke-static {v6, v5}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 270
    .line 271
    .line 272
    sget-object v5, Lf35;->a:Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    :goto_b
    if-eqz v3, :cond_f

    .line 279
    .line 280
    return-object v3

    .line 281
    :cond_f
    add-int/2addr v1, v2

    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_10
    const/16 v16, 0x0

    .line 285
    .line 286
    return-object v16
.end method

.method public static i(Lbe3;Lvu;Ljava/lang/String;Low0;Z)Ltu;
    .locals 66

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    iget v11, v10, Lvu;->a:I

    .line 8
    .line 9
    const/16 v12, 0xc

    .line 10
    .line 11
    invoke-virtual {v0, v12}, Lbe3;->N(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lbe3;->m()I

    .line 15
    .line 16
    .line 17
    move-result v13

    .line 18
    new-instance v8, Ltu;

    .line 19
    .line 20
    const/4 v14, 0x0

    .line 21
    invoke-direct {v8, v13, v14}, Ltu;-><init>(II)V

    .line 22
    .line 23
    .line 24
    move v9, v14

    .line 25
    :goto_0
    if-ge v9, v13, :cond_87

    .line 26
    .line 27
    iget v2, v0, Lbe3;->b:I

    .line 28
    .line 29
    invoke-virtual {v0}, Lbe3;->m()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-lez v3, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    move v4, v14

    .line 38
    :goto_1
    const-string v6, "childAtomSize must be positive"

    .line 39
    .line 40
    invoke-static {v6, v4}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lbe3;->m()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const v7, 0x61766331

    .line 48
    .line 49
    .line 50
    const/16 v17, 0x3

    .line 51
    .line 52
    const/16 v18, 0x8

    .line 53
    .line 54
    const/16 v19, 0x0

    .line 55
    .line 56
    const v15, 0x48323633

    .line 57
    .line 58
    .line 59
    const v1, 0x6d317620

    .line 60
    .line 61
    .line 62
    const v14, 0x656e6376

    .line 63
    .line 64
    .line 65
    if-eq v4, v7, :cond_1

    .line 66
    .line 67
    const v7, 0x61766333

    .line 68
    .line 69
    .line 70
    if-eq v4, v7, :cond_1

    .line 71
    .line 72
    if-eq v4, v14, :cond_1

    .line 73
    .line 74
    if-eq v4, v1, :cond_1

    .line 75
    .line 76
    const v7, 0x6d703476

    .line 77
    .line 78
    .line 79
    if-eq v4, v7, :cond_1

    .line 80
    .line 81
    const v7, 0x68766331

    .line 82
    .line 83
    .line 84
    if-eq v4, v7, :cond_1

    .line 85
    .line 86
    const v7, 0x68657631

    .line 87
    .line 88
    .line 89
    if-eq v4, v7, :cond_1

    .line 90
    .line 91
    const v7, 0x73323633

    .line 92
    .line 93
    .line 94
    if-eq v4, v7, :cond_1

    .line 95
    .line 96
    if-eq v4, v15, :cond_1

    .line 97
    .line 98
    const v7, 0x68323633

    .line 99
    .line 100
    .line 101
    if-eq v4, v7, :cond_1

    .line 102
    .line 103
    const v7, 0x76703038

    .line 104
    .line 105
    .line 106
    if-eq v4, v7, :cond_1

    .line 107
    .line 108
    const v7, 0x76703039

    .line 109
    .line 110
    .line 111
    if-eq v4, v7, :cond_1

    .line 112
    .line 113
    const v7, 0x61763031

    .line 114
    .line 115
    .line 116
    if-eq v4, v7, :cond_1

    .line 117
    .line 118
    const v7, 0x64766176

    .line 119
    .line 120
    .line 121
    if-eq v4, v7, :cond_1

    .line 122
    .line 123
    const v7, 0x64766131

    .line 124
    .line 125
    .line 126
    if-eq v4, v7, :cond_1

    .line 127
    .line 128
    const v7, 0x64766865

    .line 129
    .line 130
    .line 131
    if-eq v4, v7, :cond_1

    .line 132
    .line 133
    const v7, 0x64766831

    .line 134
    .line 135
    .line 136
    if-eq v4, v7, :cond_1

    .line 137
    .line 138
    const v7, 0x61707631

    .line 139
    .line 140
    .line 141
    if-ne v4, v7, :cond_2

    .line 142
    .line 143
    :cond_1
    move-object/from16 v7, p3

    .line 144
    .line 145
    goto/16 :goto_c

    .line 146
    .line 147
    :cond_2
    const v1, 0x6d703461

    .line 148
    .line 149
    .line 150
    if-eq v4, v1, :cond_3

    .line 151
    .line 152
    const v1, 0x656e6361

    .line 153
    .line 154
    .line 155
    if-eq v4, v1, :cond_3

    .line 156
    .line 157
    const v1, 0x61632d33

    .line 158
    .line 159
    .line 160
    if-eq v4, v1, :cond_3

    .line 161
    .line 162
    const v1, 0x65632d33

    .line 163
    .line 164
    .line 165
    if-eq v4, v1, :cond_3

    .line 166
    .line 167
    const v1, 0x61632d34

    .line 168
    .line 169
    .line 170
    if-eq v4, v1, :cond_3

    .line 171
    .line 172
    const v1, 0x6d6c7061

    .line 173
    .line 174
    .line 175
    if-eq v4, v1, :cond_3

    .line 176
    .line 177
    const v1, 0x64747363

    .line 178
    .line 179
    .line 180
    if-eq v4, v1, :cond_3

    .line 181
    .line 182
    const v1, 0x64747365

    .line 183
    .line 184
    .line 185
    if-eq v4, v1, :cond_3

    .line 186
    .line 187
    const v1, 0x64747368

    .line 188
    .line 189
    .line 190
    if-eq v4, v1, :cond_3

    .line 191
    .line 192
    const v1, 0x6474736c

    .line 193
    .line 194
    .line 195
    if-eq v4, v1, :cond_3

    .line 196
    .line 197
    const v1, 0x64747378

    .line 198
    .line 199
    .line 200
    if-eq v4, v1, :cond_3

    .line 201
    .line 202
    const v1, 0x73616d72

    .line 203
    .line 204
    .line 205
    if-eq v4, v1, :cond_3

    .line 206
    .line 207
    const v1, 0x73617762

    .line 208
    .line 209
    .line 210
    if-eq v4, v1, :cond_3

    .line 211
    .line 212
    const v1, 0x6c70636d

    .line 213
    .line 214
    .line 215
    if-eq v4, v1, :cond_3

    .line 216
    .line 217
    const v1, 0x736f7774

    .line 218
    .line 219
    .line 220
    if-eq v4, v1, :cond_3

    .line 221
    .line 222
    const v1, 0x74776f73

    .line 223
    .line 224
    .line 225
    if-eq v4, v1, :cond_3

    .line 226
    .line 227
    const v1, 0x2e6d7032

    .line 228
    .line 229
    .line 230
    if-eq v4, v1, :cond_3

    .line 231
    .line 232
    const v1, 0x2e6d7033

    .line 233
    .line 234
    .line 235
    if-eq v4, v1, :cond_3

    .line 236
    .line 237
    const v1, 0x6d686131

    .line 238
    .line 239
    .line 240
    if-eq v4, v1, :cond_3

    .line 241
    .line 242
    const v1, 0x6d686d31

    .line 243
    .line 244
    .line 245
    if-eq v4, v1, :cond_3

    .line 246
    .line 247
    const v1, 0x616c6163

    .line 248
    .line 249
    .line 250
    if-eq v4, v1, :cond_3

    .line 251
    .line 252
    const v1, 0x616c6177

    .line 253
    .line 254
    .line 255
    if-eq v4, v1, :cond_3

    .line 256
    .line 257
    const v1, 0x756c6177

    .line 258
    .line 259
    .line 260
    if-eq v4, v1, :cond_3

    .line 261
    .line 262
    const v1, 0x4f707573

    .line 263
    .line 264
    .line 265
    if-eq v4, v1, :cond_3

    .line 266
    .line 267
    const v1, 0x664c6143

    .line 268
    .line 269
    .line 270
    if-eq v4, v1, :cond_3

    .line 271
    .line 272
    const v1, 0x69616d66

    .line 273
    .line 274
    .line 275
    if-eq v4, v1, :cond_3

    .line 276
    .line 277
    const v1, 0x6970636d

    .line 278
    .line 279
    .line 280
    if-eq v4, v1, :cond_3

    .line 281
    .line 282
    const v1, 0x6670636d

    .line 283
    .line 284
    .line 285
    if-ne v4, v1, :cond_4

    .line 286
    .line 287
    :cond_3
    move/from16 v21, v2

    .line 288
    .line 289
    move v1, v4

    .line 290
    goto/16 :goto_b

    .line 291
    .line 292
    :cond_4
    const v1, 0x6d703473

    .line 293
    .line 294
    .line 295
    const v6, 0x63363038

    .line 296
    .line 297
    .line 298
    const v7, 0x73747070

    .line 299
    .line 300
    .line 301
    const v14, 0x77767474

    .line 302
    .line 303
    .line 304
    const v15, 0x74783367

    .line 305
    .line 306
    .line 307
    const v12, 0x54544d4c

    .line 308
    .line 309
    .line 310
    if-eq v4, v12, :cond_8

    .line 311
    .line 312
    if-eq v4, v15, :cond_8

    .line 313
    .line 314
    if-eq v4, v14, :cond_8

    .line 315
    .line 316
    if-eq v4, v7, :cond_8

    .line 317
    .line 318
    if-eq v4, v6, :cond_8

    .line 319
    .line 320
    if-ne v4, v1, :cond_5

    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_5
    const v1, 0x6d657474

    .line 324
    .line 325
    .line 326
    if-ne v4, v1, :cond_7

    .line 327
    .line 328
    add-int/lit8 v6, v2, 0x10

    .line 329
    .line 330
    invoke-virtual {v0, v6}, Lbe3;->N(I)V

    .line 331
    .line 332
    .line 333
    if-ne v4, v1, :cond_6

    .line 334
    .line 335
    invoke-virtual {v0}, Lbe3;->v()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Lbe3;->v()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-eqz v1, :cond_6

    .line 343
    .line 344
    new-instance v4, Lsb1;

    .line 345
    .line 346
    invoke-direct {v4}, Lsb1;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    iput-object v6, v4, Lsb1;->a:Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v1}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    iput-object v1, v4, Lsb1;->m:Ljava/lang/String;

    .line 360
    .line 361
    new-instance v1, Ltb1;

    .line 362
    .line 363
    invoke-direct {v1, v4}, Ltb1;-><init>(Lsb1;)V

    .line 364
    .line 365
    .line 366
    iput-object v1, v8, Ltu;->d:Ljava/lang/Object;

    .line 367
    .line 368
    :cond_6
    :goto_2
    move/from16 v27, v2

    .line 369
    .line 370
    move/from16 v49, v3

    .line 371
    .line 372
    move/from16 v28, v9

    .line 373
    .line 374
    move/from16 v30, v11

    .line 375
    .line 376
    move/from16 v31, v13

    .line 377
    .line 378
    const/4 v15, 0x0

    .line 379
    const/16 v16, 0xc

    .line 380
    .line 381
    goto/16 :goto_5f

    .line 382
    .line 383
    :cond_7
    const v1, 0x63616d6d

    .line 384
    .line 385
    .line 386
    if-ne v4, v1, :cond_6

    .line 387
    .line 388
    new-instance v1, Lsb1;

    .line 389
    .line 390
    invoke-direct {v1}, Lsb1;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    iput-object v4, v1, Lsb1;->a:Ljava/lang/String;

    .line 398
    .line 399
    const-string v4, "application/x-camera-motion"

    .line 400
    .line 401
    invoke-static {v4}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    iput-object v4, v1, Lsb1;->m:Ljava/lang/String;

    .line 406
    .line 407
    new-instance v4, Ltb1;

    .line 408
    .line 409
    invoke-direct {v4, v1}, Ltb1;-><init>(Lsb1;)V

    .line 410
    .line 411
    .line 412
    iput-object v4, v8, Ltu;->d:Ljava/lang/Object;

    .line 413
    .line 414
    goto :goto_2

    .line 415
    :cond_8
    :goto_3
    add-int/lit8 v1, v2, 0x10

    .line 416
    .line 417
    invoke-virtual {v0, v1}, Lbe3;->N(I)V

    .line 418
    .line 419
    .line 420
    const-string v1, "application/ttml+xml"

    .line 421
    .line 422
    const-wide v26, 0x7fffffffffffffffL

    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    if-ne v4, v12, :cond_9

    .line 428
    .line 429
    :goto_4
    move/from16 v21, v2

    .line 430
    .line 431
    move-object/from16 v15, v19

    .line 432
    .line 433
    :goto_5
    move-wide/from16 v6, v26

    .line 434
    .line 435
    goto/16 :goto_9

    .line 436
    .line 437
    :cond_9
    if-ne v4, v15, :cond_a

    .line 438
    .line 439
    add-int/lit8 v1, v3, -0x10

    .line 440
    .line 441
    new-array v4, v1, [B

    .line 442
    .line 443
    const/4 v6, 0x0

    .line 444
    invoke-virtual {v0, v4, v6, v1}, Lbe3;->k([BII)V

    .line 445
    .line 446
    .line 447
    invoke-static {v4}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 448
    .line 449
    .line 450
    move-result-object v15

    .line 451
    const-string v1, "application/x-quicktime-tx3g"

    .line 452
    .line 453
    move/from16 v21, v2

    .line 454
    .line 455
    goto :goto_5

    .line 456
    :cond_a
    if-ne v4, v14, :cond_b

    .line 457
    .line 458
    const-string v1, "application/x-mp4-vtt"

    .line 459
    .line 460
    goto :goto_4

    .line 461
    :cond_b
    if-ne v4, v7, :cond_c

    .line 462
    .line 463
    const-wide/16 v26, 0x0

    .line 464
    .line 465
    goto :goto_4

    .line 466
    :cond_c
    if-ne v4, v6, :cond_d

    .line 467
    .line 468
    const/4 v1, 0x1

    .line 469
    iput v1, v8, Ltu;->b:I

    .line 470
    .line 471
    const-string v1, "application/x-mp4-cea-608"

    .line 472
    .line 473
    goto :goto_4

    .line 474
    :cond_d
    const v1, 0x6d703473

    .line 475
    .line 476
    .line 477
    if-ne v4, v1, :cond_14

    .line 478
    .line 479
    iget v1, v0, Lbe3;->b:I

    .line 480
    .line 481
    const/4 v4, 0x4

    .line 482
    invoke-virtual {v0, v4}, Lbe3;->O(I)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0}, Lbe3;->m()I

    .line 486
    .line 487
    .line 488
    move-result v4

    .line 489
    const v6, 0x65736473

    .line 490
    .line 491
    .line 492
    if-ne v4, v6, :cond_12

    .line 493
    .line 494
    invoke-static {v1, v0}, Lwu;->c(ILbe3;)Lru;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    iget-object v1, v1, Lru;->q:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v1, [B

    .line 501
    .line 502
    if-eqz v1, :cond_e

    .line 503
    .line 504
    array-length v4, v1

    .line 505
    const/16 v6, 0x40

    .line 506
    .line 507
    if-eq v4, v6, :cond_f

    .line 508
    .line 509
    :cond_e
    move/from16 v21, v2

    .line 510
    .line 511
    goto/16 :goto_a

    .line 512
    .line 513
    :cond_f
    iget v4, v10, Lvu;->d:I

    .line 514
    .line 515
    iget v7, v10, Lvu;->e:I

    .line 516
    .line 517
    array-length v12, v1

    .line 518
    if-ne v12, v6, :cond_10

    .line 519
    .line 520
    const/16 v22, 0x1

    .line 521
    .line 522
    goto :goto_6

    .line 523
    :cond_10
    const/16 v22, 0x0

    .line 524
    .line 525
    :goto_6
    invoke-static/range {v22 .. v22}, Lrr2;->w(Z)V

    .line 526
    .line 527
    .line 528
    new-instance v6, Ljava/util/ArrayList;

    .line 529
    .line 530
    const/16 v12, 0x10

    .line 531
    .line 532
    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 533
    .line 534
    .line 535
    const/4 v12, 0x0

    .line 536
    :goto_7
    array-length v14, v1

    .line 537
    add-int/lit8 v14, v14, -0x3

    .line 538
    .line 539
    if-ge v12, v14, :cond_11

    .line 540
    .line 541
    aget-byte v14, v1, v12

    .line 542
    .line 543
    add-int/lit8 v15, v12, 0x1

    .line 544
    .line 545
    aget-byte v15, v1, v15

    .line 546
    .line 547
    add-int/lit8 v19, v12, 0x2

    .line 548
    .line 549
    aget-byte v0, v1, v19

    .line 550
    .line 551
    add-int/lit8 v19, v12, 0x3

    .line 552
    .line 553
    move-object/from16 v20, v1

    .line 554
    .line 555
    aget-byte v1, v20, v19

    .line 556
    .line 557
    invoke-static {v14, v15, v0, v1}, Ljz4;->u(BBBB)I

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    shr-int/lit8 v1, v0, 0x10

    .line 562
    .line 563
    const/16 v14, 0xff

    .line 564
    .line 565
    and-int/2addr v1, v14

    .line 566
    shr-int/lit8 v15, v0, 0x8

    .line 567
    .line 568
    and-int/2addr v15, v14

    .line 569
    and-int/2addr v0, v14

    .line 570
    add-int/lit8 v15, v15, -0x80

    .line 571
    .line 572
    mul-int/lit16 v14, v15, 0x36fb

    .line 573
    .line 574
    div-int/lit16 v14, v14, 0x2710

    .line 575
    .line 576
    add-int/2addr v14, v1

    .line 577
    add-int/lit8 v0, v0, -0x80

    .line 578
    .line 579
    move/from16 v21, v1

    .line 580
    .line 581
    mul-int/lit16 v1, v0, 0xd7f

    .line 582
    .line 583
    div-int/lit16 v1, v1, 0x2710

    .line 584
    .line 585
    sub-int v1, v21, v1

    .line 586
    .line 587
    mul-int/lit16 v15, v15, 0x1c01

    .line 588
    .line 589
    div-int/lit16 v15, v15, 0x2710

    .line 590
    .line 591
    sub-int/2addr v1, v15

    .line 592
    mul-int/lit16 v0, v0, 0x457e

    .line 593
    .line 594
    div-int/lit16 v0, v0, 0x2710

    .line 595
    .line 596
    add-int v0, v0, v21

    .line 597
    .line 598
    move/from16 v21, v2

    .line 599
    .line 600
    const/16 v2, 0xff

    .line 601
    .line 602
    const/4 v15, 0x0

    .line 603
    invoke-static {v14, v15, v2}, Lf35;->j(III)I

    .line 604
    .line 605
    .line 606
    move-result v14

    .line 607
    const/16 v25, 0x10

    .line 608
    .line 609
    shl-int/lit8 v14, v14, 0x10

    .line 610
    .line 611
    invoke-static {v1, v15, v2}, Lf35;->j(III)I

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    shl-int/lit8 v1, v1, 0x8

    .line 616
    .line 617
    or-int/2addr v1, v14

    .line 618
    invoke-static {v0, v15, v2}, Lf35;->j(III)I

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    or-int/2addr v0, v1

    .line 623
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    const-string v1, "%06x"

    .line 632
    .line 633
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    add-int/lit8 v12, v12, 0x4

    .line 641
    .line 642
    move-object/from16 v0, p0

    .line 643
    .line 644
    move-object/from16 v1, v20

    .line 645
    .line 646
    move/from16 v2, v21

    .line 647
    .line 648
    goto :goto_7

    .line 649
    :cond_11
    move/from16 v21, v2

    .line 650
    .line 651
    const-string v0, "x"

    .line 652
    .line 653
    const-string v1, "\npalette: "

    .line 654
    .line 655
    const-string v2, "size: "

    .line 656
    .line 657
    invoke-static {v2, v0, v4, v7, v1}, Lb11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    new-instance v1, Luc0;

    .line 662
    .line 663
    const-string v2, ", "

    .line 664
    .line 665
    invoke-direct {v1, v2}, Luc0;-><init>(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1, v6}, Luc0;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    const-string v1, "\n"

    .line 676
    .line 677
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 685
    .line 686
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 687
    .line 688
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-static {v0}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 693
    .line 694
    .line 695
    move-result-object v15

    .line 696
    const-string v0, "application/vobsub"

    .line 697
    .line 698
    goto :goto_8

    .line 699
    :cond_12
    move/from16 v21, v2

    .line 700
    .line 701
    move-object/from16 v0, v19

    .line 702
    .line 703
    move-object v15, v0

    .line 704
    :goto_8
    move-object v1, v0

    .line 705
    goto/16 :goto_5

    .line 706
    .line 707
    :goto_9
    if-eqz v1, :cond_13

    .line 708
    .line 709
    new-instance v0, Lsb1;

    .line 710
    .line 711
    invoke-direct {v0}, Lsb1;-><init>()V

    .line 712
    .line 713
    .line 714
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    iput-object v2, v0, Lsb1;->a:Ljava/lang/String;

    .line 719
    .line 720
    invoke-static {v1}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    iput-object v1, v0, Lsb1;->m:Ljava/lang/String;

    .line 725
    .line 726
    iput-object v5, v0, Lsb1;->d:Ljava/lang/String;

    .line 727
    .line 728
    iput-wide v6, v0, Lsb1;->r:J

    .line 729
    .line 730
    iput-object v15, v0, Lsb1;->p:Ljava/util/List;

    .line 731
    .line 732
    new-instance v1, Ltb1;

    .line 733
    .line 734
    invoke-direct {v1, v0}, Ltb1;-><init>(Lsb1;)V

    .line 735
    .line 736
    .line 737
    iput-object v1, v8, Ltu;->d:Ljava/lang/Object;

    .line 738
    .line 739
    :cond_13
    :goto_a
    const/4 v15, 0x0

    .line 740
    const/16 v16, 0xc

    .line 741
    .line 742
    move-object/from16 v0, p0

    .line 743
    .line 744
    move/from16 v49, v3

    .line 745
    .line 746
    move/from16 v28, v9

    .line 747
    .line 748
    move/from16 v30, v11

    .line 749
    .line 750
    move/from16 v31, v13

    .line 751
    .line 752
    move/from16 v27, v21

    .line 753
    .line 754
    goto/16 :goto_5f

    .line 755
    .line 756
    :cond_14
    invoke-static {}, Ltb4;->a()V

    .line 757
    .line 758
    .line 759
    return-object v19

    .line 760
    :goto_b
    iget v4, v10, Lvu;->a:I

    .line 761
    .line 762
    move-object/from16 v0, p0

    .line 763
    .line 764
    move-object/from16 v7, p3

    .line 765
    .line 766
    move/from16 v6, p4

    .line 767
    .line 768
    move/from16 v2, v21

    .line 769
    .line 770
    invoke-static/range {v0 .. v9}, Lwu;->b(Lbe3;IIIILjava/lang/String;ZLow0;Ltu;I)V

    .line 771
    .line 772
    .line 773
    move-object/from16 v5, p2

    .line 774
    .line 775
    goto/16 :goto_2

    .line 776
    .line 777
    :goto_c
    iget v12, v10, Lvu;->c:I

    .line 778
    .line 779
    add-int/lit8 v15, v2, 0x10

    .line 780
    .line 781
    invoke-virtual {v0, v15}, Lbe3;->N(I)V

    .line 782
    .line 783
    .line 784
    const/16 v15, 0x10

    .line 785
    .line 786
    invoke-virtual {v0, v15}, Lbe3;->O(I)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0}, Lbe3;->H()I

    .line 790
    .line 791
    .line 792
    move-result v15

    .line 793
    invoke-virtual {v0}, Lbe3;->H()I

    .line 794
    .line 795
    .line 796
    move-result v1

    .line 797
    const/16 v14, 0x32

    .line 798
    .line 799
    invoke-virtual {v0, v14}, Lbe3;->O(I)V

    .line 800
    .line 801
    .line 802
    iget v14, v0, Lbe3;->b:I

    .line 803
    .line 804
    move/from16 v28, v9

    .line 805
    .line 806
    const v9, 0x656e6376

    .line 807
    .line 808
    .line 809
    if-ne v4, v9, :cond_17

    .line 810
    .line 811
    invoke-static {v0, v2, v3}, Lwu;->h(Lbe3;II)Landroid/util/Pair;

    .line 812
    .line 813
    .line 814
    move-result-object v9

    .line 815
    if-eqz v9, :cond_16

    .line 816
    .line 817
    iget-object v4, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast v4, Ljava/lang/Integer;

    .line 820
    .line 821
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 822
    .line 823
    .line 824
    move-result v4

    .line 825
    if-nez v7, :cond_15

    .line 826
    .line 827
    move/from16 v27, v2

    .line 828
    .line 829
    move-object/from16 v29, v19

    .line 830
    .line 831
    goto :goto_d

    .line 832
    :cond_15
    move/from16 v27, v2

    .line 833
    .line 834
    iget-object v2, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v2, Lqv4;

    .line 837
    .line 838
    iget-object v2, v2, Lqv4;->b:Ljava/lang/String;

    .line 839
    .line 840
    invoke-virtual {v7, v2}, Low0;->a(Ljava/lang/String;)Low0;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    move-object/from16 v29, v2

    .line 845
    .line 846
    :goto_d
    iget-object v2, v8, Ltu;->c:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v2, [Lqv4;

    .line 849
    .line 850
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v9, Lqv4;

    .line 853
    .line 854
    aput-object v9, v2, v28

    .line 855
    .line 856
    goto :goto_e

    .line 857
    :cond_16
    move/from16 v27, v2

    .line 858
    .line 859
    move-object/from16 v29, v7

    .line 860
    .line 861
    :goto_e
    invoke-virtual {v0, v14}, Lbe3;->N(I)V

    .line 862
    .line 863
    .line 864
    move-object/from16 v2, v29

    .line 865
    .line 866
    goto :goto_f

    .line 867
    :cond_17
    move/from16 v27, v2

    .line 868
    .line 869
    move-object v2, v7

    .line 870
    :goto_f
    const-string v9, "video/3gpp"

    .line 871
    .line 872
    const v7, 0x6d317620

    .line 873
    .line 874
    .line 875
    if-ne v4, v7, :cond_18

    .line 876
    .line 877
    const-string v7, "video/mpeg"

    .line 878
    .line 879
    move-object/from16 v25, v7

    .line 880
    .line 881
    goto :goto_10

    .line 882
    :cond_18
    const v7, 0x48323633

    .line 883
    .line 884
    .line 885
    if-ne v4, v7, :cond_19

    .line 886
    .line 887
    move-object/from16 v25, v9

    .line 888
    .line 889
    goto :goto_10

    .line 890
    :cond_19
    move-object/from16 v25, v19

    .line 891
    .line 892
    :goto_10
    const/high16 v26, 0x3f800000    # 1.0f

    .line 893
    .line 894
    move/from16 v42, v1

    .line 895
    .line 896
    move-object/from16 v34, v2

    .line 897
    .line 898
    move/from16 v30, v11

    .line 899
    .line 900
    move/from16 v38, v12

    .line 901
    .line 902
    move/from16 v31, v13

    .line 903
    .line 904
    move/from16 v43, v15

    .line 905
    .line 906
    move/from16 v1, v18

    .line 907
    .line 908
    move v2, v1

    .line 909
    move-object/from16 v13, v19

    .line 910
    .line 911
    move-object v15, v13

    .line 912
    move-object/from16 v29, v15

    .line 913
    .line 914
    move-object/from16 v32, v29

    .line 915
    .line 916
    move-object/from16 v37, v32

    .line 917
    .line 918
    move-object/from16 v44, v37

    .line 919
    .line 920
    move-object/from16 v45, v44

    .line 921
    .line 922
    move-object/from16 v46, v45

    .line 923
    .line 924
    move-object/from16 v7, v25

    .line 925
    .line 926
    move/from16 v39, v26

    .line 927
    .line 928
    const/4 v5, -0x1

    .line 929
    const/4 v10, -0x1

    .line 930
    const/4 v12, -0x1

    .line 931
    const/16 v33, 0x0

    .line 932
    .line 933
    const/16 v35, -0x1

    .line 934
    .line 935
    const/16 v36, -0x1

    .line 936
    .line 937
    const/16 v40, -0x1

    .line 938
    .line 939
    const/16 v41, -0x1

    .line 940
    .line 941
    move-object/from16 v26, v9

    .line 942
    .line 943
    move v9, v14

    .line 944
    const/4 v14, -0x1

    .line 945
    :goto_11
    sub-int v11, v9, v27

    .line 946
    .line 947
    if-ge v11, v3, :cond_1a

    .line 948
    .line 949
    invoke-virtual {v0, v9}, Lbe3;->N(I)V

    .line 950
    .line 951
    .line 952
    iget v11, v0, Lbe3;->b:I

    .line 953
    .line 954
    move/from16 v47, v9

    .line 955
    .line 956
    invoke-virtual {v0}, Lbe3;->m()I

    .line 957
    .line 958
    .line 959
    move-result v9

    .line 960
    move/from16 v48, v11

    .line 961
    .line 962
    if-nez v9, :cond_1b

    .line 963
    .line 964
    iget v11, v0, Lbe3;->b:I

    .line 965
    .line 966
    sub-int v11, v11, v27

    .line 967
    .line 968
    if-ne v11, v3, :cond_1b

    .line 969
    .line 970
    :cond_1a
    move/from16 v55, v1

    .line 971
    .line 972
    move/from16 v57, v2

    .line 973
    .line 974
    move/from16 v49, v3

    .line 975
    .line 976
    move v1, v5

    .line 977
    move-object/from16 v58, v7

    .line 978
    .line 979
    move-object/from16 v63, v8

    .line 980
    .line 981
    move/from16 v59, v10

    .line 982
    .line 983
    move-object/from16 v7, v19

    .line 984
    .line 985
    const/4 v15, 0x0

    .line 986
    const/16 v16, 0xc

    .line 987
    .line 988
    goto/16 :goto_5a

    .line 989
    .line 990
    :cond_1b
    if-lez v9, :cond_1c

    .line 991
    .line 992
    const/4 v11, 0x1

    .line 993
    goto :goto_12

    .line 994
    :cond_1c
    const/4 v11, 0x0

    .line 995
    :goto_12
    invoke-static {v6, v11}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v0}, Lbe3;->m()I

    .line 999
    .line 1000
    .line 1001
    move-result v11

    .line 1002
    move/from16 v49, v3

    .line 1003
    .line 1004
    const v3, 0x61766343

    .line 1005
    .line 1006
    .line 1007
    if-ne v11, v3, :cond_1f

    .line 1008
    .line 1009
    if-nez v7, :cond_1d

    .line 1010
    .line 1011
    const/4 v1, 0x1

    .line 1012
    :goto_13
    move-object/from16 v2, v19

    .line 1013
    .line 1014
    goto :goto_14

    .line 1015
    :cond_1d
    const/4 v1, 0x0

    .line 1016
    goto :goto_13

    .line 1017
    :goto_14
    invoke-static {v2, v1}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1018
    .line 1019
    .line 1020
    add-int/lit8 v11, v48, 0x8

    .line 1021
    .line 1022
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v0}, Lyn;->a(Lbe3;)Lyn;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    iget-object v13, v1, Lyn;->a:Ljava/util/ArrayList;

    .line 1030
    .line 1031
    iget v2, v1, Lyn;->b:I

    .line 1032
    .line 1033
    iput v2, v8, Ltu;->a:I

    .line 1034
    .line 1035
    if-nez v33, :cond_1e

    .line 1036
    .line 1037
    iget v10, v1, Lyn;->k:F

    .line 1038
    .line 1039
    goto :goto_15

    .line 1040
    :cond_1e
    move/from16 v10, v39

    .line 1041
    .line 1042
    :goto_15
    iget-object v2, v1, Lyn;->l:Ljava/lang/String;

    .line 1043
    .line 1044
    iget v3, v1, Lyn;->j:I

    .line 1045
    .line 1046
    iget v12, v1, Lyn;->g:I

    .line 1047
    .line 1048
    iget v7, v1, Lyn;->h:I

    .line 1049
    .line 1050
    iget v14, v1, Lyn;->i:I

    .line 1051
    .line 1052
    iget v11, v1, Lyn;->e:I

    .line 1053
    .line 1054
    iget v1, v1, Lyn;->f:I

    .line 1055
    .line 1056
    const-string v32, "video/avc"

    .line 1057
    .line 1058
    move/from16 v36, v3

    .line 1059
    .line 1060
    move/from16 v50, v4

    .line 1061
    .line 1062
    move v3, v5

    .line 1063
    move-object/from16 v51, v6

    .line 1064
    .line 1065
    move-object/from16 v63, v8

    .line 1066
    .line 1067
    move/from16 v39, v10

    .line 1068
    .line 1069
    move/from16 v57, v11

    .line 1070
    .line 1071
    move-object/from16 v60, v15

    .line 1072
    .line 1073
    move/from16 v8, v18

    .line 1074
    .line 1075
    move-object/from16 v58, v32

    .line 1076
    .line 1077
    const/4 v4, -0x1

    .line 1078
    const/4 v5, 0x4

    .line 1079
    const v6, 0x65736473

    .line 1080
    .line 1081
    .line 1082
    const/4 v15, 0x0

    .line 1083
    const/16 v16, 0xc

    .line 1084
    .line 1085
    const v24, 0x76703038

    .line 1086
    .line 1087
    .line 1088
    move-object/from16 v32, v2

    .line 1089
    .line 1090
    move v10, v7

    .line 1091
    const/4 v2, 0x1

    .line 1092
    :goto_16
    const/4 v7, 0x0

    .line 1093
    goto/16 :goto_59

    .line 1094
    .line 1095
    :cond_1f
    const v3, 0x68766343

    .line 1096
    .line 1097
    .line 1098
    move/from16 v50, v4

    .line 1099
    .line 1100
    const-string v4, "video/hevc"

    .line 1101
    .line 1102
    if-ne v11, v3, :cond_23

    .line 1103
    .line 1104
    if-nez v7, :cond_20

    .line 1105
    .line 1106
    const/4 v1, 0x1

    .line 1107
    :goto_17
    const/4 v2, 0x0

    .line 1108
    goto :goto_18

    .line 1109
    :cond_20
    const/4 v1, 0x0

    .line 1110
    goto :goto_17

    .line 1111
    :goto_18
    invoke-static {v2, v1}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1112
    .line 1113
    .line 1114
    add-int/lit8 v11, v48, 0x8

    .line 1115
    .line 1116
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 1117
    .line 1118
    .line 1119
    const/4 v15, 0x0

    .line 1120
    invoke-static {v0, v15, v2}, Lzl1;->a(Lbe3;ZLss0;)Lzl1;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v1

    .line 1124
    iget-object v13, v1, Lzl1;->a:Ljava/util/List;

    .line 1125
    .line 1126
    iget v2, v1, Lzl1;->b:I

    .line 1127
    .line 1128
    iput v2, v8, Ltu;->a:I

    .line 1129
    .line 1130
    if-nez v33, :cond_21

    .line 1131
    .line 1132
    iget v10, v1, Lzl1;->l:F

    .line 1133
    .line 1134
    goto :goto_19

    .line 1135
    :cond_21
    move/from16 v10, v39

    .line 1136
    .line 1137
    :goto_19
    iget v2, v1, Lzl1;->m:I

    .line 1138
    .line 1139
    iget v3, v1, Lzl1;->c:I

    .line 1140
    .line 1141
    iget-object v7, v1, Lzl1;->n:Ljava/lang/String;

    .line 1142
    .line 1143
    iget v11, v1, Lzl1;->k:I

    .line 1144
    .line 1145
    const/4 v12, -0x1

    .line 1146
    if-eq v11, v12, :cond_22

    .line 1147
    .line 1148
    move v5, v11

    .line 1149
    :cond_22
    iget v11, v1, Lzl1;->d:I

    .line 1150
    .line 1151
    iget v14, v1, Lzl1;->e:I

    .line 1152
    .line 1153
    iget v12, v1, Lzl1;->h:I

    .line 1154
    .line 1155
    iget v15, v1, Lzl1;->i:I

    .line 1156
    .line 1157
    move/from16 v32, v2

    .line 1158
    .line 1159
    iget v2, v1, Lzl1;->j:I

    .line 1160
    .line 1161
    move/from16 v35, v2

    .line 1162
    .line 1163
    iget v2, v1, Lzl1;->f:I

    .line 1164
    .line 1165
    move/from16 v36, v2

    .line 1166
    .line 1167
    iget v2, v1, Lzl1;->g:I

    .line 1168
    .line 1169
    iget-object v1, v1, Lzl1;->o:Lss0;

    .line 1170
    .line 1171
    move-object/from16 v60, v1

    .line 1172
    .line 1173
    move v1, v2

    .line 1174
    move-object/from16 v58, v4

    .line 1175
    .line 1176
    move-object/from16 v51, v6

    .line 1177
    .line 1178
    move-object/from16 v63, v8

    .line 1179
    .line 1180
    move/from16 v39, v10

    .line 1181
    .line 1182
    move/from16 v41, v11

    .line 1183
    .line 1184
    move/from16 v40, v14

    .line 1185
    .line 1186
    move v10, v15

    .line 1187
    move/from16 v8, v18

    .line 1188
    .line 1189
    move/from16 v14, v35

    .line 1190
    .line 1191
    move/from16 v57, v36

    .line 1192
    .line 1193
    const/4 v2, 0x1

    .line 1194
    const/4 v4, -0x1

    .line 1195
    const v6, 0x65736473

    .line 1196
    .line 1197
    .line 1198
    const/4 v15, 0x0

    .line 1199
    const/16 v16, 0xc

    .line 1200
    .line 1201
    const v24, 0x76703038

    .line 1202
    .line 1203
    .line 1204
    move/from16 v35, v3

    .line 1205
    .line 1206
    move v3, v5

    .line 1207
    move/from16 v36, v32

    .line 1208
    .line 1209
    const/4 v5, 0x4

    .line 1210
    move-object/from16 v32, v7

    .line 1211
    .line 1212
    goto :goto_16

    .line 1213
    :cond_23
    const v3, 0x6c687643

    .line 1214
    .line 1215
    .line 1216
    move/from16 v51, v5

    .line 1217
    .line 1218
    const/4 v5, 0x2

    .line 1219
    if-ne v11, v3, :cond_2f

    .line 1220
    .line 1221
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1222
    .line 1223
    .line 1224
    move-result v3

    .line 1225
    const-string v4, "lhvC must follow hvcC atom"

    .line 1226
    .line 1227
    invoke-static {v4, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1228
    .line 1229
    .line 1230
    if-eqz v15, :cond_24

    .line 1231
    .line 1232
    iget-object v3, v15, Lss0;->n:Ljava/lang/Object;

    .line 1233
    .line 1234
    check-cast v3, Lyw1;

    .line 1235
    .line 1236
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 1237
    .line 1238
    .line 1239
    move-result v3

    .line 1240
    if-lt v3, v5, :cond_24

    .line 1241
    .line 1242
    const/4 v3, 0x1

    .line 1243
    goto :goto_1a

    .line 1244
    :cond_24
    const/4 v3, 0x0

    .line 1245
    :goto_1a
    const-string v4, "must have at least two layers"

    .line 1246
    .line 1247
    invoke-static {v4, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1248
    .line 1249
    .line 1250
    add-int/lit8 v11, v48, 0x8

    .line 1251
    .line 1252
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    const/4 v3, 0x1

    .line 1259
    invoke-static {v0, v3, v15}, Lzl1;->a(Lbe3;ZLss0;)Lzl1;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v4

    .line 1263
    iget v3, v8, Ltu;->a:I

    .line 1264
    .line 1265
    iget v5, v4, Lzl1;->b:I

    .line 1266
    .line 1267
    if-ne v3, v5, :cond_25

    .line 1268
    .line 1269
    const/4 v3, 0x1

    .line 1270
    goto :goto_1b

    .line 1271
    :cond_25
    const/4 v3, 0x0

    .line 1272
    :goto_1b
    const-string v5, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    .line 1273
    .line 1274
    invoke-static {v5, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1275
    .line 1276
    .line 1277
    iget v3, v4, Lzl1;->h:I

    .line 1278
    .line 1279
    const/4 v5, -0x1

    .line 1280
    if-eq v3, v5, :cond_27

    .line 1281
    .line 1282
    if-ne v12, v3, :cond_26

    .line 1283
    .line 1284
    const/4 v3, 0x1

    .line 1285
    goto :goto_1c

    .line 1286
    :cond_26
    const/4 v3, 0x0

    .line 1287
    :goto_1c
    const-string v7, "colorSpace must be the same for both views"

    .line 1288
    .line 1289
    invoke-static {v7, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1290
    .line 1291
    .line 1292
    :cond_27
    iget v3, v4, Lzl1;->i:I

    .line 1293
    .line 1294
    if-eq v3, v5, :cond_29

    .line 1295
    .line 1296
    if-ne v10, v3, :cond_28

    .line 1297
    .line 1298
    const/4 v3, 0x1

    .line 1299
    goto :goto_1d

    .line 1300
    :cond_28
    const/4 v3, 0x0

    .line 1301
    :goto_1d
    const-string v7, "colorRange must be the same for both views"

    .line 1302
    .line 1303
    invoke-static {v7, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1304
    .line 1305
    .line 1306
    :cond_29
    iget v3, v4, Lzl1;->j:I

    .line 1307
    .line 1308
    if-eq v3, v5, :cond_2b

    .line 1309
    .line 1310
    if-ne v14, v3, :cond_2a

    .line 1311
    .line 1312
    const/4 v3, 0x1

    .line 1313
    goto :goto_1e

    .line 1314
    :cond_2a
    const/4 v3, 0x0

    .line 1315
    :goto_1e
    const-string v5, "colorTransfer must be the same for both views"

    .line 1316
    .line 1317
    invoke-static {v5, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1318
    .line 1319
    .line 1320
    :cond_2b
    iget v3, v4, Lzl1;->f:I

    .line 1321
    .line 1322
    if-ne v2, v3, :cond_2c

    .line 1323
    .line 1324
    const/4 v3, 0x1

    .line 1325
    goto :goto_1f

    .line 1326
    :cond_2c
    const/4 v3, 0x0

    .line 1327
    :goto_1f
    const-string v5, "bitdepthLuma must be the same for both views"

    .line 1328
    .line 1329
    invoke-static {v5, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1330
    .line 1331
    .line 1332
    iget v3, v4, Lzl1;->g:I

    .line 1333
    .line 1334
    if-ne v1, v3, :cond_2d

    .line 1335
    .line 1336
    const/4 v3, 0x1

    .line 1337
    goto :goto_20

    .line 1338
    :cond_2d
    const/4 v3, 0x0

    .line 1339
    :goto_20
    const-string v5, "bitdepthChroma must be the same for both views"

    .line 1340
    .line 1341
    invoke-static {v5, v3}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1342
    .line 1343
    .line 1344
    if-eqz v13, :cond_2e

    .line 1345
    .line 1346
    invoke-static {}, Lyw1;->j()Luw1;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v3

    .line 1350
    invoke-virtual {v3, v13}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 1351
    .line 1352
    .line 1353
    iget-object v5, v4, Lzl1;->a:Ljava/util/List;

    .line 1354
    .line 1355
    invoke-virtual {v3, v5}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v3}, Luw1;->f()Lgy3;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v13

    .line 1362
    goto :goto_21

    .line 1363
    :cond_2e
    const-string v3, "initializationData must be already set from hvcC atom"

    .line 1364
    .line 1365
    const/4 v5, 0x0

    .line 1366
    invoke-static {v3, v5}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1367
    .line 1368
    .line 1369
    :goto_21
    iget-object v3, v4, Lzl1;->n:Ljava/lang/String;

    .line 1370
    .line 1371
    const-string v4, "video/mv-hevc"

    .line 1372
    .line 1373
    move/from16 v57, v2

    .line 1374
    .line 1375
    move-object/from16 v32, v3

    .line 1376
    .line 1377
    move-object/from16 v58, v4

    .line 1378
    .line 1379
    move-object/from16 v63, v8

    .line 1380
    .line 1381
    move-object/from16 v60, v15

    .line 1382
    .line 1383
    move/from16 v8, v18

    .line 1384
    .line 1385
    move/from16 v3, v51

    .line 1386
    .line 1387
    const/4 v2, 0x1

    .line 1388
    const/4 v4, -0x1

    .line 1389
    const/4 v5, 0x4

    .line 1390
    const/4 v7, 0x0

    .line 1391
    const/4 v15, 0x0

    .line 1392
    const/16 v16, 0xc

    .line 1393
    .line 1394
    const v24, 0x76703038

    .line 1395
    .line 1396
    .line 1397
    move-object/from16 v51, v6

    .line 1398
    .line 1399
    const v6, 0x65736473

    .line 1400
    .line 1401
    .line 1402
    goto/16 :goto_59

    .line 1403
    .line 1404
    :cond_2f
    const v3, 0x76657875

    .line 1405
    .line 1406
    .line 1407
    const/16 v52, 0x5

    .line 1408
    .line 1409
    if-ne v11, v3, :cond_3f

    .line 1410
    .line 1411
    add-int/lit8 v11, v48, 0x8

    .line 1412
    .line 1413
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 1414
    .line 1415
    .line 1416
    iget v3, v0, Lbe3;->b:I

    .line 1417
    .line 1418
    const/4 v11, 0x0

    .line 1419
    :goto_22
    sub-int v4, v3, v48

    .line 1420
    .line 1421
    if-ge v4, v9, :cond_38

    .line 1422
    .line 1423
    invoke-virtual {v0, v3}, Lbe3;->N(I)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v0}, Lbe3;->m()I

    .line 1427
    .line 1428
    .line 1429
    move-result v4

    .line 1430
    if-lez v4, :cond_30

    .line 1431
    .line 1432
    const/4 v5, 0x1

    .line 1433
    goto :goto_23

    .line 1434
    :cond_30
    const/4 v5, 0x0

    .line 1435
    :goto_23
    invoke-static {v6, v5}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v0}, Lbe3;->m()I

    .line 1439
    .line 1440
    .line 1441
    move-result v5

    .line 1442
    move/from16 v55, v1

    .line 1443
    .line 1444
    const v1, 0x65796573

    .line 1445
    .line 1446
    .line 1447
    if-ne v5, v1, :cond_37

    .line 1448
    .line 1449
    add-int/lit8 v1, v3, 0x8

    .line 1450
    .line 1451
    invoke-virtual {v0, v1}, Lbe3;->N(I)V

    .line 1452
    .line 1453
    .line 1454
    iget v1, v0, Lbe3;->b:I

    .line 1455
    .line 1456
    :goto_24
    sub-int v5, v1, v3

    .line 1457
    .line 1458
    if-ge v5, v4, :cond_36

    .line 1459
    .line 1460
    invoke-virtual {v0, v1}, Lbe3;->N(I)V

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v0}, Lbe3;->m()I

    .line 1464
    .line 1465
    .line 1466
    move-result v5

    .line 1467
    if-lez v5, :cond_31

    .line 1468
    .line 1469
    const/4 v11, 0x1

    .line 1470
    goto :goto_25

    .line 1471
    :cond_31
    const/4 v11, 0x0

    .line 1472
    :goto_25
    invoke-static {v6, v11}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v0}, Lbe3;->m()I

    .line 1476
    .line 1477
    .line 1478
    move-result v11

    .line 1479
    move/from16 v56, v1

    .line 1480
    .line 1481
    const v1, 0x73747269

    .line 1482
    .line 1483
    .line 1484
    if-ne v11, v1, :cond_35

    .line 1485
    .line 1486
    const/4 v1, 0x4

    .line 1487
    invoke-virtual {v0, v1}, Lbe3;->O(I)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v0}, Lbe3;->A()I

    .line 1491
    .line 1492
    .line 1493
    move-result v1

    .line 1494
    new-instance v5, Lzh0;

    .line 1495
    .line 1496
    new-instance v11, Lyl;

    .line 1497
    .line 1498
    move/from16 v56, v1

    .line 1499
    .line 1500
    and-int/lit8 v1, v56, 0x1

    .line 1501
    .line 1502
    move/from16 v57, v2

    .line 1503
    .line 1504
    const/4 v2, 0x1

    .line 1505
    if-ne v1, v2, :cond_32

    .line 1506
    .line 1507
    const/4 v1, 0x1

    .line 1508
    goto :goto_26

    .line 1509
    :cond_32
    const/4 v1, 0x0

    .line 1510
    :goto_26
    and-int/lit8 v2, v56, 0x2

    .line 1511
    .line 1512
    move/from16 v58, v3

    .line 1513
    .line 1514
    const/4 v3, 0x2

    .line 1515
    if-ne v2, v3, :cond_33

    .line 1516
    .line 1517
    const/4 v2, 0x1

    .line 1518
    goto :goto_27

    .line 1519
    :cond_33
    const/4 v2, 0x0

    .line 1520
    :goto_27
    and-int/lit8 v3, v56, 0x8

    .line 1521
    .line 1522
    move/from16 v59, v4

    .line 1523
    .line 1524
    move/from16 v4, v18

    .line 1525
    .line 1526
    if-ne v3, v4, :cond_34

    .line 1527
    .line 1528
    const/4 v3, 0x1

    .line 1529
    goto :goto_28

    .line 1530
    :cond_34
    const/4 v3, 0x0

    .line 1531
    :goto_28
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 1532
    .line 1533
    .line 1534
    iput-boolean v1, v11, Lyl;->a:Z

    .line 1535
    .line 1536
    iput-boolean v2, v11, Lyl;->b:Z

    .line 1537
    .line 1538
    iput-boolean v3, v11, Lyl;->c:Z

    .line 1539
    .line 1540
    const/16 v1, 0xb

    .line 1541
    .line 1542
    invoke-direct {v5, v1, v11}, Lzh0;-><init>(ILjava/lang/Object;)V

    .line 1543
    .line 1544
    .line 1545
    goto :goto_29

    .line 1546
    :cond_35
    move/from16 v57, v2

    .line 1547
    .line 1548
    move/from16 v58, v3

    .line 1549
    .line 1550
    move/from16 v59, v4

    .line 1551
    .line 1552
    add-int v1, v56, v5

    .line 1553
    .line 1554
    const/16 v18, 0x8

    .line 1555
    .line 1556
    goto :goto_24

    .line 1557
    :cond_36
    move/from16 v57, v2

    .line 1558
    .line 1559
    move/from16 v58, v3

    .line 1560
    .line 1561
    move/from16 v59, v4

    .line 1562
    .line 1563
    const/4 v5, 0x0

    .line 1564
    :goto_29
    move-object v11, v5

    .line 1565
    goto :goto_2a

    .line 1566
    :cond_37
    move/from16 v57, v2

    .line 1567
    .line 1568
    move/from16 v58, v3

    .line 1569
    .line 1570
    move/from16 v59, v4

    .line 1571
    .line 1572
    :goto_2a
    add-int v3, v58, v59

    .line 1573
    .line 1574
    move/from16 v1, v55

    .line 1575
    .line 1576
    move/from16 v2, v57

    .line 1577
    .line 1578
    const/4 v5, 0x2

    .line 1579
    const/16 v18, 0x8

    .line 1580
    .line 1581
    goto/16 :goto_22

    .line 1582
    .line 1583
    :cond_38
    move/from16 v55, v1

    .line 1584
    .line 1585
    move/from16 v57, v2

    .line 1586
    .line 1587
    if-nez v11, :cond_39

    .line 1588
    .line 1589
    const/4 v1, 0x0

    .line 1590
    goto :goto_2b

    .line 1591
    :cond_39
    new-instance v1, Lhg3;

    .line 1592
    .line 1593
    const/16 v4, 0x8

    .line 1594
    .line 1595
    invoke-direct {v1, v4, v11}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 1596
    .line 1597
    .line 1598
    :goto_2b
    if-eqz v1, :cond_3b

    .line 1599
    .line 1600
    iget-object v1, v1, Lhg3;->o:Ljava/lang/Object;

    .line 1601
    .line 1602
    check-cast v1, Lzh0;

    .line 1603
    .line 1604
    iget-object v1, v1, Lzh0;->o:Ljava/lang/Object;

    .line 1605
    .line 1606
    check-cast v1, Lyl;

    .line 1607
    .line 1608
    iget-boolean v2, v1, Lyl;->c:Z

    .line 1609
    .line 1610
    if-eqz v15, :cond_3c

    .line 1611
    .line 1612
    iget-object v3, v15, Lss0;->n:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v3, Lyw1;

    .line 1615
    .line 1616
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 1617
    .line 1618
    .line 1619
    move-result v3

    .line 1620
    const/4 v4, 0x2

    .line 1621
    if-lt v3, v4, :cond_3c

    .line 1622
    .line 1623
    iget-boolean v3, v1, Lyl;->a:Z

    .line 1624
    .line 1625
    if-eqz v3, :cond_3a

    .line 1626
    .line 1627
    iget-boolean v1, v1, Lyl;->b:Z

    .line 1628
    .line 1629
    if-eqz v1, :cond_3a

    .line 1630
    .line 1631
    const/4 v1, 0x1

    .line 1632
    goto :goto_2c

    .line 1633
    :cond_3a
    const/4 v1, 0x0

    .line 1634
    :goto_2c
    const-string v3, "both eye views must be marked as available"

    .line 1635
    .line 1636
    invoke-static {v3, v1}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1637
    .line 1638
    .line 1639
    xor-int/lit8 v1, v2, 0x1

    .line 1640
    .line 1641
    const-string v2, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 1642
    .line 1643
    invoke-static {v2, v1}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1644
    .line 1645
    .line 1646
    :cond_3b
    move/from16 v1, v51

    .line 1647
    .line 1648
    goto :goto_2e

    .line 1649
    :cond_3c
    move/from16 v1, v51

    .line 1650
    .line 1651
    const/4 v5, -0x1

    .line 1652
    if-ne v1, v5, :cond_3e

    .line 1653
    .line 1654
    if-eqz v2, :cond_3d

    .line 1655
    .line 1656
    goto :goto_2d

    .line 1657
    :cond_3d
    const/16 v52, 0x4

    .line 1658
    .line 1659
    :goto_2d
    move/from16 v5, v52

    .line 1660
    .line 1661
    goto :goto_2f

    .line 1662
    :cond_3e
    :goto_2e
    move v5, v1

    .line 1663
    :goto_2f
    move v3, v5

    .line 1664
    move-object/from16 v51, v6

    .line 1665
    .line 1666
    move-object/from16 v58, v7

    .line 1667
    .line 1668
    move-object/from16 v63, v8

    .line 1669
    .line 1670
    move-object/from16 v60, v15

    .line 1671
    .line 1672
    move/from16 v1, v55

    .line 1673
    .line 1674
    const/4 v2, 0x1

    .line 1675
    const/4 v4, -0x1

    .line 1676
    const/4 v5, 0x4

    .line 1677
    const v6, 0x65736473

    .line 1678
    .line 1679
    .line 1680
    const/4 v7, 0x0

    .line 1681
    const/16 v8, 0x8

    .line 1682
    .line 1683
    const/4 v15, 0x0

    .line 1684
    const/16 v16, 0xc

    .line 1685
    .line 1686
    const v24, 0x76703038

    .line 1687
    .line 1688
    .line 1689
    goto/16 :goto_59

    .line 1690
    .line 1691
    :cond_3f
    move/from16 v55, v1

    .line 1692
    .line 1693
    move/from16 v57, v2

    .line 1694
    .line 1695
    move/from16 v1, v51

    .line 1696
    .line 1697
    const v2, 0x64766343

    .line 1698
    .line 1699
    .line 1700
    if-eq v11, v2, :cond_40

    .line 1701
    .line 1702
    const v2, 0x64767643

    .line 1703
    .line 1704
    .line 1705
    if-eq v11, v2, :cond_40

    .line 1706
    .line 1707
    const v2, 0x64767743

    .line 1708
    .line 1709
    .line 1710
    if-ne v11, v2, :cond_41

    .line 1711
    .line 1712
    :cond_40
    move-object/from16 v51, v6

    .line 1713
    .line 1714
    move-object/from16 v58, v7

    .line 1715
    .line 1716
    move-object/from16 v63, v8

    .line 1717
    .line 1718
    move/from16 v59, v10

    .line 1719
    .line 1720
    move-object/from16 v60, v15

    .line 1721
    .line 1722
    const/4 v2, 0x1

    .line 1723
    const/4 v4, -0x1

    .line 1724
    const/4 v5, 0x4

    .line 1725
    const v6, 0x65736473

    .line 1726
    .line 1727
    .line 1728
    const/4 v7, 0x0

    .line 1729
    const/16 v8, 0x8

    .line 1730
    .line 1731
    const/4 v15, 0x0

    .line 1732
    const/16 v16, 0xc

    .line 1733
    .line 1734
    const v24, 0x76703038

    .line 1735
    .line 1736
    .line 1737
    goto/16 :goto_58

    .line 1738
    .line 1739
    :cond_41
    const v2, 0x76706343

    .line 1740
    .line 1741
    .line 1742
    const/4 v4, 0x7

    .line 1743
    const/4 v5, 0x6

    .line 1744
    if-ne v11, v2, :cond_47

    .line 1745
    .line 1746
    if-nez v7, :cond_42

    .line 1747
    .line 1748
    const/4 v2, 0x1

    .line 1749
    :goto_30
    const/4 v7, 0x0

    .line 1750
    goto :goto_31

    .line 1751
    :cond_42
    const/4 v2, 0x0

    .line 1752
    goto :goto_30

    .line 1753
    :goto_31
    invoke-static {v7, v2}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 1754
    .line 1755
    .line 1756
    const-string v2, "video/x-vnd.on2.vp9"

    .line 1757
    .line 1758
    move/from16 v7, v50

    .line 1759
    .line 1760
    const v10, 0x76703038

    .line 1761
    .line 1762
    .line 1763
    if-ne v7, v10, :cond_43

    .line 1764
    .line 1765
    const-string v11, "video/x-vnd.on2.vp8"

    .line 1766
    .line 1767
    goto :goto_32

    .line 1768
    :cond_43
    move-object v11, v2

    .line 1769
    :goto_32
    add-int/lit8 v12, v48, 0xc

    .line 1770
    .line 1771
    invoke-virtual {v0, v12}, Lbe3;->N(I)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v0}, Lbe3;->A()I

    .line 1775
    .line 1776
    .line 1777
    move-result v12

    .line 1778
    int-to-byte v12, v12

    .line 1779
    invoke-virtual {v0}, Lbe3;->A()I

    .line 1780
    .line 1781
    .line 1782
    move-result v14

    .line 1783
    int-to-byte v14, v14

    .line 1784
    invoke-virtual {v0}, Lbe3;->A()I

    .line 1785
    .line 1786
    .line 1787
    move-result v24

    .line 1788
    const/16 v50, 0xa

    .line 1789
    .line 1790
    shr-int/lit8 v3, v24, 0x4

    .line 1791
    .line 1792
    shr-int/lit8 v48, v24, 0x1

    .line 1793
    .line 1794
    and-int/lit8 v10, v48, 0x7

    .line 1795
    .line 1796
    int-to-byte v10, v10

    .line 1797
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1798
    .line 1799
    .line 1800
    move-result v2

    .line 1801
    if-eqz v2, :cond_44

    .line 1802
    .line 1803
    int-to-byte v2, v3

    .line 1804
    sget-object v13, Li40;->a:[B

    .line 1805
    .line 1806
    move/from16 v56, v4

    .line 1807
    .line 1808
    const/16 v13, 0xc

    .line 1809
    .line 1810
    new-array v4, v13, [B

    .line 1811
    .line 1812
    const/16 v22, 0x1

    .line 1813
    .line 1814
    const/16 v23, 0x0

    .line 1815
    .line 1816
    aput-byte v22, v4, v23

    .line 1817
    .line 1818
    aput-byte v22, v4, v22

    .line 1819
    .line 1820
    const/16 v54, 0x2

    .line 1821
    .line 1822
    aput-byte v12, v4, v54

    .line 1823
    .line 1824
    aput-byte v54, v4, v17

    .line 1825
    .line 1826
    const/16 v21, 0x4

    .line 1827
    .line 1828
    aput-byte v22, v4, v21

    .line 1829
    .line 1830
    aput-byte v14, v4, v52

    .line 1831
    .line 1832
    aput-byte v17, v4, v5

    .line 1833
    .line 1834
    aput-byte v22, v4, v56

    .line 1835
    .line 1836
    const/16 v18, 0x8

    .line 1837
    .line 1838
    aput-byte v2, v4, v18

    .line 1839
    .line 1840
    const/16 v2, 0x9

    .line 1841
    .line 1842
    aput-byte v21, v4, v2

    .line 1843
    .line 1844
    aput-byte v22, v4, v50

    .line 1845
    .line 1846
    const/16 v53, 0xb

    .line 1847
    .line 1848
    aput-byte v10, v4, v53

    .line 1849
    .line 1850
    invoke-static {v4}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v13

    .line 1854
    :cond_44
    and-int/lit8 v2, v24, 0x1

    .line 1855
    .line 1856
    if-eqz v2, :cond_45

    .line 1857
    .line 1858
    const/4 v2, 0x1

    .line 1859
    goto :goto_33

    .line 1860
    :cond_45
    const/4 v2, 0x0

    .line 1861
    :goto_33
    invoke-virtual {v0}, Lbe3;->A()I

    .line 1862
    .line 1863
    .line 1864
    move-result v4

    .line 1865
    invoke-virtual {v0}, Lbe3;->A()I

    .line 1866
    .line 1867
    .line 1868
    move-result v5

    .line 1869
    invoke-static {v4}, Lc50;->f(I)I

    .line 1870
    .line 1871
    .line 1872
    move-result v12

    .line 1873
    if-eqz v2, :cond_46

    .line 1874
    .line 1875
    const/16 v54, 0x1

    .line 1876
    .line 1877
    goto :goto_34

    .line 1878
    :cond_46
    const/16 v54, 0x2

    .line 1879
    .line 1880
    :goto_34
    invoke-static {v5}, Lc50;->g(I)I

    .line 1881
    .line 1882
    .line 1883
    move-result v14

    .line 1884
    move/from16 v57, v3

    .line 1885
    .line 1886
    move-object/from16 v51, v6

    .line 1887
    .line 1888
    move/from16 v50, v7

    .line 1889
    .line 1890
    move-object/from16 v63, v8

    .line 1891
    .line 1892
    move-object/from16 v58, v11

    .line 1893
    .line 1894
    move-object/from16 v60, v15

    .line 1895
    .line 1896
    move/from16 v10, v54

    .line 1897
    .line 1898
    const/4 v2, 0x1

    .line 1899
    const/4 v4, -0x1

    .line 1900
    const/4 v5, 0x4

    .line 1901
    const v6, 0x65736473

    .line 1902
    .line 1903
    .line 1904
    const/4 v7, 0x0

    .line 1905
    const/16 v8, 0x8

    .line 1906
    .line 1907
    const/4 v15, 0x0

    .line 1908
    const/16 v16, 0xc

    .line 1909
    .line 1910
    const v24, 0x76703038

    .line 1911
    .line 1912
    .line 1913
    move v3, v1

    .line 1914
    move/from16 v1, v57

    .line 1915
    .line 1916
    goto/16 :goto_59

    .line 1917
    .line 1918
    :cond_47
    move/from16 v56, v4

    .line 1919
    .line 1920
    move/from16 v4, v50

    .line 1921
    .line 1922
    const v24, 0x76703038

    .line 1923
    .line 1924
    .line 1925
    const/16 v50, 0xa

    .line 1926
    .line 1927
    const v2, 0x61763143

    .line 1928
    .line 1929
    .line 1930
    const-string v3, "BoxParsers"

    .line 1931
    .line 1932
    if-ne v11, v2, :cond_60

    .line 1933
    .line 1934
    add-int/lit8 v2, v9, -0x8

    .line 1935
    .line 1936
    new-array v7, v2, [B

    .line 1937
    .line 1938
    const/4 v10, 0x0

    .line 1939
    invoke-virtual {v0, v7, v10, v2}, Lbe3;->k([BII)V

    .line 1940
    .line 1941
    .line 1942
    invoke-static {v7}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v13

    .line 1946
    add-int/lit8 v11, v48, 0x8

    .line 1947
    .line 1948
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 1949
    .line 1950
    .line 1951
    new-instance v2, Lh00;

    .line 1952
    .line 1953
    iget-object v7, v0, Lbe3;->a:[B

    .line 1954
    .line 1955
    array-length v10, v7

    .line 1956
    invoke-direct {v2, v10, v7}, Lh00;-><init>(I[B)V

    .line 1957
    .line 1958
    .line 1959
    iget v7, v0, Lbe3;->b:I

    .line 1960
    .line 1961
    const/16 v18, 0x8

    .line 1962
    .line 1963
    mul-int/lit8 v7, v7, 0x8

    .line 1964
    .line 1965
    invoke-virtual {v2, v7}, Lh00;->q(I)V

    .line 1966
    .line 1967
    .line 1968
    const/4 v7, 0x1

    .line 1969
    invoke-virtual {v2, v7}, Lh00;->u(I)V

    .line 1970
    .line 1971
    .line 1972
    move/from16 v7, v17

    .line 1973
    .line 1974
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 1975
    .line 1976
    .line 1977
    move-result v10

    .line 1978
    invoke-virtual {v2, v5}, Lh00;->t(I)V

    .line 1979
    .line 1980
    .line 1981
    invoke-virtual {v2}, Lh00;->h()Z

    .line 1982
    .line 1983
    .line 1984
    move-result v5

    .line 1985
    invoke-virtual {v2}, Lh00;->h()Z

    .line 1986
    .line 1987
    .line 1988
    move-result v7

    .line 1989
    const/16 v58, -0x1

    .line 1990
    .line 1991
    const/4 v11, 0x2

    .line 1992
    if-ne v10, v11, :cond_4a

    .line 1993
    .line 1994
    if-eqz v5, :cond_4a

    .line 1995
    .line 1996
    if-eqz v7, :cond_48

    .line 1997
    .line 1998
    const/16 v5, 0xc

    .line 1999
    .line 2000
    goto :goto_35

    .line 2001
    :cond_48
    move/from16 v5, v50

    .line 2002
    .line 2003
    :goto_35
    if-eqz v7, :cond_49

    .line 2004
    .line 2005
    const/16 v50, 0xc

    .line 2006
    .line 2007
    :cond_49
    move/from16 v62, v5

    .line 2008
    .line 2009
    :goto_36
    move/from16 v63, v50

    .line 2010
    .line 2011
    goto :goto_39

    .line 2012
    :cond_4a
    if-gt v10, v11, :cond_4d

    .line 2013
    .line 2014
    if-eqz v5, :cond_4b

    .line 2015
    .line 2016
    move/from16 v7, v50

    .line 2017
    .line 2018
    goto :goto_37

    .line 2019
    :cond_4b
    const/16 v7, 0x8

    .line 2020
    .line 2021
    :goto_37
    if-eqz v5, :cond_4c

    .line 2022
    .line 2023
    goto :goto_38

    .line 2024
    :cond_4c
    const/16 v50, 0x8

    .line 2025
    .line 2026
    :goto_38
    move/from16 v62, v7

    .line 2027
    .line 2028
    goto :goto_36

    .line 2029
    :cond_4d
    move/from16 v62, v58

    .line 2030
    .line 2031
    move/from16 v63, v62

    .line 2032
    .line 2033
    :goto_39
    const/16 v5, 0xd

    .line 2034
    .line 2035
    invoke-virtual {v2, v5}, Lh00;->t(I)V

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v2}, Lh00;->s()V

    .line 2039
    .line 2040
    .line 2041
    const/4 v7, 0x4

    .line 2042
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2043
    .line 2044
    .line 2045
    move-result v10

    .line 2046
    const/16 v61, 0x0

    .line 2047
    .line 2048
    const/4 v7, 0x1

    .line 2049
    if-eq v10, v7, :cond_4e

    .line 2050
    .line 2051
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2052
    .line 2053
    const-string v5, "Unsupported obu_type: "

    .line 2054
    .line 2055
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2056
    .line 2057
    .line 2058
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2059
    .line 2060
    .line 2061
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v2

    .line 2065
    invoke-static {v3, v2}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 2066
    .line 2067
    .line 2068
    new-instance v57, Lc50;

    .line 2069
    .line 2070
    move/from16 v59, v58

    .line 2071
    .line 2072
    move/from16 v60, v58

    .line 2073
    .line 2074
    invoke-direct/range {v57 .. v63}, Lc50;-><init>(III[BII)V

    .line 2075
    .line 2076
    .line 2077
    :goto_3a
    move-object/from16 v2, v57

    .line 2078
    .line 2079
    const/16 v12, 0xc

    .line 2080
    .line 2081
    goto/16 :goto_42

    .line 2082
    .line 2083
    :cond_4e
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2084
    .line 2085
    .line 2086
    move-result v7

    .line 2087
    if-eqz v7, :cond_4f

    .line 2088
    .line 2089
    const-string v2, "Unsupported obu_extension_flag"

    .line 2090
    .line 2091
    invoke-static {v3, v2}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 2092
    .line 2093
    .line 2094
    new-instance v57, Lc50;

    .line 2095
    .line 2096
    move/from16 v59, v58

    .line 2097
    .line 2098
    move/from16 v60, v58

    .line 2099
    .line 2100
    invoke-direct/range {v57 .. v63}, Lc50;-><init>(III[BII)V

    .line 2101
    .line 2102
    .line 2103
    goto :goto_3a

    .line 2104
    :cond_4f
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2105
    .line 2106
    .line 2107
    move-result v7

    .line 2108
    invoke-virtual {v2}, Lh00;->s()V

    .line 2109
    .line 2110
    .line 2111
    if-eqz v7, :cond_50

    .line 2112
    .line 2113
    const/16 v7, 0x8

    .line 2114
    .line 2115
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2116
    .line 2117
    .line 2118
    move-result v10

    .line 2119
    const/16 v7, 0x7f

    .line 2120
    .line 2121
    if-le v10, v7, :cond_50

    .line 2122
    .line 2123
    const-string v2, "Excessive obu_size"

    .line 2124
    .line 2125
    invoke-static {v3, v2}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 2126
    .line 2127
    .line 2128
    new-instance v57, Lc50;

    .line 2129
    .line 2130
    move/from16 v59, v58

    .line 2131
    .line 2132
    move/from16 v60, v58

    .line 2133
    .line 2134
    invoke-direct/range {v57 .. v63}, Lc50;-><init>(III[BII)V

    .line 2135
    .line 2136
    .line 2137
    goto :goto_3a

    .line 2138
    :cond_50
    const/4 v7, 0x3

    .line 2139
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2140
    .line 2141
    .line 2142
    move-result v10

    .line 2143
    invoke-virtual {v2}, Lh00;->s()V

    .line 2144
    .line 2145
    .line 2146
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2147
    .line 2148
    .line 2149
    move-result v7

    .line 2150
    if-eqz v7, :cond_51

    .line 2151
    .line 2152
    const-string v2, "Unsupported reduced_still_picture_header"

    .line 2153
    .line 2154
    invoke-static {v3, v2}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 2155
    .line 2156
    .line 2157
    new-instance v57, Lc50;

    .line 2158
    .line 2159
    move/from16 v59, v58

    .line 2160
    .line 2161
    move/from16 v60, v58

    .line 2162
    .line 2163
    invoke-direct/range {v57 .. v63}, Lc50;-><init>(III[BII)V

    .line 2164
    .line 2165
    .line 2166
    goto :goto_3a

    .line 2167
    :cond_51
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2168
    .line 2169
    .line 2170
    move-result v7

    .line 2171
    if-eqz v7, :cond_52

    .line 2172
    .line 2173
    const-string v2, "Unsupported timing_info_present_flag"

    .line 2174
    .line 2175
    invoke-static {v3, v2}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 2176
    .line 2177
    .line 2178
    new-instance v57, Lc50;

    .line 2179
    .line 2180
    move/from16 v59, v58

    .line 2181
    .line 2182
    move/from16 v60, v58

    .line 2183
    .line 2184
    invoke-direct/range {v57 .. v63}, Lc50;-><init>(III[BII)V

    .line 2185
    .line 2186
    .line 2187
    goto :goto_3a

    .line 2188
    :cond_52
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2189
    .line 2190
    .line 2191
    move-result v7

    .line 2192
    if-eqz v7, :cond_53

    .line 2193
    .line 2194
    const-string v2, "Unsupported initial_display_delay_present_flag"

    .line 2195
    .line 2196
    invoke-static {v3, v2}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 2197
    .line 2198
    .line 2199
    new-instance v57, Lc50;

    .line 2200
    .line 2201
    move/from16 v59, v58

    .line 2202
    .line 2203
    move/from16 v60, v58

    .line 2204
    .line 2205
    invoke-direct/range {v57 .. v63}, Lc50;-><init>(III[BII)V

    .line 2206
    .line 2207
    .line 2208
    goto/16 :goto_3a

    .line 2209
    .line 2210
    :cond_53
    move/from16 v3, v52

    .line 2211
    .line 2212
    invoke-virtual {v2, v3}, Lh00;->i(I)I

    .line 2213
    .line 2214
    .line 2215
    move-result v7

    .line 2216
    const/4 v11, 0x0

    .line 2217
    :goto_3b
    if-gt v11, v7, :cond_55

    .line 2218
    .line 2219
    const/16 v12, 0xc

    .line 2220
    .line 2221
    invoke-virtual {v2, v12}, Lh00;->t(I)V

    .line 2222
    .line 2223
    .line 2224
    invoke-virtual {v2, v3}, Lh00;->i(I)I

    .line 2225
    .line 2226
    .line 2227
    move-result v14

    .line 2228
    move/from16 v3, v56

    .line 2229
    .line 2230
    if-le v14, v3, :cond_54

    .line 2231
    .line 2232
    invoke-virtual {v2}, Lh00;->s()V

    .line 2233
    .line 2234
    .line 2235
    :cond_54
    add-int/lit8 v11, v11, 0x1

    .line 2236
    .line 2237
    const/4 v3, 0x5

    .line 2238
    const/16 v56, 0x7

    .line 2239
    .line 2240
    goto :goto_3b

    .line 2241
    :cond_55
    const/4 v3, 0x4

    .line 2242
    const/16 v12, 0xc

    .line 2243
    .line 2244
    invoke-virtual {v2, v3}, Lh00;->i(I)I

    .line 2245
    .line 2246
    .line 2247
    move-result v7

    .line 2248
    invoke-virtual {v2, v3}, Lh00;->i(I)I

    .line 2249
    .line 2250
    .line 2251
    move-result v11

    .line 2252
    const/16 v22, 0x1

    .line 2253
    .line 2254
    add-int/lit8 v7, v7, 0x1

    .line 2255
    .line 2256
    invoke-virtual {v2, v7}, Lh00;->t(I)V

    .line 2257
    .line 2258
    .line 2259
    add-int/lit8 v11, v11, 0x1

    .line 2260
    .line 2261
    invoke-virtual {v2, v11}, Lh00;->t(I)V

    .line 2262
    .line 2263
    .line 2264
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2265
    .line 2266
    .line 2267
    move-result v3

    .line 2268
    if-eqz v3, :cond_56

    .line 2269
    .line 2270
    const/4 v3, 0x7

    .line 2271
    invoke-virtual {v2, v3}, Lh00;->t(I)V

    .line 2272
    .line 2273
    .line 2274
    goto :goto_3c

    .line 2275
    :cond_56
    const/4 v3, 0x7

    .line 2276
    :goto_3c
    invoke-virtual {v2, v3}, Lh00;->t(I)V

    .line 2277
    .line 2278
    .line 2279
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2280
    .line 2281
    .line 2282
    move-result v3

    .line 2283
    if-eqz v3, :cond_57

    .line 2284
    .line 2285
    const/4 v11, 0x2

    .line 2286
    invoke-virtual {v2, v11}, Lh00;->t(I)V

    .line 2287
    .line 2288
    .line 2289
    :cond_57
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2290
    .line 2291
    .line 2292
    move-result v7

    .line 2293
    if-eqz v7, :cond_58

    .line 2294
    .line 2295
    const/4 v7, 0x1

    .line 2296
    const/4 v11, 0x2

    .line 2297
    goto :goto_3d

    .line 2298
    :cond_58
    const/4 v7, 0x1

    .line 2299
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2300
    .line 2301
    .line 2302
    move-result v11

    .line 2303
    :goto_3d
    if-lez v11, :cond_59

    .line 2304
    .line 2305
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2306
    .line 2307
    .line 2308
    move-result v11

    .line 2309
    if-nez v11, :cond_59

    .line 2310
    .line 2311
    invoke-virtual {v2, v7}, Lh00;->t(I)V

    .line 2312
    .line 2313
    .line 2314
    :cond_59
    const/4 v7, 0x3

    .line 2315
    if-eqz v3, :cond_5a

    .line 2316
    .line 2317
    invoke-virtual {v2, v7}, Lh00;->t(I)V

    .line 2318
    .line 2319
    .line 2320
    :cond_5a
    invoke-virtual {v2, v7}, Lh00;->t(I)V

    .line 2321
    .line 2322
    .line 2323
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2324
    .line 2325
    .line 2326
    move-result v3

    .line 2327
    const/4 v11, 0x2

    .line 2328
    if-ne v10, v11, :cond_5b

    .line 2329
    .line 2330
    if-eqz v3, :cond_5b

    .line 2331
    .line 2332
    invoke-virtual {v2}, Lh00;->s()V

    .line 2333
    .line 2334
    .line 2335
    :cond_5b
    const/4 v7, 0x1

    .line 2336
    if-eq v10, v7, :cond_5c

    .line 2337
    .line 2338
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2339
    .line 2340
    .line 2341
    move-result v3

    .line 2342
    if-eqz v3, :cond_5c

    .line 2343
    .line 2344
    const/4 v3, 0x1

    .line 2345
    goto :goto_3e

    .line 2346
    :cond_5c
    const/4 v3, 0x0

    .line 2347
    :goto_3e
    invoke-virtual {v2}, Lh00;->h()Z

    .line 2348
    .line 2349
    .line 2350
    move-result v7

    .line 2351
    if-eqz v7, :cond_5f

    .line 2352
    .line 2353
    const/16 v7, 0x8

    .line 2354
    .line 2355
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2356
    .line 2357
    .line 2358
    move-result v10

    .line 2359
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2360
    .line 2361
    .line 2362
    move-result v11

    .line 2363
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2364
    .line 2365
    .line 2366
    move-result v14

    .line 2367
    const/4 v7, 0x1

    .line 2368
    if-nez v3, :cond_5d

    .line 2369
    .line 2370
    if-ne v10, v7, :cond_5d

    .line 2371
    .line 2372
    if-ne v11, v5, :cond_5d

    .line 2373
    .line 2374
    if-nez v14, :cond_5d

    .line 2375
    .line 2376
    move v2, v7

    .line 2377
    goto :goto_3f

    .line 2378
    :cond_5d
    invoke-virtual {v2, v7}, Lh00;->i(I)I

    .line 2379
    .line 2380
    .line 2381
    move-result v22

    .line 2382
    move/from16 v2, v22

    .line 2383
    .line 2384
    :goto_3f
    invoke-static {v10}, Lc50;->f(I)I

    .line 2385
    .line 2386
    .line 2387
    move-result v58

    .line 2388
    if-ne v2, v7, :cond_5e

    .line 2389
    .line 2390
    const/16 v54, 0x1

    .line 2391
    .line 2392
    goto :goto_40

    .line 2393
    :cond_5e
    const/16 v54, 0x2

    .line 2394
    .line 2395
    :goto_40
    invoke-static {v11}, Lc50;->g(I)I

    .line 2396
    .line 2397
    .line 2398
    move-result v2

    .line 2399
    move/from16 v60, v58

    .line 2400
    .line 2401
    move/from16 v64, v62

    .line 2402
    .line 2403
    move/from16 v62, v2

    .line 2404
    .line 2405
    move/from16 v58, v54

    .line 2406
    .line 2407
    goto :goto_41

    .line 2408
    :cond_5f
    move/from16 v60, v58

    .line 2409
    .line 2410
    move/from16 v64, v62

    .line 2411
    .line 2412
    move/from16 v62, v60

    .line 2413
    .line 2414
    :goto_41
    new-instance v59, Lc50;

    .line 2415
    .line 2416
    move/from16 v65, v63

    .line 2417
    .line 2418
    move-object/from16 v63, v61

    .line 2419
    .line 2420
    move/from16 v61, v58

    .line 2421
    .line 2422
    invoke-direct/range {v59 .. v65}, Lc50;-><init>(III[BII)V

    .line 2423
    .line 2424
    .line 2425
    move-object/from16 v2, v59

    .line 2426
    .line 2427
    :goto_42
    const-string v3, "video/av01"

    .line 2428
    .line 2429
    iget v5, v2, Lc50;->e:I

    .line 2430
    .line 2431
    iget v7, v2, Lc50;->f:I

    .line 2432
    .line 2433
    iget v10, v2, Lc50;->a:I

    .line 2434
    .line 2435
    iget v11, v2, Lc50;->b:I

    .line 2436
    .line 2437
    iget v14, v2, Lc50;->c:I

    .line 2438
    .line 2439
    move-object/from16 v58, v3

    .line 2440
    .line 2441
    move/from16 v50, v4

    .line 2442
    .line 2443
    move/from16 v57, v5

    .line 2444
    .line 2445
    move-object/from16 v51, v6

    .line 2446
    .line 2447
    move-object/from16 v63, v8

    .line 2448
    .line 2449
    move/from16 v16, v12

    .line 2450
    .line 2451
    move-object/from16 v60, v15

    .line 2452
    .line 2453
    const/4 v2, 0x1

    .line 2454
    const/4 v4, -0x1

    .line 2455
    const/4 v5, 0x4

    .line 2456
    const v6, 0x65736473

    .line 2457
    .line 2458
    .line 2459
    const/16 v8, 0x8

    .line 2460
    .line 2461
    const/4 v15, 0x0

    .line 2462
    move v3, v1

    .line 2463
    move v1, v7

    .line 2464
    move v12, v10

    .line 2465
    move v10, v11

    .line 2466
    goto/16 :goto_16

    .line 2467
    .line 2468
    :cond_60
    const/16 v16, 0xc

    .line 2469
    .line 2470
    const v2, 0x636c6c69

    .line 2471
    .line 2472
    .line 2473
    const/16 v50, 0x19

    .line 2474
    .line 2475
    if-ne v11, v2, :cond_62

    .line 2476
    .line 2477
    if-nez v29, :cond_61

    .line 2478
    .line 2479
    invoke-static/range {v50 .. v50}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2480
    .line 2481
    .line 2482
    move-result-object v2

    .line 2483
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2484
    .line 2485
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v2

    .line 2489
    goto :goto_43

    .line 2490
    :cond_61
    move-object/from16 v2, v29

    .line 2491
    .line 2492
    :goto_43
    const/16 v3, 0x15

    .line 2493
    .line 2494
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 2495
    .line 2496
    .line 2497
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2498
    .line 2499
    .line 2500
    move-result v3

    .line 2501
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2502
    .line 2503
    .line 2504
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2505
    .line 2506
    .line 2507
    move-result v3

    .line 2508
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2509
    .line 2510
    .line 2511
    move v3, v1

    .line 2512
    move-object/from16 v29, v2

    .line 2513
    .line 2514
    move/from16 v50, v4

    .line 2515
    .line 2516
    move-object/from16 v51, v6

    .line 2517
    .line 2518
    move-object/from16 v58, v7

    .line 2519
    .line 2520
    move-object/from16 v63, v8

    .line 2521
    .line 2522
    move-object/from16 v60, v15

    .line 2523
    .line 2524
    move/from16 v1, v55

    .line 2525
    .line 2526
    :goto_44
    const/4 v2, 0x1

    .line 2527
    const/4 v4, -0x1

    .line 2528
    const/4 v5, 0x4

    .line 2529
    const v6, 0x65736473

    .line 2530
    .line 2531
    .line 2532
    const/4 v7, 0x0

    .line 2533
    :goto_45
    const/16 v8, 0x8

    .line 2534
    .line 2535
    const/4 v15, 0x0

    .line 2536
    goto/16 :goto_59

    .line 2537
    .line 2538
    :cond_62
    const v2, 0x6d646376

    .line 2539
    .line 2540
    .line 2541
    if-ne v11, v2, :cond_64

    .line 2542
    .line 2543
    if-nez v29, :cond_63

    .line 2544
    .line 2545
    invoke-static/range {v50 .. v50}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v2

    .line 2549
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2550
    .line 2551
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2552
    .line 2553
    .line 2554
    move-result-object v2

    .line 2555
    goto :goto_46

    .line 2556
    :cond_63
    move-object/from16 v2, v29

    .line 2557
    .line 2558
    :goto_46
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2559
    .line 2560
    .line 2561
    move-result v3

    .line 2562
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2563
    .line 2564
    .line 2565
    move-result v5

    .line 2566
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2567
    .line 2568
    .line 2569
    move-result v11

    .line 2570
    move/from16 v50, v4

    .line 2571
    .line 2572
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2573
    .line 2574
    .line 2575
    move-result v4

    .line 2576
    move-object/from16 v51, v6

    .line 2577
    .line 2578
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2579
    .line 2580
    .line 2581
    move-result v6

    .line 2582
    move-object/from16 v58, v7

    .line 2583
    .line 2584
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2585
    .line 2586
    .line 2587
    move-result v7

    .line 2588
    move/from16 v59, v10

    .line 2589
    .line 2590
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2591
    .line 2592
    .line 2593
    move-result v10

    .line 2594
    move-object/from16 v60, v15

    .line 2595
    .line 2596
    invoke-virtual {v0}, Lbe3;->x()S

    .line 2597
    .line 2598
    .line 2599
    move-result v15

    .line 2600
    invoke-virtual {v0}, Lbe3;->C()J

    .line 2601
    .line 2602
    .line 2603
    move-result-wide v52

    .line 2604
    invoke-virtual {v0}, Lbe3;->C()J

    .line 2605
    .line 2606
    .line 2607
    move-result-wide v61

    .line 2608
    move-object/from16 v63, v8

    .line 2609
    .line 2610
    const/4 v8, 0x1

    .line 2611
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 2612
    .line 2613
    .line 2614
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2615
    .line 2616
    .line 2617
    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2618
    .line 2619
    .line 2620
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2621
    .line 2622
    .line 2623
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2624
    .line 2625
    .line 2626
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2627
    .line 2628
    .line 2629
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2630
    .line 2631
    .line 2632
    invoke-virtual {v2, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2633
    .line 2634
    .line 2635
    invoke-virtual {v2, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2636
    .line 2637
    .line 2638
    const-wide/16 v3, 0x2710

    .line 2639
    .line 2640
    div-long v5, v52, v3

    .line 2641
    .line 2642
    long-to-int v5, v5

    .line 2643
    int-to-short v5, v5

    .line 2644
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2645
    .line 2646
    .line 2647
    div-long v3, v61, v3

    .line 2648
    .line 2649
    long-to-int v3, v3

    .line 2650
    int-to-short v3, v3

    .line 2651
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2652
    .line 2653
    .line 2654
    move v3, v1

    .line 2655
    move-object/from16 v29, v2

    .line 2656
    .line 2657
    move/from16 v1, v55

    .line 2658
    .line 2659
    move/from16 v10, v59

    .line 2660
    .line 2661
    goto/16 :goto_44

    .line 2662
    .line 2663
    :cond_64
    move/from16 v50, v4

    .line 2664
    .line 2665
    move-object/from16 v51, v6

    .line 2666
    .line 2667
    move-object/from16 v58, v7

    .line 2668
    .line 2669
    move-object/from16 v63, v8

    .line 2670
    .line 2671
    move/from16 v59, v10

    .line 2672
    .line 2673
    move-object/from16 v60, v15

    .line 2674
    .line 2675
    const v2, 0x64323633

    .line 2676
    .line 2677
    .line 2678
    if-ne v11, v2, :cond_66

    .line 2679
    .line 2680
    if-nez v58, :cond_65

    .line 2681
    .line 2682
    const/4 v2, 0x1

    .line 2683
    :goto_47
    const/4 v7, 0x0

    .line 2684
    goto :goto_48

    .line 2685
    :cond_65
    const/4 v2, 0x0

    .line 2686
    goto :goto_47

    .line 2687
    :goto_48
    invoke-static {v7, v2}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 2688
    .line 2689
    .line 2690
    move v3, v1

    .line 2691
    move-object/from16 v58, v26

    .line 2692
    .line 2693
    move/from16 v1, v55

    .line 2694
    .line 2695
    move/from16 v10, v59

    .line 2696
    .line 2697
    const/4 v2, 0x1

    .line 2698
    const/4 v4, -0x1

    .line 2699
    const/4 v5, 0x4

    .line 2700
    const v6, 0x65736473

    .line 2701
    .line 2702
    .line 2703
    goto/16 :goto_45

    .line 2704
    .line 2705
    :cond_66
    const v6, 0x65736473

    .line 2706
    .line 2707
    .line 2708
    const/4 v7, 0x0

    .line 2709
    if-ne v11, v6, :cond_69

    .line 2710
    .line 2711
    if-nez v58, :cond_67

    .line 2712
    .line 2713
    const/4 v2, 0x1

    .line 2714
    goto :goto_49

    .line 2715
    :cond_67
    const/4 v2, 0x0

    .line 2716
    :goto_49
    invoke-static {v7, v2}, Lwr1;->i(Ljava/lang/String;Z)V

    .line 2717
    .line 2718
    .line 2719
    move/from16 v2, v48

    .line 2720
    .line 2721
    invoke-static {v2, v0}, Lwu;->c(ILbe3;)Lru;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v2

    .line 2725
    iget-object v3, v2, Lru;->p:Ljava/lang/Object;

    .line 2726
    .line 2727
    check-cast v3, Ljava/lang/String;

    .line 2728
    .line 2729
    iget-object v4, v2, Lru;->q:Ljava/lang/Object;

    .line 2730
    .line 2731
    check-cast v4, [B

    .line 2732
    .line 2733
    if-eqz v4, :cond_68

    .line 2734
    .line 2735
    invoke-static {v4}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v13

    .line 2739
    :cond_68
    move-object/from16 v46, v2

    .line 2740
    .line 2741
    move-object/from16 v58, v3

    .line 2742
    .line 2743
    move/from16 v10, v59

    .line 2744
    .line 2745
    const/4 v2, 0x1

    .line 2746
    const/4 v4, -0x1

    .line 2747
    const/4 v5, 0x4

    .line 2748
    const/16 v8, 0x8

    .line 2749
    .line 2750
    const/4 v15, 0x0

    .line 2751
    :goto_4a
    move v3, v1

    .line 2752
    move/from16 v1, v55

    .line 2753
    .line 2754
    goto/16 :goto_59

    .line 2755
    .line 2756
    :cond_69
    move/from16 v2, v48

    .line 2757
    .line 2758
    const v4, 0x62747274

    .line 2759
    .line 2760
    .line 2761
    if-ne v11, v4, :cond_6a

    .line 2762
    .line 2763
    add-int/lit8 v11, v2, 0x8

    .line 2764
    .line 2765
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 2766
    .line 2767
    .line 2768
    const/4 v3, 0x4

    .line 2769
    invoke-virtual {v0, v3}, Lbe3;->O(I)V

    .line 2770
    .line 2771
    .line 2772
    invoke-virtual {v0}, Lbe3;->C()J

    .line 2773
    .line 2774
    .line 2775
    move-result-wide v2

    .line 2776
    invoke-virtual {v0}, Lbe3;->C()J

    .line 2777
    .line 2778
    .line 2779
    move-result-wide v4

    .line 2780
    new-instance v8, Lpu;

    .line 2781
    .line 2782
    invoke-direct {v8, v4, v5, v2, v3}, Lpu;-><init>(JJ)V

    .line 2783
    .line 2784
    .line 2785
    move v3, v1

    .line 2786
    move-object/from16 v45, v8

    .line 2787
    .line 2788
    :goto_4b
    move/from16 v1, v55

    .line 2789
    .line 2790
    move/from16 v10, v59

    .line 2791
    .line 2792
    const/4 v2, 0x1

    .line 2793
    const/4 v4, -0x1

    .line 2794
    const/4 v5, 0x4

    .line 2795
    goto/16 :goto_45

    .line 2796
    .line 2797
    :cond_6a
    const v4, 0x70617370

    .line 2798
    .line 2799
    .line 2800
    if-ne v11, v4, :cond_6b

    .line 2801
    .line 2802
    add-int/lit8 v11, v2, 0x8

    .line 2803
    .line 2804
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 2805
    .line 2806
    .line 2807
    invoke-virtual {v0}, Lbe3;->E()I

    .line 2808
    .line 2809
    .line 2810
    move-result v2

    .line 2811
    invoke-virtual {v0}, Lbe3;->E()I

    .line 2812
    .line 2813
    .line 2814
    move-result v3

    .line 2815
    int-to-float v2, v2

    .line 2816
    int-to-float v3, v3

    .line 2817
    div-float/2addr v2, v3

    .line 2818
    move v3, v1

    .line 2819
    move/from16 v39, v2

    .line 2820
    .line 2821
    move/from16 v1, v55

    .line 2822
    .line 2823
    move/from16 v10, v59

    .line 2824
    .line 2825
    const/4 v2, 0x1

    .line 2826
    const/4 v4, -0x1

    .line 2827
    const/4 v5, 0x4

    .line 2828
    const/16 v8, 0x8

    .line 2829
    .line 2830
    const/4 v15, 0x0

    .line 2831
    const/16 v33, 0x1

    .line 2832
    .line 2833
    goto/16 :goto_59

    .line 2834
    .line 2835
    :cond_6b
    const v4, 0x73763364

    .line 2836
    .line 2837
    .line 2838
    if-ne v11, v4, :cond_6e

    .line 2839
    .line 2840
    add-int/lit8 v11, v2, 0x8

    .line 2841
    .line 2842
    :goto_4c
    sub-int v3, v11, v2

    .line 2843
    .line 2844
    if-ge v3, v9, :cond_6d

    .line 2845
    .line 2846
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 2847
    .line 2848
    .line 2849
    invoke-virtual {v0}, Lbe3;->m()I

    .line 2850
    .line 2851
    .line 2852
    move-result v3

    .line 2853
    invoke-virtual {v0}, Lbe3;->m()I

    .line 2854
    .line 2855
    .line 2856
    move-result v4

    .line 2857
    const v5, 0x70726f6a

    .line 2858
    .line 2859
    .line 2860
    if-ne v4, v5, :cond_6c

    .line 2861
    .line 2862
    iget-object v2, v0, Lbe3;->a:[B

    .line 2863
    .line 2864
    add-int/2addr v3, v11

    .line 2865
    invoke-static {v2, v11, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 2866
    .line 2867
    .line 2868
    move-result-object v2

    .line 2869
    goto :goto_4d

    .line 2870
    :cond_6c
    add-int/2addr v11, v3

    .line 2871
    goto :goto_4c

    .line 2872
    :cond_6d
    move-object v2, v7

    .line 2873
    :goto_4d
    move v3, v1

    .line 2874
    move-object/from16 v37, v2

    .line 2875
    .line 2876
    goto :goto_4b

    .line 2877
    :cond_6e
    const v4, 0x73743364

    .line 2878
    .line 2879
    .line 2880
    if-ne v11, v4, :cond_74

    .line 2881
    .line 2882
    invoke-virtual {v0}, Lbe3;->A()I

    .line 2883
    .line 2884
    .line 2885
    move-result v2

    .line 2886
    const/4 v4, 0x3

    .line 2887
    invoke-virtual {v0, v4}, Lbe3;->O(I)V

    .line 2888
    .line 2889
    .line 2890
    if-nez v2, :cond_73

    .line 2891
    .line 2892
    invoke-virtual {v0}, Lbe3;->A()I

    .line 2893
    .line 2894
    .line 2895
    move-result v2

    .line 2896
    if-eqz v2, :cond_72

    .line 2897
    .line 2898
    const/4 v3, 0x1

    .line 2899
    if-eq v2, v3, :cond_71

    .line 2900
    .line 2901
    const/4 v11, 0x2

    .line 2902
    if-eq v2, v11, :cond_70

    .line 2903
    .line 2904
    if-eq v2, v4, :cond_6f

    .line 2905
    .line 2906
    goto :goto_4e

    .line 2907
    :cond_6f
    move v1, v4

    .line 2908
    goto :goto_4e

    .line 2909
    :cond_70
    const/4 v1, 0x2

    .line 2910
    goto :goto_4e

    .line 2911
    :cond_71
    const/4 v1, 0x1

    .line 2912
    goto :goto_4e

    .line 2913
    :cond_72
    const/4 v1, 0x0

    .line 2914
    :cond_73
    :goto_4e
    move v3, v1

    .line 2915
    goto :goto_4b

    .line 2916
    :cond_74
    const/4 v4, 0x3

    .line 2917
    const v8, 0x61707643

    .line 2918
    .line 2919
    .line 2920
    if-ne v11, v8, :cond_7b

    .line 2921
    .line 2922
    add-int/lit8 v3, v9, -0xc

    .line 2923
    .line 2924
    new-array v8, v3, [B

    .line 2925
    .line 2926
    add-int/lit8 v11, v2, 0xc

    .line 2927
    .line 2928
    invoke-virtual {v0, v11}, Lbe3;->N(I)V

    .line 2929
    .line 2930
    .line 2931
    const/4 v15, 0x0

    .line 2932
    invoke-virtual {v0, v8, v15, v3}, Lbe3;->k([BII)V

    .line 2933
    .line 2934
    .line 2935
    sget-object v2, Li40;->a:[B

    .line 2936
    .line 2937
    const/16 v2, 0x11

    .line 2938
    .line 2939
    if-lt v3, v2, :cond_75

    .line 2940
    .line 2941
    const/4 v2, 0x1

    .line 2942
    goto :goto_4f

    .line 2943
    :cond_75
    move v2, v15

    .line 2944
    :goto_4f
    const-string v10, "Invalid APV CSD length: %s"

    .line 2945
    .line 2946
    invoke-static {v3, v10, v2}, Lrr2;->j(ILjava/lang/String;Z)V

    .line 2947
    .line 2948
    .line 2949
    aget-byte v2, v8, v15

    .line 2950
    .line 2951
    const/4 v10, 0x1

    .line 2952
    if-ne v2, v10, :cond_76

    .line 2953
    .line 2954
    const/4 v10, 0x1

    .line 2955
    goto :goto_50

    .line 2956
    :cond_76
    move v10, v15

    .line 2957
    :goto_50
    const-string v11, "Invalid APV CSD version: %s"

    .line 2958
    .line 2959
    invoke-static {v2, v11, v10}, Lrr2;->j(ILjava/lang/String;Z)V

    .line 2960
    .line 2961
    .line 2962
    const/16 v52, 0x5

    .line 2963
    .line 2964
    aget-byte v2, v8, v52

    .line 2965
    .line 2966
    aget-byte v10, v8, v5

    .line 2967
    .line 2968
    const/16 v56, 0x7

    .line 2969
    .line 2970
    aget-byte v11, v8, v56

    .line 2971
    .line 2972
    sget-object v12, Lf35;->a:Ljava/lang/String;

    .line 2973
    .line 2974
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2975
    .line 2976
    const-string v12, ".apvl"

    .line 2977
    .line 2978
    const-string v13, ".apvb"

    .line 2979
    .line 2980
    const-string v14, "apv1.apvf"

    .line 2981
    .line 2982
    invoke-static {v14, v12, v2, v10, v13}, Lb11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v2

    .line 2986
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2987
    .line 2988
    .line 2989
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2990
    .line 2991
    .line 2992
    move-result-object v32

    .line 2993
    invoke-static {v8}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 2994
    .line 2995
    .line 2996
    move-result-object v13

    .line 2997
    new-instance v2, Lbe3;

    .line 2998
    .line 2999
    invoke-direct {v2, v8}, Lbe3;-><init>([B)V

    .line 3000
    .line 3001
    .line 3002
    new-instance v10, Lh00;

    .line 3003
    .line 3004
    invoke-direct {v10, v3, v8}, Lh00;-><init>(I[B)V

    .line 3005
    .line 3006
    .line 3007
    iget v2, v2, Lbe3;->b:I

    .line 3008
    .line 3009
    const/16 v8, 0x8

    .line 3010
    .line 3011
    mul-int/2addr v2, v8

    .line 3012
    invoke-virtual {v10, v2}, Lh00;->q(I)V

    .line 3013
    .line 3014
    .line 3015
    const/4 v2, 0x1

    .line 3016
    invoke-virtual {v10, v2}, Lh00;->u(I)V

    .line 3017
    .line 3018
    .line 3019
    invoke-virtual {v10, v8}, Lh00;->i(I)I

    .line 3020
    .line 3021
    .line 3022
    move-result v3

    .line 3023
    move v14, v15

    .line 3024
    const/4 v11, -0x1

    .line 3025
    const/4 v12, -0x1

    .line 3026
    const/16 v17, -0x1

    .line 3027
    .line 3028
    const/16 v18, -0x1

    .line 3029
    .line 3030
    const/16 v19, -0x1

    .line 3031
    .line 3032
    :goto_51
    if-ge v14, v3, :cond_7a

    .line 3033
    .line 3034
    invoke-virtual {v10, v2}, Lh00;->u(I)V

    .line 3035
    .line 3036
    .line 3037
    invoke-virtual {v10, v8}, Lh00;->i(I)I

    .line 3038
    .line 3039
    .line 3040
    move-result v4

    .line 3041
    move/from16 v22, v19

    .line 3042
    .line 3043
    move/from16 v19, v18

    .line 3044
    .line 3045
    move/from16 v18, v17

    .line 3046
    .line 3047
    move/from16 v17, v12

    .line 3048
    .line 3049
    move v12, v11

    .line 3050
    move v11, v15

    .line 3051
    :goto_52
    if-ge v11, v4, :cond_79

    .line 3052
    .line 3053
    invoke-virtual {v10, v5}, Lh00;->t(I)V

    .line 3054
    .line 3055
    .line 3056
    invoke-virtual {v10}, Lh00;->h()Z

    .line 3057
    .line 3058
    .line 3059
    move-result v12

    .line 3060
    invoke-virtual {v10}, Lh00;->s()V

    .line 3061
    .line 3062
    .line 3063
    const/16 v5, 0xb

    .line 3064
    .line 3065
    invoke-virtual {v10, v5}, Lh00;->u(I)V

    .line 3066
    .line 3067
    .line 3068
    const/4 v5, 0x4

    .line 3069
    invoke-virtual {v10, v5}, Lh00;->t(I)V

    .line 3070
    .line 3071
    .line 3072
    invoke-virtual {v10, v5}, Lh00;->i(I)I

    .line 3073
    .line 3074
    .line 3075
    move-result v17

    .line 3076
    add-int/lit8 v17, v17, 0x8

    .line 3077
    .line 3078
    invoke-virtual {v10, v2}, Lh00;->u(I)V

    .line 3079
    .line 3080
    .line 3081
    if-eqz v12, :cond_78

    .line 3082
    .line 3083
    invoke-virtual {v10, v8}, Lh00;->i(I)I

    .line 3084
    .line 3085
    .line 3086
    move-result v12

    .line 3087
    invoke-virtual {v10, v8}, Lh00;->i(I)I

    .line 3088
    .line 3089
    .line 3090
    move-result v18

    .line 3091
    invoke-virtual {v10, v2}, Lh00;->u(I)V

    .line 3092
    .line 3093
    .line 3094
    invoke-virtual {v10}, Lh00;->h()Z

    .line 3095
    .line 3096
    .line 3097
    move-result v19

    .line 3098
    invoke-static {v12}, Lc50;->f(I)I

    .line 3099
    .line 3100
    .line 3101
    move-result v12

    .line 3102
    if-eqz v19, :cond_77

    .line 3103
    .line 3104
    move/from16 v19, v2

    .line 3105
    .line 3106
    goto :goto_53

    .line 3107
    :cond_77
    const/16 v19, 0x2

    .line 3108
    .line 3109
    :goto_53
    invoke-static/range {v18 .. v18}, Lc50;->g(I)I

    .line 3110
    .line 3111
    .line 3112
    move-result v18

    .line 3113
    move/from16 v22, v18

    .line 3114
    .line 3115
    move/from16 v18, v19

    .line 3116
    .line 3117
    move/from16 v19, v12

    .line 3118
    .line 3119
    :cond_78
    add-int/lit8 v11, v11, 0x1

    .line 3120
    .line 3121
    move/from16 v12, v17

    .line 3122
    .line 3123
    const/4 v5, 0x6

    .line 3124
    goto :goto_52

    .line 3125
    :cond_79
    const/4 v5, 0x4

    .line 3126
    add-int/lit8 v14, v14, 0x1

    .line 3127
    .line 3128
    move v11, v12

    .line 3129
    move/from16 v12, v17

    .line 3130
    .line 3131
    move/from16 v17, v18

    .line 3132
    .line 3133
    move/from16 v18, v19

    .line 3134
    .line 3135
    move/from16 v19, v22

    .line 3136
    .line 3137
    const/4 v4, 0x3

    .line 3138
    const/4 v5, 0x6

    .line 3139
    goto :goto_51

    .line 3140
    :cond_7a
    const/4 v5, 0x4

    .line 3141
    new-instance v3, Lc50;

    .line 3142
    .line 3143
    const-string v3, "video/apv"

    .line 3144
    .line 3145
    move-object/from16 v58, v3

    .line 3146
    .line 3147
    move/from16 v57, v12

    .line 3148
    .line 3149
    move/from16 v10, v17

    .line 3150
    .line 3151
    move/from16 v12, v18

    .line 3152
    .line 3153
    move/from16 v14, v19

    .line 3154
    .line 3155
    const/4 v4, -0x1

    .line 3156
    move v3, v1

    .line 3157
    move v1, v11

    .line 3158
    goto/16 :goto_59

    .line 3159
    .line 3160
    :cond_7b
    const/4 v2, 0x1

    .line 3161
    const/4 v5, 0x4

    .line 3162
    const/16 v8, 0x8

    .line 3163
    .line 3164
    const/4 v15, 0x0

    .line 3165
    const v4, 0x636f6c72

    .line 3166
    .line 3167
    .line 3168
    if-ne v11, v4, :cond_80

    .line 3169
    .line 3170
    const/4 v4, -0x1

    .line 3171
    if-ne v12, v4, :cond_81

    .line 3172
    .line 3173
    if-ne v14, v4, :cond_81

    .line 3174
    .line 3175
    invoke-virtual {v0}, Lbe3;->m()I

    .line 3176
    .line 3177
    .line 3178
    move-result v10

    .line 3179
    const v11, 0x6e636c78

    .line 3180
    .line 3181
    .line 3182
    if-eq v10, v11, :cond_7d

    .line 3183
    .line 3184
    const v11, 0x6e636c63

    .line 3185
    .line 3186
    .line 3187
    if-ne v10, v11, :cond_7c

    .line 3188
    .line 3189
    goto :goto_54

    .line 3190
    :cond_7c
    invoke-static {v10}, Luv;->c(I)Ljava/lang/String;

    .line 3191
    .line 3192
    .line 3193
    move-result-object v10

    .line 3194
    const-string v11, "Unsupported color type: "

    .line 3195
    .line 3196
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3197
    .line 3198
    .line 3199
    move-result-object v10

    .line 3200
    invoke-static {v3, v10}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 3201
    .line 3202
    .line 3203
    goto :goto_56

    .line 3204
    :cond_7d
    :goto_54
    invoke-virtual {v0}, Lbe3;->H()I

    .line 3205
    .line 3206
    .line 3207
    move-result v3

    .line 3208
    invoke-virtual {v0}, Lbe3;->H()I

    .line 3209
    .line 3210
    .line 3211
    move-result v10

    .line 3212
    const/4 v11, 0x2

    .line 3213
    invoke-virtual {v0, v11}, Lbe3;->O(I)V

    .line 3214
    .line 3215
    .line 3216
    const/16 v12, 0x13

    .line 3217
    .line 3218
    if-ne v9, v12, :cond_7e

    .line 3219
    .line 3220
    invoke-virtual {v0}, Lbe3;->A()I

    .line 3221
    .line 3222
    .line 3223
    move-result v12

    .line 3224
    and-int/lit16 v12, v12, 0x80

    .line 3225
    .line 3226
    if-eqz v12, :cond_7e

    .line 3227
    .line 3228
    move v12, v2

    .line 3229
    goto :goto_55

    .line 3230
    :cond_7e
    move v12, v15

    .line 3231
    :goto_55
    invoke-static {v3}, Lc50;->f(I)I

    .line 3232
    .line 3233
    .line 3234
    move-result v3

    .line 3235
    if-eqz v12, :cond_7f

    .line 3236
    .line 3237
    move v11, v2

    .line 3238
    :cond_7f
    invoke-static {v10}, Lc50;->g(I)I

    .line 3239
    .line 3240
    .line 3241
    move-result v14

    .line 3242
    move v12, v3

    .line 3243
    move v10, v11

    .line 3244
    goto/16 :goto_4a

    .line 3245
    .line 3246
    :cond_80
    const/4 v4, -0x1

    .line 3247
    :cond_81
    :goto_56
    move v3, v1

    .line 3248
    :goto_57
    move/from16 v1, v55

    .line 3249
    .line 3250
    move/from16 v10, v59

    .line 3251
    .line 3252
    goto :goto_59

    .line 3253
    :goto_58
    invoke-static {v0}, Lzh0;->E(Lbe3;)Lzh0;

    .line 3254
    .line 3255
    .line 3256
    move-result-object v11

    .line 3257
    move v3, v1

    .line 3258
    move-object/from16 v44, v11

    .line 3259
    .line 3260
    goto :goto_57

    .line 3261
    :goto_59
    add-int v9, v47, v9

    .line 3262
    .line 3263
    move v5, v3

    .line 3264
    move-object/from16 v19, v7

    .line 3265
    .line 3266
    move/from16 v18, v8

    .line 3267
    .line 3268
    move/from16 v3, v49

    .line 3269
    .line 3270
    move/from16 v4, v50

    .line 3271
    .line 3272
    move-object/from16 v6, v51

    .line 3273
    .line 3274
    move/from16 v2, v57

    .line 3275
    .line 3276
    move-object/from16 v7, v58

    .line 3277
    .line 3278
    move-object/from16 v15, v60

    .line 3279
    .line 3280
    move-object/from16 v8, v63

    .line 3281
    .line 3282
    const/16 v17, 0x3

    .line 3283
    .line 3284
    goto/16 :goto_11

    .line 3285
    .line 3286
    :goto_5a
    if-eqz v44, :cond_82

    .line 3287
    .line 3288
    move-object/from16 v2, v44

    .line 3289
    .line 3290
    iget-object v2, v2, Lzh0;->o:Ljava/lang/Object;

    .line 3291
    .line 3292
    move-object/from16 v32, v2

    .line 3293
    .line 3294
    check-cast v32, Ljava/lang/String;

    .line 3295
    .line 3296
    const-string v2, "video/dolby-vision"

    .line 3297
    .line 3298
    :goto_5b
    move-object/from16 v3, v32

    .line 3299
    .line 3300
    goto :goto_5c

    .line 3301
    :cond_82
    move-object/from16 v2, v58

    .line 3302
    .line 3303
    goto :goto_5b

    .line 3304
    :goto_5c
    if-nez v2, :cond_83

    .line 3305
    .line 3306
    move-object/from16 v5, p2

    .line 3307
    .line 3308
    move-object/from16 v8, v63

    .line 3309
    .line 3310
    goto/16 :goto_5f

    .line 3311
    .line 3312
    :cond_83
    new-instance v4, Lsb1;

    .line 3313
    .line 3314
    invoke-direct {v4}, Lsb1;-><init>()V

    .line 3315
    .line 3316
    .line 3317
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 3318
    .line 3319
    .line 3320
    move-result-object v5

    .line 3321
    iput-object v5, v4, Lsb1;->a:Ljava/lang/String;

    .line 3322
    .line 3323
    invoke-static {v2}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 3324
    .line 3325
    .line 3326
    move-result-object v2

    .line 3327
    iput-object v2, v4, Lsb1;->m:Ljava/lang/String;

    .line 3328
    .line 3329
    iput-object v3, v4, Lsb1;->j:Ljava/lang/String;

    .line 3330
    .line 3331
    move/from16 v2, v43

    .line 3332
    .line 3333
    iput v2, v4, Lsb1;->t:I

    .line 3334
    .line 3335
    move/from16 v2, v42

    .line 3336
    .line 3337
    iput v2, v4, Lsb1;->u:I

    .line 3338
    .line 3339
    move/from16 v2, v41

    .line 3340
    .line 3341
    iput v2, v4, Lsb1;->v:I

    .line 3342
    .line 3343
    move/from16 v2, v40

    .line 3344
    .line 3345
    iput v2, v4, Lsb1;->w:I

    .line 3346
    .line 3347
    move/from16 v2, v39

    .line 3348
    .line 3349
    iput v2, v4, Lsb1;->z:F

    .line 3350
    .line 3351
    move/from16 v2, v38

    .line 3352
    .line 3353
    iput v2, v4, Lsb1;->y:I

    .line 3354
    .line 3355
    move-object/from16 v2, v37

    .line 3356
    .line 3357
    iput-object v2, v4, Lsb1;->A:[B

    .line 3358
    .line 3359
    iput v1, v4, Lsb1;->B:I

    .line 3360
    .line 3361
    iput-object v13, v4, Lsb1;->p:Ljava/util/List;

    .line 3362
    .line 3363
    move/from16 v1, v36

    .line 3364
    .line 3365
    iput v1, v4, Lsb1;->o:I

    .line 3366
    .line 3367
    move/from16 v1, v35

    .line 3368
    .line 3369
    iput v1, v4, Lsb1;->D:I

    .line 3370
    .line 3371
    move-object/from16 v1, v34

    .line 3372
    .line 3373
    iput-object v1, v4, Lsb1;->q:Low0;

    .line 3374
    .line 3375
    move-object/from16 v5, p2

    .line 3376
    .line 3377
    iput-object v5, v4, Lsb1;->d:Ljava/lang/String;

    .line 3378
    .line 3379
    if-eqz v29, :cond_84

    .line 3380
    .line 3381
    invoke-virtual/range {v29 .. v29}, Ljava/nio/ByteBuffer;->array()[B

    .line 3382
    .line 3383
    .line 3384
    move-result-object v1

    .line 3385
    move-object/from16 v42, v1

    .line 3386
    .line 3387
    goto :goto_5d

    .line 3388
    :cond_84
    move-object/from16 v42, v7

    .line 3389
    .line 3390
    :goto_5d
    new-instance v38, Lc50;

    .line 3391
    .line 3392
    move/from16 v39, v12

    .line 3393
    .line 3394
    move/from16 v41, v14

    .line 3395
    .line 3396
    move/from16 v44, v55

    .line 3397
    .line 3398
    move/from16 v43, v57

    .line 3399
    .line 3400
    move/from16 v40, v59

    .line 3401
    .line 3402
    invoke-direct/range {v38 .. v44}, Lc50;-><init>(III[BII)V

    .line 3403
    .line 3404
    .line 3405
    move-object/from16 v1, v38

    .line 3406
    .line 3407
    iput-object v1, v4, Lsb1;->C:Lc50;

    .line 3408
    .line 3409
    move-object/from16 v1, v45

    .line 3410
    .line 3411
    if-eqz v1, :cond_85

    .line 3412
    .line 3413
    iget-wide v2, v1, Lpu;->a:J

    .line 3414
    .line 3415
    invoke-static {v2, v3}, Ljz4;->I(J)I

    .line 3416
    .line 3417
    .line 3418
    move-result v2

    .line 3419
    iput v2, v4, Lsb1;->h:I

    .line 3420
    .line 3421
    iget-wide v1, v1, Lpu;->b:J

    .line 3422
    .line 3423
    invoke-static {v1, v2}, Ljz4;->I(J)I

    .line 3424
    .line 3425
    .line 3426
    move-result v1

    .line 3427
    iput v1, v4, Lsb1;->i:I

    .line 3428
    .line 3429
    goto :goto_5e

    .line 3430
    :cond_85
    move-object/from16 v1, v46

    .line 3431
    .line 3432
    if-eqz v1, :cond_86

    .line 3433
    .line 3434
    iget-wide v2, v1, Lru;->n:J

    .line 3435
    .line 3436
    invoke-static {v2, v3}, Ljz4;->I(J)I

    .line 3437
    .line 3438
    .line 3439
    move-result v2

    .line 3440
    iput v2, v4, Lsb1;->h:I

    .line 3441
    .line 3442
    iget-wide v1, v1, Lru;->o:J

    .line 3443
    .line 3444
    invoke-static {v1, v2}, Ljz4;->I(J)I

    .line 3445
    .line 3446
    .line 3447
    move-result v1

    .line 3448
    iput v1, v4, Lsb1;->i:I

    .line 3449
    .line 3450
    :cond_86
    :goto_5e
    new-instance v1, Ltb1;

    .line 3451
    .line 3452
    invoke-direct {v1, v4}, Ltb1;-><init>(Lsb1;)V

    .line 3453
    .line 3454
    .line 3455
    move-object/from16 v8, v63

    .line 3456
    .line 3457
    iput-object v1, v8, Ltu;->d:Ljava/lang/Object;

    .line 3458
    .line 3459
    :goto_5f
    add-int v2, v27, v49

    .line 3460
    .line 3461
    invoke-virtual {v0, v2}, Lbe3;->N(I)V

    .line 3462
    .line 3463
    .line 3464
    add-int/lit8 v9, v28, 0x1

    .line 3465
    .line 3466
    move-object/from16 v10, p1

    .line 3467
    .line 3468
    move v14, v15

    .line 3469
    move/from16 v12, v16

    .line 3470
    .line 3471
    move/from16 v11, v30

    .line 3472
    .line 3473
    move/from16 v13, v31

    .line 3474
    .line 3475
    goto/16 :goto_0

    .line 3476
    .line 3477
    :cond_87
    return-object v8
.end method

.method public static j(Loy2;Lzg1;JLow0;ZZLeg1;Z)Ljava/util/ArrayList;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Loy2;->r:Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    if-ge v5, v6, :cond_7a

    .line 16
    .line 17
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    check-cast v6, Loy2;

    .line 22
    .line 23
    iget v7, v6, Luv;->o:I

    .line 24
    .line 25
    const v8, 0x7472616b

    .line 26
    .line 27
    .line 28
    if-eq v7, v8, :cond_0

    .line 29
    .line 30
    move-object/from16 v45, v2

    .line 31
    .line 32
    move-object v1, v3

    .line 33
    move/from16 v37, v5

    .line 34
    .line 35
    const/16 v16, 0x0

    .line 36
    .line 37
    goto/16 :goto_59

    .line 38
    .line 39
    :cond_0
    const v7, 0x6d766864

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v7}, Loy2;->s(I)Lpy2;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const v8, 0x6d646961

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v8}, Loy2;->r(I)Loy2;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const v10, 0x68646c72    # 4.3148E24f

    .line 60
    .line 61
    .line 62
    invoke-virtual {v9, v10}, Loy2;->s(I)Lpy2;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v10, v10, Lpy2;->p:Lbe3;

    .line 70
    .line 71
    const/16 v11, 0x10

    .line 72
    .line 73
    invoke-virtual {v10, v11}, Lbe3;->N(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10}, Lbe3;->m()I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const v12, 0x736f756e

    .line 81
    .line 82
    .line 83
    const/4 v14, -0x1

    .line 84
    const/16 v16, 0x0

    .line 85
    .line 86
    if-ne v10, v12, :cond_1

    .line 87
    .line 88
    const/4 v10, 0x1

    .line 89
    goto :goto_2

    .line 90
    :cond_1
    const v12, 0x76696465

    .line 91
    .line 92
    .line 93
    if-ne v10, v12, :cond_2

    .line 94
    .line 95
    const/4 v10, 0x2

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    const v12, 0x74657874

    .line 98
    .line 99
    .line 100
    if-eq v10, v12, :cond_5

    .line 101
    .line 102
    const v12, 0x7362746c

    .line 103
    .line 104
    .line 105
    if-eq v10, v12, :cond_5

    .line 106
    .line 107
    const v12, 0x73756274

    .line 108
    .line 109
    .line 110
    if-eq v10, v12, :cond_5

    .line 111
    .line 112
    const v12, 0x636c6370

    .line 113
    .line 114
    .line 115
    if-eq v10, v12, :cond_5

    .line 116
    .line 117
    const v12, 0x73756270

    .line 118
    .line 119
    .line 120
    if-ne v10, v12, :cond_3

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const v12, 0x6d657461

    .line 124
    .line 125
    .line 126
    if-ne v10, v12, :cond_4

    .line 127
    .line 128
    const/4 v10, 0x5

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    move v10, v14

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    :goto_1
    const/4 v10, 0x3

    .line 133
    :goto_2
    const-string v12, "BoxParsers"

    .line 134
    .line 135
    const/16 v35, 0x1

    .line 136
    .line 137
    const/16 v36, 0x0

    .line 138
    .line 139
    const/4 v13, 0x4

    .line 140
    move/from16 v37, v5

    .line 141
    .line 142
    if-ne v10, v14, :cond_6

    .line 143
    .line 144
    move-object/from16 v45, v2

    .line 145
    .line 146
    move-object/from16 v0, v36

    .line 147
    .line 148
    const-wide/16 v39, 0x0

    .line 149
    .line 150
    move-object/from16 v2, p7

    .line 151
    .line 152
    goto/16 :goto_20

    .line 153
    .line 154
    :cond_6
    const-wide/16 v39, 0x0

    .line 155
    .line 156
    const v4, 0x746b6864

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, v4}, Loy2;->s(I)Lpy2;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v4, v4, Lpy2;->p:Lbe3;

    .line 167
    .line 168
    const/16 v5, 0x8

    .line 169
    .line 170
    invoke-virtual {v4, v5}, Lbe3;->N(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Lbe3;->m()I

    .line 174
    .line 175
    .line 176
    move-result v18

    .line 177
    invoke-static/range {v18 .. v18}, Lwu;->e(I)I

    .line 178
    .line 179
    .line 180
    move-result v18

    .line 181
    if-nez v18, :cond_7

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    move v5, v11

    .line 185
    :goto_3
    invoke-virtual {v4, v5}, Lbe3;->O(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Lbe3;->m()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-virtual {v4, v13}, Lbe3;->O(I)V

    .line 193
    .line 194
    .line 195
    iget v8, v4, Lbe3;->b:I

    .line 196
    .line 197
    if-nez v18, :cond_8

    .line 198
    .line 199
    move v15, v13

    .line 200
    goto :goto_4

    .line 201
    :cond_8
    const/16 v15, 0x8

    .line 202
    .line 203
    :goto_4
    move/from16 v11, v16

    .line 204
    .line 205
    :goto_5
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    if-ge v11, v15, :cond_b

    .line 211
    .line 212
    iget-object v13, v4, Lbe3;->a:[B

    .line 213
    .line 214
    add-int v23, v8, v11

    .line 215
    .line 216
    aget-byte v13, v13, v23

    .line 217
    .line 218
    if-eq v13, v14, :cond_a

    .line 219
    .line 220
    if-nez v18, :cond_9

    .line 221
    .line 222
    invoke-virtual {v4}, Lbe3;->C()J

    .line 223
    .line 224
    .line 225
    move-result-wide v23

    .line 226
    goto :goto_6

    .line 227
    :cond_9
    invoke-virtual {v4}, Lbe3;->G()J

    .line 228
    .line 229
    .line 230
    move-result-wide v23

    .line 231
    :goto_6
    cmp-long v8, v23, v39

    .line 232
    .line 233
    if-nez v8, :cond_c

    .line 234
    .line 235
    :goto_7
    move-wide/from16 v23, v21

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_a
    add-int/lit8 v11, v11, 0x1

    .line 239
    .line 240
    const/4 v13, 0x4

    .line 241
    goto :goto_5

    .line 242
    :cond_b
    invoke-virtual {v4, v15}, Lbe3;->O(I)V

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_c
    :goto_8
    const/16 v8, 0xa

    .line 247
    .line 248
    invoke-virtual {v4, v8}, Lbe3;->O(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4}, Lbe3;->H()I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    const/4 v11, 0x4

    .line 256
    invoke-virtual {v4, v11}, Lbe3;->O(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4}, Lbe3;->m()I

    .line 260
    .line 261
    .line 262
    move-result v13

    .line 263
    invoke-virtual {v4}, Lbe3;->m()I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    invoke-virtual {v4, v11}, Lbe3;->O(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4}, Lbe3;->m()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    invoke-virtual {v4}, Lbe3;->m()I

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    const/high16 v0, 0x10000

    .line 279
    .line 280
    if-nez v13, :cond_e

    .line 281
    .line 282
    if-ne v15, v0, :cond_e

    .line 283
    .line 284
    move-object/from16 v45, v2

    .line 285
    .line 286
    const/high16 v2, -0x10000

    .line 287
    .line 288
    if-eq v11, v2, :cond_d

    .line 289
    .line 290
    if-ne v11, v0, :cond_f

    .line 291
    .line 292
    :cond_d
    if-nez v14, :cond_f

    .line 293
    .line 294
    const/16 v0, 0x5a

    .line 295
    .line 296
    :goto_9
    const/16 v2, 0x10

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_e
    move-object/from16 v45, v2

    .line 300
    .line 301
    :cond_f
    const/high16 v2, -0x10000

    .line 302
    .line 303
    if-nez v13, :cond_11

    .line 304
    .line 305
    if-ne v15, v2, :cond_11

    .line 306
    .line 307
    if-eq v11, v0, :cond_10

    .line 308
    .line 309
    if-ne v11, v2, :cond_11

    .line 310
    .line 311
    :cond_10
    if-nez v14, :cond_11

    .line 312
    .line 313
    const/16 v0, 0x10e

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_11
    if-eq v13, v2, :cond_12

    .line 317
    .line 318
    if-ne v13, v0, :cond_13

    .line 319
    .line 320
    :cond_12
    if-nez v15, :cond_13

    .line 321
    .line 322
    if-nez v11, :cond_13

    .line 323
    .line 324
    if-ne v14, v2, :cond_13

    .line 325
    .line 326
    const/16 v0, 0xb4

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_13
    move/from16 v0, v16

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :goto_a
    invoke-virtual {v4, v2}, Lbe3;->O(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v4}, Lbe3;->x()S

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    const/4 v13, 0x2

    .line 340
    invoke-virtual {v4, v13}, Lbe3;->O(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4}, Lbe3;->x()S

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    new-instance v13, Lvu;

    .line 348
    .line 349
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 350
    .line 351
    .line 352
    iput v5, v13, Lvu;->a:I

    .line 353
    .line 354
    iput v8, v13, Lvu;->b:I

    .line 355
    .line 356
    iput v0, v13, Lvu;->c:I

    .line 357
    .line 358
    iput v11, v13, Lvu;->d:I

    .line 359
    .line 360
    iput v4, v13, Lvu;->e:I

    .line 361
    .line 362
    cmp-long v0, p2, v21

    .line 363
    .line 364
    if-nez v0, :cond_14

    .line 365
    .line 366
    move-wide/from16 v25, v23

    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_14
    move-wide/from16 v25, p2

    .line 370
    .line 371
    :goto_b
    iget-object v0, v7, Lpy2;->p:Lbe3;

    .line 372
    .line 373
    invoke-static {v0}, Lwu;->g(Lbe3;)Luy2;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    iget-wide v4, v0, Luy2;->c:J

    .line 378
    .line 379
    cmp-long v0, v25, v21

    .line 380
    .line 381
    if-nez v0, :cond_15

    .line 382
    .line 383
    move-wide/from16 v29, v4

    .line 384
    .line 385
    move-wide/from16 v24, v21

    .line 386
    .line 387
    :goto_c
    const v0, 0x6d696e66

    .line 388
    .line 389
    .line 390
    goto :goto_d

    .line 391
    :cond_15
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 392
    .line 393
    sget-object v31, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 394
    .line 395
    const-wide/32 v27, 0xf4240

    .line 396
    .line 397
    .line 398
    move-wide/from16 v29, v4

    .line 399
    .line 400
    invoke-static/range {v25 .. v31}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 401
    .line 402
    .line 403
    move-result-wide v4

    .line 404
    move-wide/from16 v24, v4

    .line 405
    .line 406
    goto :goto_c

    .line 407
    :goto_d
    invoke-virtual {v9, v0}, Loy2;->r(I)Loy2;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    const v0, 0x7374626c

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4, v0}, Loy2;->r(I)Loy2;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    const v0, 0x6d646864

    .line 425
    .line 426
    .line 427
    invoke-virtual {v9, v0}, Loy2;->s(I)Lpy2;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    iget-object v0, v0, Lpy2;->p:Lbe3;

    .line 435
    .line 436
    const/16 v5, 0x8

    .line 437
    .line 438
    invoke-virtual {v0, v5}, Lbe3;->N(I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0}, Lbe3;->m()I

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    invoke-static {v5}, Lwu;->e(I)I

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    if-nez v5, :cond_16

    .line 450
    .line 451
    const/16 v11, 0x8

    .line 452
    .line 453
    goto :goto_e

    .line 454
    :cond_16
    move v11, v2

    .line 455
    :goto_e
    invoke-virtual {v0, v11}, Lbe3;->O(I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Lbe3;->C()J

    .line 459
    .line 460
    .line 461
    move-result-wide v50

    .line 462
    iget v2, v0, Lbe3;->b:I

    .line 463
    .line 464
    if-nez v5, :cond_17

    .line 465
    .line 466
    const/4 v11, 0x4

    .line 467
    goto :goto_f

    .line 468
    :cond_17
    const/16 v11, 0x8

    .line 469
    .line 470
    :goto_f
    move/from16 v7, v16

    .line 471
    .line 472
    :goto_10
    if-ge v7, v11, :cond_1b

    .line 473
    .line 474
    iget-object v8, v0, Lbe3;->a:[B

    .line 475
    .line 476
    add-int v9, v2, v7

    .line 477
    .line 478
    aget-byte v8, v8, v9

    .line 479
    .line 480
    const/4 v9, -0x1

    .line 481
    if-eq v8, v9, :cond_1a

    .line 482
    .line 483
    if-nez v5, :cond_18

    .line 484
    .line 485
    invoke-virtual {v0}, Lbe3;->C()J

    .line 486
    .line 487
    .line 488
    move-result-wide v7

    .line 489
    :goto_11
    move-wide/from16 v46, v7

    .line 490
    .line 491
    goto :goto_12

    .line 492
    :cond_18
    invoke-virtual {v0}, Lbe3;->G()J

    .line 493
    .line 494
    .line 495
    move-result-wide v7

    .line 496
    goto :goto_11

    .line 497
    :goto_12
    cmp-long v2, v46, v39

    .line 498
    .line 499
    if-nez v2, :cond_19

    .line 500
    .line 501
    :goto_13
    move-wide/from16 v26, v21

    .line 502
    .line 503
    goto :goto_14

    .line 504
    :cond_19
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 505
    .line 506
    sget-object v52, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 507
    .line 508
    const-wide/32 v48, 0xf4240

    .line 509
    .line 510
    .line 511
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 512
    .line 513
    .line 514
    move-result-wide v21

    .line 515
    goto :goto_13

    .line 516
    :cond_1a
    add-int/lit8 v7, v7, 0x1

    .line 517
    .line 518
    goto :goto_10

    .line 519
    :cond_1b
    invoke-virtual {v0, v11}, Lbe3;->O(I)V

    .line 520
    .line 521
    .line 522
    goto :goto_13

    .line 523
    :goto_14
    invoke-virtual {v0}, Lbe3;->H()I

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    shr-int/lit8 v2, v0, 0xa

    .line 528
    .line 529
    and-int/lit8 v2, v2, 0x1f

    .line 530
    .line 531
    add-int/lit8 v2, v2, 0x60

    .line 532
    .line 533
    int-to-char v2, v2

    .line 534
    shr-int/lit8 v5, v0, 0x5

    .line 535
    .line 536
    and-int/lit8 v5, v5, 0x1f

    .line 537
    .line 538
    add-int/lit8 v5, v5, 0x60

    .line 539
    .line 540
    int-to-char v5, v5

    .line 541
    and-int/lit8 v0, v0, 0x1f

    .line 542
    .line 543
    add-int/lit8 v0, v0, 0x60

    .line 544
    .line 545
    int-to-char v0, v0

    .line 546
    const/4 v7, 0x3

    .line 547
    new-array v8, v7, [C

    .line 548
    .line 549
    aput-char v2, v8, v16

    .line 550
    .line 551
    aput-char v5, v8, v35

    .line 552
    .line 553
    const/16 v42, 0x2

    .line 554
    .line 555
    aput-char v0, v8, v42

    .line 556
    .line 557
    move/from16 v0, v16

    .line 558
    .line 559
    :goto_15
    if-ge v0, v7, :cond_1e

    .line 560
    .line 561
    aget-char v2, v8, v0

    .line 562
    .line 563
    const/16 v5, 0x61

    .line 564
    .line 565
    if-lt v2, v5, :cond_1d

    .line 566
    .line 567
    const/16 v5, 0x7a

    .line 568
    .line 569
    if-le v2, v5, :cond_1c

    .line 570
    .line 571
    goto :goto_16

    .line 572
    :cond_1c
    add-int/lit8 v0, v0, 0x1

    .line 573
    .line 574
    goto :goto_15

    .line 575
    :cond_1d
    :goto_16
    move-object/from16 v0, v36

    .line 576
    .line 577
    goto :goto_17

    .line 578
    :cond_1e
    new-instance v0, Ljava/lang/String;

    .line 579
    .line 580
    invoke-direct {v0, v8}, Ljava/lang/String;-><init>([C)V

    .line 581
    .line 582
    .line 583
    :goto_17
    const v2, 0x73747364

    .line 584
    .line 585
    .line 586
    invoke-virtual {v4, v2}, Loy2;->s(I)Lpy2;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    if-nez v2, :cond_1f

    .line 591
    .line 592
    const-string v0, "Ignoring track where sample table (stbl) box is missing a sample description (stsd)."

    .line 593
    .line 594
    invoke-static {v12, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    :goto_18
    move-object/from16 v2, p7

    .line 598
    .line 599
    move-object/from16 v0, v36

    .line 600
    .line 601
    goto/16 :goto_20

    .line 602
    .line 603
    :cond_1f
    iget-object v2, v2, Lpy2;->p:Lbe3;

    .line 604
    .line 605
    move-object/from16 v4, p4

    .line 606
    .line 607
    move/from16 v5, p6

    .line 608
    .line 609
    invoke-static {v2, v13, v0, v4, v5}, Lwu;->i(Lbe3;Lvu;Ljava/lang/String;Low0;Z)Ltu;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    if-nez p5, :cond_25

    .line 614
    .line 615
    const v2, 0x65647473

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6, v2}, Loy2;->r(I)Loy2;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    if-eqz v2, :cond_25

    .line 623
    .line 624
    const v7, 0x656c7374

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2, v7}, Loy2;->s(I)Lpy2;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    if-nez v2, :cond_20

    .line 632
    .line 633
    move-object/from16 v2, v36

    .line 634
    .line 635
    goto :goto_1c

    .line 636
    :cond_20
    iget-object v2, v2, Lpy2;->p:Lbe3;

    .line 637
    .line 638
    const/16 v7, 0x8

    .line 639
    .line 640
    invoke-virtual {v2, v7}, Lbe3;->N(I)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2}, Lbe3;->m()I

    .line 644
    .line 645
    .line 646
    move-result v7

    .line 647
    invoke-static {v7}, Lwu;->e(I)I

    .line 648
    .line 649
    .line 650
    move-result v7

    .line 651
    invoke-virtual {v2}, Lbe3;->E()I

    .line 652
    .line 653
    .line 654
    move-result v8

    .line 655
    new-array v9, v8, [J

    .line 656
    .line 657
    new-array v11, v8, [J

    .line 658
    .line 659
    move/from16 v14, v16

    .line 660
    .line 661
    :goto_19
    if-ge v14, v8, :cond_24

    .line 662
    .line 663
    move/from16 v15, v35

    .line 664
    .line 665
    if-ne v7, v15, :cond_21

    .line 666
    .line 667
    invoke-virtual {v2}, Lbe3;->G()J

    .line 668
    .line 669
    .line 670
    move-result-wide v17

    .line 671
    goto :goto_1a

    .line 672
    :cond_21
    invoke-virtual {v2}, Lbe3;->C()J

    .line 673
    .line 674
    .line 675
    move-result-wide v17

    .line 676
    :goto_1a
    aput-wide v17, v9, v14

    .line 677
    .line 678
    if-ne v7, v15, :cond_22

    .line 679
    .line 680
    invoke-virtual {v2}, Lbe3;->u()J

    .line 681
    .line 682
    .line 683
    move-result-wide v17

    .line 684
    goto :goto_1b

    .line 685
    :cond_22
    invoke-virtual {v2}, Lbe3;->m()I

    .line 686
    .line 687
    .line 688
    move-result v15

    .line 689
    int-to-long v4, v15

    .line 690
    move-wide/from16 v17, v4

    .line 691
    .line 692
    :goto_1b
    aput-wide v17, v11, v14

    .line 693
    .line 694
    invoke-virtual {v2}, Lbe3;->x()S

    .line 695
    .line 696
    .line 697
    move-result v4

    .line 698
    const/4 v15, 0x1

    .line 699
    if-ne v4, v15, :cond_23

    .line 700
    .line 701
    const/4 v4, 0x2

    .line 702
    invoke-virtual {v2, v4}, Lbe3;->O(I)V

    .line 703
    .line 704
    .line 705
    add-int/lit8 v14, v14, 0x1

    .line 706
    .line 707
    move-object/from16 v4, p4

    .line 708
    .line 709
    move/from16 v5, p6

    .line 710
    .line 711
    const/16 v35, 0x1

    .line 712
    .line 713
    goto :goto_19

    .line 714
    :cond_23
    const-string v0, "Unsupported media rate."

    .line 715
    .line 716
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    return-object v36

    .line 720
    :cond_24
    invoke-static {v9, v11}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    :goto_1c
    if-eqz v2, :cond_25

    .line 725
    .line 726
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v4, [J

    .line 729
    .line 730
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v2, [J

    .line 733
    .line 734
    move-object/from16 v33, v2

    .line 735
    .line 736
    move-object/from16 v32, v4

    .line 737
    .line 738
    goto :goto_1d

    .line 739
    :cond_25
    move-object/from16 v32, v36

    .line 740
    .line 741
    move-object/from16 v33, v32

    .line 742
    .line 743
    :goto_1d
    iget-object v2, v0, Ltu;->d:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v2, Ltb1;

    .line 746
    .line 747
    if-nez v2, :cond_26

    .line 748
    .line 749
    goto/16 :goto_18

    .line 750
    .line 751
    :cond_26
    iget v4, v13, Lvu;->b:I

    .line 752
    .line 753
    if-eqz v4, :cond_28

    .line 754
    .line 755
    new-instance v5, Lny2;

    .line 756
    .line 757
    invoke-direct {v5, v4}, Lny2;-><init>(I)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v2}, Ltb1;->a()Lsb1;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    iget-object v4, v0, Ltu;->d:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v4, Ltb1;

    .line 767
    .line 768
    iget-object v4, v4, Ltb1;->l:Lqv2;

    .line 769
    .line 770
    if-eqz v4, :cond_27

    .line 771
    .line 772
    const/4 v15, 0x1

    .line 773
    new-array v7, v15, [Lpv2;

    .line 774
    .line 775
    aput-object v5, v7, v16

    .line 776
    .line 777
    invoke-virtual {v4, v7}, Lqv2;->a([Lpv2;)Lqv2;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    goto :goto_1e

    .line 782
    :cond_27
    const/4 v15, 0x1

    .line 783
    new-instance v4, Lqv2;

    .line 784
    .line 785
    new-array v7, v15, [Lpv2;

    .line 786
    .line 787
    aput-object v5, v7, v16

    .line 788
    .line 789
    invoke-direct {v4, v7}, Lqv2;-><init>([Lpv2;)V

    .line 790
    .line 791
    .line 792
    :goto_1e
    iput-object v4, v2, Lsb1;->k:Lqv2;

    .line 793
    .line 794
    new-instance v4, Ltb1;

    .line 795
    .line 796
    invoke-direct {v4, v2}, Ltb1;-><init>(Lsb1;)V

    .line 797
    .line 798
    .line 799
    move-object/from16 v28, v4

    .line 800
    .line 801
    goto :goto_1f

    .line 802
    :cond_28
    move-object/from16 v28, v2

    .line 803
    .line 804
    :goto_1f
    new-instance v17, Lpv4;

    .line 805
    .line 806
    iget v2, v13, Lvu;->a:I

    .line 807
    .line 808
    iget v4, v0, Ltu;->b:I

    .line 809
    .line 810
    iget-object v5, v0, Ltu;->c:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v5, [Lqv4;

    .line 813
    .line 814
    iget v0, v0, Ltu;->a:I

    .line 815
    .line 816
    move/from16 v31, v0

    .line 817
    .line 818
    move/from16 v18, v2

    .line 819
    .line 820
    move/from16 v19, v10

    .line 821
    .line 822
    move-wide/from16 v22, v29

    .line 823
    .line 824
    move-wide/from16 v20, v50

    .line 825
    .line 826
    move/from16 v29, v4

    .line 827
    .line 828
    move-object/from16 v30, v5

    .line 829
    .line 830
    invoke-direct/range {v17 .. v33}, Lpv4;-><init>(IIJJJJLtb1;I[Lqv4;I[J[J)V

    .line 831
    .line 832
    .line 833
    move-object/from16 v2, p7

    .line 834
    .line 835
    move-object/from16 v0, v17

    .line 836
    .line 837
    :goto_20
    invoke-interface {v2, v0}, Leg1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    check-cast v0, Lpv4;

    .line 842
    .line 843
    if-nez v0, :cond_29

    .line 844
    .line 845
    move-object v1, v3

    .line 846
    goto/16 :goto_59

    .line 847
    .line 848
    :cond_29
    iget-object v4, v0, Lpv4;->g:Ltb1;

    .line 849
    .line 850
    const v5, 0x6d646961

    .line 851
    .line 852
    .line 853
    invoke-virtual {v6, v5}, Loy2;->r(I)Loy2;

    .line 854
    .line 855
    .line 856
    move-result-object v5

    .line 857
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    const v6, 0x6d696e66

    .line 861
    .line 862
    .line 863
    invoke-virtual {v5, v6}, Loy2;->r(I)Loy2;

    .line 864
    .line 865
    .line 866
    move-result-object v5

    .line 867
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    const v6, 0x7374626c

    .line 871
    .line 872
    .line 873
    invoke-virtual {v5, v6}, Loy2;->r(I)Loy2;

    .line 874
    .line 875
    .line 876
    move-result-object v5

    .line 877
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    const v6, 0x7374737a

    .line 881
    .line 882
    .line 883
    invoke-virtual {v5, v6}, Loy2;->s(I)Lpy2;

    .line 884
    .line 885
    .line 886
    move-result-object v6

    .line 887
    const-string v7, "audio/raw"

    .line 888
    .line 889
    const/16 v8, 0xc

    .line 890
    .line 891
    if-eqz v6, :cond_2c

    .line 892
    .line 893
    new-instance v9, Lj83;

    .line 894
    .line 895
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 896
    .line 897
    .line 898
    iget-object v6, v6, Lpy2;->p:Lbe3;

    .line 899
    .line 900
    iput-object v6, v9, Lj83;->p:Ljava/lang/Object;

    .line 901
    .line 902
    invoke-virtual {v6, v8}, Lbe3;->N(I)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v6}, Lbe3;->E()I

    .line 906
    .line 907
    .line 908
    move-result v10

    .line 909
    iget-object v11, v4, Ltb1;->n:Ljava/lang/String;

    .line 910
    .line 911
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v11

    .line 915
    if-eqz v11, :cond_2a

    .line 916
    .line 917
    iget v11, v4, Ltb1;->H:I

    .line 918
    .line 919
    iget v13, v4, Ltb1;->F:I

    .line 920
    .line 921
    invoke-static {v11}, Lf35;->t(I)I

    .line 922
    .line 923
    .line 924
    move-result v11

    .line 925
    mul-int/2addr v11, v13

    .line 926
    rem-int v13, v10, v11

    .line 927
    .line 928
    if-eqz v13, :cond_2a

    .line 929
    .line 930
    new-instance v13, Ljava/lang/StringBuilder;

    .line 931
    .line 932
    const-string v14, "Audio sample size mismatch. stsd sample size: "

    .line 933
    .line 934
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 938
    .line 939
    .line 940
    const-string v14, ", stsz sample size: "

    .line 941
    .line 942
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 946
    .line 947
    .line 948
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v10

    .line 952
    invoke-static {v12, v10}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    move v10, v11

    .line 956
    :cond_2a
    if-nez v10, :cond_2b

    .line 957
    .line 958
    const/4 v10, -0x1

    .line 959
    :cond_2b
    iput v10, v9, Lj83;->n:I

    .line 960
    .line 961
    invoke-virtual {v6}, Lbe3;->E()I

    .line 962
    .line 963
    .line 964
    move-result v6

    .line 965
    iput v6, v9, Lj83;->o:I

    .line 966
    .line 967
    goto :goto_21

    .line 968
    :cond_2c
    const v6, 0x73747a32

    .line 969
    .line 970
    .line 971
    invoke-virtual {v5, v6}, Loy2;->s(I)Lpy2;

    .line 972
    .line 973
    .line 974
    move-result-object v6

    .line 975
    if-eqz v6, :cond_79

    .line 976
    .line 977
    new-instance v9, Luu;

    .line 978
    .line 979
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 980
    .line 981
    .line 982
    iget-object v6, v6, Lpy2;->p:Lbe3;

    .line 983
    .line 984
    iput-object v6, v9, Luu;->r:Ljava/lang/Object;

    .line 985
    .line 986
    invoke-virtual {v6, v8}, Lbe3;->N(I)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v6}, Lbe3;->E()I

    .line 990
    .line 991
    .line 992
    move-result v10

    .line 993
    and-int/lit16 v10, v10, 0xff

    .line 994
    .line 995
    iput v10, v9, Luu;->o:I

    .line 996
    .line 997
    invoke-virtual {v6}, Lbe3;->E()I

    .line 998
    .line 999
    .line 1000
    move-result v6

    .line 1001
    iput v6, v9, Luu;->n:I

    .line 1002
    .line 1003
    :goto_21
    invoke-interface {v9}, Lsu;->k()I

    .line 1004
    .line 1005
    .line 1006
    move-result v6

    .line 1007
    if-nez v6, :cond_2d

    .line 1008
    .line 1009
    new-instance v17, Lxv4;

    .line 1010
    .line 1011
    move/from16 v4, v16

    .line 1012
    .line 1013
    new-array v5, v4, [J

    .line 1014
    .line 1015
    new-array v6, v4, [I

    .line 1016
    .line 1017
    new-array v7, v4, [J

    .line 1018
    .line 1019
    new-array v8, v4, [I

    .line 1020
    .line 1021
    new-array v9, v4, [I

    .line 1022
    .line 1023
    const-wide/16 v26, 0x0

    .line 1024
    .line 1025
    const/16 v28, 0x0

    .line 1026
    .line 1027
    const/16 v21, 0x0

    .line 1028
    .line 1029
    const/16 v25, 0x0

    .line 1030
    .line 1031
    move-object/from16 v18, v0

    .line 1032
    .line 1033
    move-object/from16 v19, v5

    .line 1034
    .line 1035
    move-object/from16 v20, v6

    .line 1036
    .line 1037
    move-object/from16 v22, v7

    .line 1038
    .line 1039
    move-object/from16 v23, v8

    .line 1040
    .line 1041
    move-object/from16 v24, v9

    .line 1042
    .line 1043
    invoke-direct/range {v17 .. v28}, Lxv4;-><init>(Lpv4;[J[II[J[I[IZJI)V

    .line 1044
    .line 1045
    .line 1046
    move-object v1, v3

    .line 1047
    move-object/from16 v0, v17

    .line 1048
    .line 1049
    :goto_22
    const/16 v16, 0x0

    .line 1050
    .line 1051
    goto/16 :goto_58

    .line 1052
    .line 1053
    :cond_2d
    iget v10, v0, Lpv4;->b:I

    .line 1054
    .line 1055
    const/4 v13, 0x2

    .line 1056
    if-ne v10, v13, :cond_2e

    .line 1057
    .line 1058
    iget-wide v10, v0, Lpv4;->f:J

    .line 1059
    .line 1060
    cmp-long v13, v10, v39

    .line 1061
    .line 1062
    if-lez v13, :cond_2e

    .line 1063
    .line 1064
    int-to-float v13, v6

    .line 1065
    long-to-float v10, v10

    .line 1066
    const v11, 0x49742400    # 1000000.0f

    .line 1067
    .line 1068
    .line 1069
    div-float/2addr v10, v11

    .line 1070
    div-float/2addr v13, v10

    .line 1071
    invoke-virtual {v4}, Ltb1;->a()Lsb1;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v4

    .line 1075
    iput v13, v4, Lsb1;->x:F

    .line 1076
    .line 1077
    new-instance v10, Ltb1;

    .line 1078
    .line 1079
    invoke-direct {v10, v4}, Ltb1;-><init>(Lsb1;)V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v0, v10}, Lpv4;->a(Ltb1;)Lpv4;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    :cond_2e
    iget-object v4, v0, Lpv4;->g:Ltb1;

    .line 1087
    .line 1088
    const v10, 0x7374636f

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v5, v10}, Loy2;->s(I)Lpy2;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v10

    .line 1095
    if-nez v10, :cond_2f

    .line 1096
    .line 1097
    const v10, 0x636f3634

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v5, v10}, Loy2;->s(I)Lpy2;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v10

    .line 1104
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    const/4 v11, 0x1

    .line 1108
    goto :goto_23

    .line 1109
    :cond_2f
    const/4 v11, 0x0

    .line 1110
    :goto_23
    iget-object v10, v10, Lpy2;->p:Lbe3;

    .line 1111
    .line 1112
    const v13, 0x73747363

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v5, v13}, Loy2;->s(I)Lpy2;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v13

    .line 1119
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    iget-object v13, v13, Lpy2;->p:Lbe3;

    .line 1123
    .line 1124
    const v14, 0x73747473

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v5, v14}, Loy2;->s(I)Lpy2;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v14

    .line 1131
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    iget-object v14, v14, Lpy2;->p:Lbe3;

    .line 1135
    .line 1136
    const v15, 0x73747373

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v5, v15}, Loy2;->s(I)Lpy2;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v15

    .line 1143
    if-eqz v15, :cond_30

    .line 1144
    .line 1145
    iget-object v15, v15, Lpy2;->p:Lbe3;

    .line 1146
    .line 1147
    goto :goto_24

    .line 1148
    :cond_30
    move-object/from16 v15, v36

    .line 1149
    .line 1150
    :goto_24
    const v8, 0x63747473

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v5, v8}, Loy2;->s(I)Lpy2;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v5

    .line 1157
    if-eqz v5, :cond_31

    .line 1158
    .line 1159
    iget-object v5, v5, Lpy2;->p:Lbe3;

    .line 1160
    .line 1161
    goto :goto_25

    .line 1162
    :cond_31
    move-object/from16 v5, v36

    .line 1163
    .line 1164
    :goto_25
    new-instance v8, Lqu;

    .line 1165
    .line 1166
    invoke-direct {v8, v13, v10, v11}, Lqu;-><init>(Lbe3;Lbe3;Z)V

    .line 1167
    .line 1168
    .line 1169
    const/16 v10, 0xc

    .line 1170
    .line 1171
    invoke-virtual {v14, v10}, Lbe3;->N(I)V

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v14}, Lbe3;->E()I

    .line 1175
    .line 1176
    .line 1177
    move-result v11

    .line 1178
    const/16 v35, 0x1

    .line 1179
    .line 1180
    add-int/lit8 v11, v11, -0x1

    .line 1181
    .line 1182
    invoke-virtual {v14}, Lbe3;->E()I

    .line 1183
    .line 1184
    .line 1185
    move-result v13

    .line 1186
    invoke-virtual {v14}, Lbe3;->E()I

    .line 1187
    .line 1188
    .line 1189
    move-result v2

    .line 1190
    if-eqz v5, :cond_32

    .line 1191
    .line 1192
    invoke-virtual {v5, v10}, Lbe3;->N(I)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v5}, Lbe3;->E()I

    .line 1196
    .line 1197
    .line 1198
    move-result v17

    .line 1199
    goto :goto_26

    .line 1200
    :cond_32
    const/16 v17, 0x0

    .line 1201
    .line 1202
    :goto_26
    if-eqz v15, :cond_34

    .line 1203
    .line 1204
    invoke-virtual {v15, v10}, Lbe3;->N(I)V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v15}, Lbe3;->E()I

    .line 1208
    .line 1209
    .line 1210
    move-result v10

    .line 1211
    if-lez v10, :cond_33

    .line 1212
    .line 1213
    invoke-virtual {v15}, Lbe3;->E()I

    .line 1214
    .line 1215
    .line 1216
    move-result v18

    .line 1217
    const/16 v35, 0x1

    .line 1218
    .line 1219
    add-int/lit8 v18, v18, -0x1

    .line 1220
    .line 1221
    move-object/from16 v19, v5

    .line 1222
    .line 1223
    goto :goto_28

    .line 1224
    :cond_33
    move-object/from16 v19, v5

    .line 1225
    .line 1226
    move-object/from16 v15, v36

    .line 1227
    .line 1228
    :goto_27
    const/16 v18, -0x1

    .line 1229
    .line 1230
    goto :goto_28

    .line 1231
    :cond_34
    move-object/from16 v19, v5

    .line 1232
    .line 1233
    const/4 v10, 0x0

    .line 1234
    goto :goto_27

    .line 1235
    :goto_28
    invoke-interface {v9}, Lsu;->f()I

    .line 1236
    .line 1237
    .line 1238
    move-result v5

    .line 1239
    move-object/from16 v20, v9

    .line 1240
    .line 1241
    iget-object v9, v4, Ltb1;->n:Ljava/lang/String;

    .line 1242
    .line 1243
    move-object/from16 v21, v4

    .line 1244
    .line 1245
    const/4 v4, -0x1

    .line 1246
    if-eq v5, v4, :cond_36

    .line 1247
    .line 1248
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v4

    .line 1252
    if-nez v4, :cond_35

    .line 1253
    .line 1254
    const-string v4, "audio/g711-mlaw"

    .line 1255
    .line 1256
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v4

    .line 1260
    if-nez v4, :cond_35

    .line 1261
    .line 1262
    const-string v4, "audio/g711-alaw"

    .line 1263
    .line 1264
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1265
    .line 1266
    .line 1267
    move-result v4

    .line 1268
    if-eqz v4, :cond_36

    .line 1269
    .line 1270
    :cond_35
    if-nez v11, :cond_36

    .line 1271
    .line 1272
    if-nez v17, :cond_36

    .line 1273
    .line 1274
    if-nez v10, :cond_36

    .line 1275
    .line 1276
    const/4 v4, 0x1

    .line 1277
    goto :goto_29

    .line 1278
    :cond_36
    const/4 v4, 0x0

    .line 1279
    :goto_29
    new-instance v7, Ljava/util/ArrayList;

    .line 1280
    .line 1281
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1282
    .line 1283
    .line 1284
    if-nez v15, :cond_37

    .line 1285
    .line 1286
    const/16 v30, 0x1

    .line 1287
    .line 1288
    goto :goto_2a

    .line 1289
    :cond_37
    const/16 v30, 0x0

    .line 1290
    .line 1291
    :goto_2a
    if-eqz v4, :cond_40

    .line 1292
    .line 1293
    iget v4, v8, Lqu;->a:I

    .line 1294
    .line 1295
    new-array v6, v4, [J

    .line 1296
    .line 1297
    new-array v9, v4, [I

    .line 1298
    .line 1299
    :goto_2b
    invoke-virtual {v8}, Lqu;->a()Z

    .line 1300
    .line 1301
    .line 1302
    move-result v10

    .line 1303
    if-eqz v10, :cond_38

    .line 1304
    .line 1305
    iget v10, v8, Lqu;->b:I

    .line 1306
    .line 1307
    iget-wide v11, v8, Lqu;->d:J

    .line 1308
    .line 1309
    aput-wide v11, v6, v10

    .line 1310
    .line 1311
    iget v11, v8, Lqu;->c:I

    .line 1312
    .line 1313
    aput v11, v9, v10

    .line 1314
    .line 1315
    goto :goto_2b

    .line 1316
    :cond_38
    int-to-long v10, v2

    .line 1317
    const/16 v2, 0x2000

    .line 1318
    .line 1319
    div-int/2addr v2, v5

    .line 1320
    const/4 v8, 0x0

    .line 1321
    const/4 v12, 0x0

    .line 1322
    :goto_2c
    if-ge v8, v4, :cond_39

    .line 1323
    .line 1324
    aget v13, v9, v8

    .line 1325
    .line 1326
    invoke-static {v13, v2}, Lf35;->g(II)I

    .line 1327
    .line 1328
    .line 1329
    move-result v13

    .line 1330
    add-int/2addr v12, v13

    .line 1331
    add-int/lit8 v8, v8, 0x1

    .line 1332
    .line 1333
    goto :goto_2c

    .line 1334
    :cond_39
    new-array v8, v12, [J

    .line 1335
    .line 1336
    new-array v13, v12, [I

    .line 1337
    .line 1338
    new-array v14, v12, [J

    .line 1339
    .line 1340
    new-array v15, v12, [I

    .line 1341
    .line 1342
    move/from16 v22, v5

    .line 1343
    .line 1344
    move-object/from16 v17, v6

    .line 1345
    .line 1346
    move-object/from16 v19, v8

    .line 1347
    .line 1348
    const/4 v5, 0x0

    .line 1349
    const/4 v6, 0x0

    .line 1350
    const/4 v8, 0x0

    .line 1351
    const/16 v18, 0x0

    .line 1352
    .line 1353
    const/16 v20, 0x0

    .line 1354
    .line 1355
    :goto_2d
    if-ge v5, v4, :cond_3b

    .line 1356
    .line 1357
    aget v23, v9, v5

    .line 1358
    .line 1359
    aget-wide v24, v17, v5

    .line 1360
    .line 1361
    move/from16 v53, v20

    .line 1362
    .line 1363
    move/from16 v20, v4

    .line 1364
    .line 1365
    move/from16 v4, v18

    .line 1366
    .line 1367
    move/from16 v18, v53

    .line 1368
    .line 1369
    move/from16 v53, v23

    .line 1370
    .line 1371
    move/from16 v23, v5

    .line 1372
    .line 1373
    move/from16 v5, v53

    .line 1374
    .line 1375
    :goto_2e
    if-lez v5, :cond_3a

    .line 1376
    .line 1377
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 1378
    .line 1379
    .line 1380
    move-result v26

    .line 1381
    aput-wide v24, v19, v18

    .line 1382
    .line 1383
    move/from16 v27, v2

    .line 1384
    .line 1385
    mul-int v2, v22, v26

    .line 1386
    .line 1387
    aput v2, v13, v18

    .line 1388
    .line 1389
    add-int/2addr v8, v2

    .line 1390
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 1391
    .line 1392
    .line 1393
    move-result v4

    .line 1394
    move/from16 v28, v4

    .line 1395
    .line 1396
    move v2, v5

    .line 1397
    int-to-long v4, v6

    .line 1398
    mul-long/2addr v4, v10

    .line 1399
    aput-wide v4, v14, v18

    .line 1400
    .line 1401
    const/16 v35, 0x1

    .line 1402
    .line 1403
    aput v35, v15, v18

    .line 1404
    .line 1405
    aget v4, v13, v18

    .line 1406
    .line 1407
    int-to-long v4, v4

    .line 1408
    add-long v24, v24, v4

    .line 1409
    .line 1410
    add-int v6, v6, v26

    .line 1411
    .line 1412
    sub-int v5, v2, v26

    .line 1413
    .line 1414
    add-int/lit8 v18, v18, 0x1

    .line 1415
    .line 1416
    move/from16 v2, v27

    .line 1417
    .line 1418
    move/from16 v4, v28

    .line 1419
    .line 1420
    goto :goto_2e

    .line 1421
    :cond_3a
    move/from16 v27, v2

    .line 1422
    .line 1423
    add-int/lit8 v5, v23, 0x1

    .line 1424
    .line 1425
    move/from16 v2, v18

    .line 1426
    .line 1427
    move/from16 v18, v4

    .line 1428
    .line 1429
    move/from16 v4, v20

    .line 1430
    .line 1431
    move/from16 v20, v2

    .line 1432
    .line 1433
    move/from16 v2, v27

    .line 1434
    .line 1435
    goto :goto_2d

    .line 1436
    :cond_3b
    int-to-long v4, v6

    .line 1437
    mul-long/2addr v10, v4

    .line 1438
    int-to-long v4, v8

    .line 1439
    const/4 v9, 0x0

    .line 1440
    if-eqz p8, :cond_3c

    .line 1441
    .line 1442
    new-array v8, v9, [J

    .line 1443
    .line 1444
    goto :goto_2f

    .line 1445
    :cond_3c
    move-object/from16 v8, v19

    .line 1446
    .line 1447
    :goto_2f
    if-eqz p8, :cond_3d

    .line 1448
    .line 1449
    new-array v13, v9, [I

    .line 1450
    .line 1451
    :cond_3d
    if-eqz p8, :cond_3e

    .line 1452
    .line 1453
    new-array v14, v9, [J

    .line 1454
    .line 1455
    :cond_3e
    if-eqz p8, :cond_3f

    .line 1456
    .line 1457
    new-array v15, v9, [I

    .line 1458
    .line 1459
    :cond_3f
    move-object/from16 v34, v3

    .line 1460
    .line 1461
    move-object/from16 v36, v7

    .line 1462
    .line 1463
    move-wide v6, v10

    .line 1464
    move/from16 v33, v12

    .line 1465
    .line 1466
    move/from16 v26, v18

    .line 1467
    .line 1468
    :goto_30
    move-object/from16 v24, v8

    .line 1469
    .line 1470
    move-object/from16 v25, v13

    .line 1471
    .line 1472
    move-object/from16 v28, v15

    .line 1473
    .line 1474
    goto/16 :goto_3f

    .line 1475
    .line 1476
    :cond_40
    const/4 v9, 0x0

    .line 1477
    if-eqz p8, :cond_41

    .line 1478
    .line 1479
    new-array v4, v9, [J

    .line 1480
    .line 1481
    goto :goto_31

    .line 1482
    :cond_41
    new-array v4, v6, [J

    .line 1483
    .line 1484
    :goto_31
    if-eqz p8, :cond_42

    .line 1485
    .line 1486
    new-array v5, v9, [I

    .line 1487
    .line 1488
    goto :goto_32

    .line 1489
    :cond_42
    new-array v5, v6, [I

    .line 1490
    .line 1491
    :goto_32
    move/from16 v22, v2

    .line 1492
    .line 1493
    if-eqz p8, :cond_43

    .line 1494
    .line 1495
    new-array v2, v9, [J

    .line 1496
    .line 1497
    goto :goto_33

    .line 1498
    :cond_43
    new-array v2, v6, [J

    .line 1499
    .line 1500
    :goto_33
    move/from16 v23, v10

    .line 1501
    .line 1502
    if-eqz p8, :cond_44

    .line 1503
    .line 1504
    new-array v10, v9, [I

    .line 1505
    .line 1506
    goto :goto_34

    .line 1507
    :cond_44
    new-array v10, v6, [I

    .line 1508
    .line 1509
    :goto_34
    move-object/from16 v34, v3

    .line 1510
    .line 1511
    move/from16 v25, v11

    .line 1512
    .line 1513
    move/from16 v24, v17

    .line 1514
    .line 1515
    move/from16 v9, v22

    .line 1516
    .line 1517
    move/from16 v11, v23

    .line 1518
    .line 1519
    move-wide/from16 v26, v39

    .line 1520
    .line 1521
    move-wide/from16 v28, v26

    .line 1522
    .line 1523
    move-wide/from16 v31, v28

    .line 1524
    .line 1525
    const/4 v1, 0x0

    .line 1526
    const/4 v3, 0x0

    .line 1527
    const/16 v22, 0x0

    .line 1528
    .line 1529
    const/16 v23, 0x0

    .line 1530
    .line 1531
    move-object/from16 v17, v14

    .line 1532
    .line 1533
    move v14, v13

    .line 1534
    move/from16 v13, v18

    .line 1535
    .line 1536
    move-object/from16 v18, v15

    .line 1537
    .line 1538
    const/4 v15, 0x0

    .line 1539
    :goto_35
    if-ge v15, v6, :cond_50

    .line 1540
    .line 1541
    const/16 v33, 0x1

    .line 1542
    .line 1543
    :goto_36
    if-nez v22, :cond_45

    .line 1544
    .line 1545
    invoke-virtual {v8}, Lqu;->a()Z

    .line 1546
    .line 1547
    .line 1548
    move-result v33

    .line 1549
    if-eqz v33, :cond_45

    .line 1550
    .line 1551
    move/from16 v38, v6

    .line 1552
    .line 1553
    move-object/from16 v36, v7

    .line 1554
    .line 1555
    iget-wide v6, v8, Lqu;->d:J

    .line 1556
    .line 1557
    move-wide/from16 v31, v6

    .line 1558
    .line 1559
    iget v6, v8, Lqu;->c:I

    .line 1560
    .line 1561
    move/from16 v22, v6

    .line 1562
    .line 1563
    move-object/from16 v7, v36

    .line 1564
    .line 1565
    move/from16 v6, v38

    .line 1566
    .line 1567
    goto :goto_36

    .line 1568
    :cond_45
    move/from16 v38, v6

    .line 1569
    .line 1570
    move-object/from16 v36, v7

    .line 1571
    .line 1572
    if-nez v33, :cond_47

    .line 1573
    .line 1574
    const-string v6, "Unexpected end of chunk data"

    .line 1575
    .line 1576
    invoke-static {v12, v6}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 1577
    .line 1578
    .line 1579
    if-nez p8, :cond_46

    .line 1580
    .line 1581
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 1582
    .line 1583
    .line 1584
    move-result-object v4

    .line 1585
    invoke-static {v5, v15}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1586
    .line 1587
    .line 1588
    move-result-object v5

    .line 1589
    invoke-static {v2, v15}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 1590
    .line 1591
    .line 1592
    move-result-object v2

    .line 1593
    invoke-static {v10, v15}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1594
    .line 1595
    .line 1596
    move-result-object v6

    .line 1597
    move v8, v15

    .line 1598
    move-object v15, v6

    .line 1599
    move v6, v8

    .line 1600
    move-object v8, v4

    .line 1601
    move-object v13, v5

    .line 1602
    move/from16 v4, v22

    .line 1603
    .line 1604
    goto/16 :goto_3b

    .line 1605
    .line 1606
    :cond_46
    move-object v8, v4

    .line 1607
    move-object v13, v5

    .line 1608
    move v6, v15

    .line 1609
    move/from16 v4, v22

    .line 1610
    .line 1611
    move-object v15, v10

    .line 1612
    goto/16 :goto_3b

    .line 1613
    .line 1614
    :cond_47
    if-eqz v19, :cond_49

    .line 1615
    .line 1616
    :goto_37
    if-nez v23, :cond_48

    .line 1617
    .line 1618
    if-lez v24, :cond_48

    .line 1619
    .line 1620
    invoke-virtual/range {v19 .. v19}, Lbe3;->E()I

    .line 1621
    .line 1622
    .line 1623
    move-result v23

    .line 1624
    invoke-virtual/range {v19 .. v19}, Lbe3;->m()I

    .line 1625
    .line 1626
    .line 1627
    move-result v3

    .line 1628
    add-int/lit8 v24, v24, -0x1

    .line 1629
    .line 1630
    goto :goto_37

    .line 1631
    :cond_48
    add-int/lit8 v23, v23, -0x1

    .line 1632
    .line 1633
    :cond_49
    invoke-interface/range {v20 .. v20}, Lsu;->l()I

    .line 1634
    .line 1635
    .line 1636
    move-result v6

    .line 1637
    move-object v7, v4

    .line 1638
    move-object/from16 v33, v5

    .line 1639
    .line 1640
    int-to-long v4, v6

    .line 1641
    add-long v28, v28, v4

    .line 1642
    .line 1643
    if-le v6, v1, :cond_4a

    .line 1644
    .line 1645
    move v1, v6

    .line 1646
    :cond_4a
    if-nez p8, :cond_4d

    .line 1647
    .line 1648
    aput-wide v31, v7, v15

    .line 1649
    .line 1650
    aput v6, v33, v15

    .line 1651
    .line 1652
    move/from16 v41, v1

    .line 1653
    .line 1654
    move-object v6, v2

    .line 1655
    int-to-long v1, v3

    .line 1656
    add-long v1, v26, v1

    .line 1657
    .line 1658
    aput-wide v1, v6, v15

    .line 1659
    .line 1660
    if-nez v18, :cond_4b

    .line 1661
    .line 1662
    const/4 v1, 0x1

    .line 1663
    goto :goto_38

    .line 1664
    :cond_4b
    const/4 v1, 0x0

    .line 1665
    :goto_38
    aput v1, v10, v15

    .line 1666
    .line 1667
    if-ne v15, v13, :cond_4c

    .line 1668
    .line 1669
    const/16 v35, 0x1

    .line 1670
    .line 1671
    aput v35, v10, v15

    .line 1672
    .line 1673
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    move-object/from16 v2, v36

    .line 1678
    .line 1679
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1680
    .line 1681
    .line 1682
    goto :goto_3a

    .line 1683
    :cond_4c
    :goto_39
    move-object/from16 v2, v36

    .line 1684
    .line 1685
    goto :goto_3a

    .line 1686
    :cond_4d
    move/from16 v41, v1

    .line 1687
    .line 1688
    move-object v6, v2

    .line 1689
    goto :goto_39

    .line 1690
    :goto_3a
    if-eqz v18, :cond_4e

    .line 1691
    .line 1692
    if-ne v15, v13, :cond_4e

    .line 1693
    .line 1694
    add-int/lit8 v11, v11, -0x1

    .line 1695
    .line 1696
    if-lez v11, :cond_4e

    .line 1697
    .line 1698
    invoke-virtual/range {v18 .. v18}, Lbe3;->E()I

    .line 1699
    .line 1700
    .line 1701
    move-result v1

    .line 1702
    const/16 v35, 0x1

    .line 1703
    .line 1704
    add-int/lit8 v1, v1, -0x1

    .line 1705
    .line 1706
    move v13, v1

    .line 1707
    :cond_4e
    move-object/from16 v36, v2

    .line 1708
    .line 1709
    int-to-long v1, v9

    .line 1710
    add-long v26, v26, v1

    .line 1711
    .line 1712
    add-int/lit8 v14, v14, -0x1

    .line 1713
    .line 1714
    if-nez v14, :cond_4f

    .line 1715
    .line 1716
    if-lez v25, :cond_4f

    .line 1717
    .line 1718
    invoke-virtual/range {v17 .. v17}, Lbe3;->E()I

    .line 1719
    .line 1720
    .line 1721
    move-result v1

    .line 1722
    invoke-virtual/range {v17 .. v17}, Lbe3;->m()I

    .line 1723
    .line 1724
    .line 1725
    move-result v2

    .line 1726
    add-int/lit8 v25, v25, -0x1

    .line 1727
    .line 1728
    move v14, v1

    .line 1729
    move v9, v2

    .line 1730
    :cond_4f
    add-long v31, v31, v4

    .line 1731
    .line 1732
    add-int/lit8 v22, v22, -0x1

    .line 1733
    .line 1734
    add-int/lit8 v15, v15, 0x1

    .line 1735
    .line 1736
    move-object v2, v6

    .line 1737
    move-object v4, v7

    .line 1738
    move-object/from16 v5, v33

    .line 1739
    .line 1740
    move-object/from16 v7, v36

    .line 1741
    .line 1742
    move/from16 v6, v38

    .line 1743
    .line 1744
    move/from16 v1, v41

    .line 1745
    .line 1746
    goto/16 :goto_35

    .line 1747
    .line 1748
    :cond_50
    move-object/from16 v33, v5

    .line 1749
    .line 1750
    move/from16 v38, v6

    .line 1751
    .line 1752
    move-object/from16 v36, v7

    .line 1753
    .line 1754
    move-object v6, v2

    .line 1755
    move-object v7, v4

    .line 1756
    move-object v8, v7

    .line 1757
    move-object v15, v10

    .line 1758
    move/from16 v4, v22

    .line 1759
    .line 1760
    move-object/from16 v13, v33

    .line 1761
    .line 1762
    move/from16 v6, v38

    .line 1763
    .line 1764
    :goto_3b
    int-to-long v9, v3

    .line 1765
    add-long v9, v26, v9

    .line 1766
    .line 1767
    if-eqz v19, :cond_52

    .line 1768
    .line 1769
    :goto_3c
    if-lez v24, :cond_52

    .line 1770
    .line 1771
    invoke-virtual/range {v19 .. v19}, Lbe3;->E()I

    .line 1772
    .line 1773
    .line 1774
    move-result v3

    .line 1775
    if-eqz v3, :cond_51

    .line 1776
    .line 1777
    const/4 v3, 0x0

    .line 1778
    goto :goto_3d

    .line 1779
    :cond_51
    invoke-virtual/range {v19 .. v19}, Lbe3;->m()I

    .line 1780
    .line 1781
    .line 1782
    add-int/lit8 v24, v24, -0x1

    .line 1783
    .line 1784
    goto :goto_3c

    .line 1785
    :cond_52
    const/4 v3, 0x1

    .line 1786
    :goto_3d
    if-nez v11, :cond_53

    .line 1787
    .line 1788
    if-nez v14, :cond_53

    .line 1789
    .line 1790
    if-nez v4, :cond_53

    .line 1791
    .line 1792
    if-nez v25, :cond_53

    .line 1793
    .line 1794
    if-nez v23, :cond_53

    .line 1795
    .line 1796
    if-nez v3, :cond_55

    .line 1797
    .line 1798
    :cond_53
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1799
    .line 1800
    const-string v7, "Inconsistent stbl box for track "

    .line 1801
    .line 1802
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1803
    .line 1804
    .line 1805
    iget v7, v0, Lpv4;->a:I

    .line 1806
    .line 1807
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1808
    .line 1809
    .line 1810
    const-string v7, ": remainingSynchronizationSamples "

    .line 1811
    .line 1812
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1816
    .line 1817
    .line 1818
    const-string v7, ", remainingSamplesAtTimestampDelta "

    .line 1819
    .line 1820
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1821
    .line 1822
    .line 1823
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1824
    .line 1825
    .line 1826
    const-string v7, ", remainingSamplesInChunk "

    .line 1827
    .line 1828
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1829
    .line 1830
    .line 1831
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1832
    .line 1833
    .line 1834
    const-string v4, ", remainingTimestampDeltaChanges "

    .line 1835
    .line 1836
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1837
    .line 1838
    .line 1839
    move/from16 v11, v25

    .line 1840
    .line 1841
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1842
    .line 1843
    .line 1844
    const-string v4, ", remainingSamplesAtTimestampOffset "

    .line 1845
    .line 1846
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1847
    .line 1848
    .line 1849
    move/from16 v4, v23

    .line 1850
    .line 1851
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1852
    .line 1853
    .line 1854
    if-nez v3, :cond_54

    .line 1855
    .line 1856
    const-string v3, ", ctts invalid"

    .line 1857
    .line 1858
    goto :goto_3e

    .line 1859
    :cond_54
    const-string v3, ""

    .line 1860
    .line 1861
    :goto_3e
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1862
    .line 1863
    .line 1864
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v3

    .line 1868
    invoke-static {v12, v3}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 1869
    .line 1870
    .line 1871
    :cond_55
    move/from16 v26, v1

    .line 1872
    .line 1873
    move-object v14, v2

    .line 1874
    move/from16 v33, v6

    .line 1875
    .line 1876
    move-wide v6, v9

    .line 1877
    move-wide/from16 v4, v28

    .line 1878
    .line 1879
    goto/16 :goto_30

    .line 1880
    .line 1881
    :goto_3f
    iget-wide v1, v0, Lpv4;->f:J

    .line 1882
    .line 1883
    cmp-long v3, v1, v39

    .line 1884
    .line 1885
    const-wide/32 v17, 0x7fffffff

    .line 1886
    .line 1887
    .line 1888
    if-lez v3, :cond_56

    .line 1889
    .line 1890
    const-wide/16 v8, 0x8

    .line 1891
    .line 1892
    mul-long v46, v4, v8

    .line 1893
    .line 1894
    const-wide/32 v48, 0xf4240

    .line 1895
    .line 1896
    .line 1897
    sget-object v52, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    .line 1898
    .line 1899
    move-wide/from16 v50, v1

    .line 1900
    .line 1901
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1902
    .line 1903
    .line 1904
    move-result-wide v1

    .line 1905
    cmp-long v3, v1, v39

    .line 1906
    .line 1907
    if-lez v3, :cond_56

    .line 1908
    .line 1909
    cmp-long v3, v1, v17

    .line 1910
    .line 1911
    if-gez v3, :cond_56

    .line 1912
    .line 1913
    invoke-virtual/range {v21 .. v21}, Ltb1;->a()Lsb1;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v3

    .line 1917
    long-to-int v1, v1

    .line 1918
    iput v1, v3, Lsb1;->h:I

    .line 1919
    .line 1920
    new-instance v1, Ltb1;

    .line 1921
    .line 1922
    invoke-direct {v1, v3}, Ltb1;-><init>(Lsb1;)V

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v0, v1}, Lpv4;->a(Ltb1;)Lpv4;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v0

    .line 1929
    :cond_56
    iget v1, v0, Lpv4;->b:I

    .line 1930
    .line 1931
    iget-wide v10, v0, Lpv4;->c:J

    .line 1932
    .line 1933
    iget-object v2, v0, Lpv4;->g:Ltb1;

    .line 1934
    .line 1935
    iget-object v3, v0, Lpv4;->j:[J

    .line 1936
    .line 1937
    iget-object v4, v0, Lpv4;->i:[J

    .line 1938
    .line 1939
    sget-object v52, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1940
    .line 1941
    const-wide/32 v8, 0xf4240

    .line 1942
    .line 1943
    .line 1944
    move-object/from16 v12, v52

    .line 1945
    .line 1946
    invoke-static/range {v6 .. v12}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 1947
    .line 1948
    .line 1949
    move-result-wide v31

    .line 1950
    invoke-static/range {v36 .. v36}, Ljz4;->N(Ljava/util/Collection;)[I

    .line 1951
    .line 1952
    .line 1953
    move-result-object v29

    .line 1954
    if-nez v4, :cond_58

    .line 1955
    .line 1956
    if-nez p8, :cond_57

    .line 1957
    .line 1958
    invoke-static {v14, v10, v11}, Lf35;->Z([JJ)V

    .line 1959
    .line 1960
    .line 1961
    :cond_57
    new-instance v22, Lxv4;

    .line 1962
    .line 1963
    move-object/from16 v23, v0

    .line 1964
    .line 1965
    move-object/from16 v27, v14

    .line 1966
    .line 1967
    invoke-direct/range {v22 .. v33}, Lxv4;-><init>(Lpv4;[J[II[J[I[IZJI)V

    .line 1968
    .line 1969
    .line 1970
    :goto_40
    move-object/from16 v0, v22

    .line 1971
    .line 1972
    move-object/from16 v1, v34

    .line 1973
    .line 1974
    goto/16 :goto_22

    .line 1975
    .line 1976
    :cond_58
    move-object/from16 v27, v14

    .line 1977
    .line 1978
    const-wide/16 v8, -0x1

    .line 1979
    .line 1980
    if-eqz p8, :cond_5c

    .line 1981
    .line 1982
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1983
    .line 1984
    .line 1985
    array-length v1, v4

    .line 1986
    const/4 v15, 0x1

    .line 1987
    if-ne v1, v15, :cond_59

    .line 1988
    .line 1989
    const/16 v16, 0x0

    .line 1990
    .line 1991
    aget-wide v1, v4, v16

    .line 1992
    .line 1993
    cmp-long v1, v1, v39

    .line 1994
    .line 1995
    if-nez v1, :cond_59

    .line 1996
    .line 1997
    aget-wide v1, v3, v16

    .line 1998
    .line 1999
    sub-long v46, v6, v1

    .line 2000
    .line 2001
    const-wide/32 v48, 0xf4240

    .line 2002
    .line 2003
    .line 2004
    iget-wide v1, v0, Lpv4;->c:J

    .line 2005
    .line 2006
    move-wide/from16 v50, v1

    .line 2007
    .line 2008
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2009
    .line 2010
    .line 2011
    move-result-wide v1

    .line 2012
    :goto_41
    move-wide/from16 v31, v1

    .line 2013
    .line 2014
    goto :goto_43

    .line 2015
    :cond_59
    const/4 v1, 0x0

    .line 2016
    :goto_42
    array-length v2, v4

    .line 2017
    if-ge v1, v2, :cond_5b

    .line 2018
    .line 2019
    aget-wide v5, v3, v1

    .line 2020
    .line 2021
    cmp-long v2, v5, v8

    .line 2022
    .line 2023
    if-eqz v2, :cond_5a

    .line 2024
    .line 2025
    aget-wide v5, v4, v1

    .line 2026
    .line 2027
    add-long v39, v39, v5

    .line 2028
    .line 2029
    :cond_5a
    add-int/lit8 v1, v1, 0x1

    .line 2030
    .line 2031
    goto :goto_42

    .line 2032
    :cond_5b
    iget-wide v7, v0, Lpv4;->d:J

    .line 2033
    .line 2034
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2035
    .line 2036
    const-wide/32 v5, 0xf4240

    .line 2037
    .line 2038
    .line 2039
    move-wide/from16 v3, v39

    .line 2040
    .line 2041
    invoke-static/range {v3 .. v9}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2042
    .line 2043
    .line 2044
    move-result-wide v1

    .line 2045
    goto :goto_41

    .line 2046
    :goto_43
    new-instance v22, Lxv4;

    .line 2047
    .line 2048
    move-object/from16 v23, v0

    .line 2049
    .line 2050
    invoke-direct/range {v22 .. v33}, Lxv4;-><init>(Lpv4;[J[II[J[I[IZJI)V

    .line 2051
    .line 2052
    .line 2053
    goto :goto_40

    .line 2054
    :cond_5c
    move-object/from16 v14, v27

    .line 2055
    .line 2056
    array-length v5, v4

    .line 2057
    const/4 v15, 0x1

    .line 2058
    if-ne v5, v15, :cond_5f

    .line 2059
    .line 2060
    if-ne v1, v15, :cond_5f

    .line 2061
    .line 2062
    array-length v5, v14

    .line 2063
    const/4 v13, 0x2

    .line 2064
    if-lt v5, v13, :cond_5f

    .line 2065
    .line 2066
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2067
    .line 2068
    .line 2069
    const/4 v5, 0x0

    .line 2070
    aget-wide v12, v3, v5

    .line 2071
    .line 2072
    aget-wide v46, v4, v5

    .line 2073
    .line 2074
    move-wide/from16 v19, v8

    .line 2075
    .line 2076
    iget-wide v8, v0, Lpv4;->c:J

    .line 2077
    .line 2078
    move-wide/from16 v21, v6

    .line 2079
    .line 2080
    iget-wide v5, v0, Lpv4;->d:J

    .line 2081
    .line 2082
    move-wide/from16 v50, v5

    .line 2083
    .line 2084
    move-wide/from16 v48, v8

    .line 2085
    .line 2086
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2087
    .line 2088
    .line 2089
    move-result-wide v5

    .line 2090
    add-long/2addr v5, v12

    .line 2091
    array-length v7, v14

    .line 2092
    sub-int/2addr v7, v15

    .line 2093
    const/4 v8, 0x4

    .line 2094
    const/4 v9, 0x0

    .line 2095
    invoke-static {v8, v9, v7}, Lf35;->j(III)I

    .line 2096
    .line 2097
    .line 2098
    move-result v15

    .line 2099
    move/from16 v43, v8

    .line 2100
    .line 2101
    array-length v8, v14

    .line 2102
    add-int/lit8 v8, v8, -0x4

    .line 2103
    .line 2104
    invoke-static {v8, v9, v7}, Lf35;->j(III)I

    .line 2105
    .line 2106
    .line 2107
    move-result v7

    .line 2108
    aget-wide v31, v14, v9

    .line 2109
    .line 2110
    cmp-long v8, v31, v12

    .line 2111
    .line 2112
    if-gtz v8, :cond_5d

    .line 2113
    .line 2114
    aget-wide v8, v14, v15

    .line 2115
    .line 2116
    cmp-long v8, v12, v8

    .line 2117
    .line 2118
    if-gez v8, :cond_5d

    .line 2119
    .line 2120
    aget-wide v7, v14, v7

    .line 2121
    .line 2122
    cmp-long v7, v7, v5

    .line 2123
    .line 2124
    if-gez v7, :cond_5d

    .line 2125
    .line 2126
    const-wide/16 v7, 0x2

    .line 2127
    .line 2128
    add-long v7, v21, v7

    .line 2129
    .line 2130
    cmp-long v7, v5, v7

    .line 2131
    .line 2132
    if-gtz v7, :cond_5d

    .line 2133
    .line 2134
    sub-long v6, v21, v5

    .line 2135
    .line 2136
    move-wide/from16 v8, v39

    .line 2137
    .line 2138
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 2139
    .line 2140
    .line 2141
    move-result-wide v5

    .line 2142
    const/16 v16, 0x0

    .line 2143
    .line 2144
    aget-wide v31, v14, v16

    .line 2145
    .line 2146
    sub-long v46, v12, v31

    .line 2147
    .line 2148
    iget v7, v2, Ltb1;->G:I

    .line 2149
    .line 2150
    int-to-long v12, v7

    .line 2151
    iget-wide v8, v0, Lpv4;->c:J

    .line 2152
    .line 2153
    move-wide/from16 v50, v8

    .line 2154
    .line 2155
    move-wide/from16 v48, v12

    .line 2156
    .line 2157
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2158
    .line 2159
    .line 2160
    move-result-wide v7

    .line 2161
    iget v9, v2, Ltb1;->G:I

    .line 2162
    .line 2163
    int-to-long v12, v9

    .line 2164
    move-wide/from16 v46, v5

    .line 2165
    .line 2166
    iget-wide v5, v0, Lpv4;->c:J

    .line 2167
    .line 2168
    move-wide/from16 v50, v5

    .line 2169
    .line 2170
    move-wide/from16 v48, v12

    .line 2171
    .line 2172
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2173
    .line 2174
    .line 2175
    move-result-wide v5

    .line 2176
    cmp-long v9, v7, v39

    .line 2177
    .line 2178
    if-nez v9, :cond_5e

    .line 2179
    .line 2180
    cmp-long v9, v5, v39

    .line 2181
    .line 2182
    if-eqz v9, :cond_5d

    .line 2183
    .line 2184
    goto :goto_45

    .line 2185
    :cond_5d
    :goto_44
    move-object/from16 v7, p1

    .line 2186
    .line 2187
    goto :goto_46

    .line 2188
    :cond_5e
    :goto_45
    cmp-long v9, v7, v17

    .line 2189
    .line 2190
    if-gtz v9, :cond_5d

    .line 2191
    .line 2192
    cmp-long v9, v5, v17

    .line 2193
    .line 2194
    if-gtz v9, :cond_5d

    .line 2195
    .line 2196
    long-to-int v1, v7

    .line 2197
    move-object/from16 v7, p1

    .line 2198
    .line 2199
    iput v1, v7, Lzg1;->a:I

    .line 2200
    .line 2201
    long-to-int v1, v5

    .line 2202
    iput v1, v7, Lzg1;->b:I

    .line 2203
    .line 2204
    invoke-static {v14, v10, v11}, Lf35;->Z([JJ)V

    .line 2205
    .line 2206
    .line 2207
    const/16 v16, 0x0

    .line 2208
    .line 2209
    aget-wide v46, v4, v16

    .line 2210
    .line 2211
    const-wide/32 v48, 0xf4240

    .line 2212
    .line 2213
    .line 2214
    iget-wide v1, v0, Lpv4;->d:J

    .line 2215
    .line 2216
    move-wide/from16 v50, v1

    .line 2217
    .line 2218
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2219
    .line 2220
    .line 2221
    move-result-wide v31

    .line 2222
    new-instance v22, Lxv4;

    .line 2223
    .line 2224
    move-object/from16 v23, v0

    .line 2225
    .line 2226
    move-object/from16 v27, v14

    .line 2227
    .line 2228
    invoke-direct/range {v22 .. v33}, Lxv4;-><init>(Lpv4;[J[II[J[I[IZJI)V

    .line 2229
    .line 2230
    .line 2231
    goto/16 :goto_40

    .line 2232
    .line 2233
    :cond_5f
    move-wide/from16 v21, v6

    .line 2234
    .line 2235
    move-wide/from16 v19, v8

    .line 2236
    .line 2237
    goto :goto_44

    .line 2238
    :goto_46
    array-length v5, v4

    .line 2239
    const/4 v15, 0x1

    .line 2240
    if-ne v5, v15, :cond_61

    .line 2241
    .line 2242
    const/16 v16, 0x0

    .line 2243
    .line 2244
    aget-wide v5, v4, v16

    .line 2245
    .line 2246
    const-wide/16 v39, 0x0

    .line 2247
    .line 2248
    cmp-long v5, v5, v39

    .line 2249
    .line 2250
    if-nez v5, :cond_61

    .line 2251
    .line 2252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2253
    .line 2254
    .line 2255
    aget-wide v1, v3, v16

    .line 2256
    .line 2257
    const/4 v4, 0x0

    .line 2258
    :goto_47
    array-length v3, v14

    .line 2259
    if-ge v4, v3, :cond_60

    .line 2260
    .line 2261
    aget-wide v5, v14, v4

    .line 2262
    .line 2263
    sub-long v38, v5, v1

    .line 2264
    .line 2265
    iget-wide v5, v0, Lpv4;->c:J

    .line 2266
    .line 2267
    sget-object v44, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2268
    .line 2269
    const-wide/32 v40, 0xf4240

    .line 2270
    .line 2271
    .line 2272
    move-wide/from16 v42, v5

    .line 2273
    .line 2274
    invoke-static/range {v38 .. v44}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2275
    .line 2276
    .line 2277
    move-result-wide v5

    .line 2278
    aput-wide v5, v14, v4

    .line 2279
    .line 2280
    add-int/lit8 v4, v4, 0x1

    .line 2281
    .line 2282
    goto :goto_47

    .line 2283
    :cond_60
    sub-long v38, v21, v1

    .line 2284
    .line 2285
    iget-wide v1, v0, Lpv4;->c:J

    .line 2286
    .line 2287
    sget-object v44, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2288
    .line 2289
    const-wide/32 v40, 0xf4240

    .line 2290
    .line 2291
    .line 2292
    move-wide/from16 v42, v1

    .line 2293
    .line 2294
    invoke-static/range {v38 .. v44}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2295
    .line 2296
    .line 2297
    move-result-wide v31

    .line 2298
    new-instance v22, Lxv4;

    .line 2299
    .line 2300
    move-object/from16 v23, v0

    .line 2301
    .line 2302
    move-object/from16 v27, v14

    .line 2303
    .line 2304
    invoke-direct/range {v22 .. v33}, Lxv4;-><init>(Lpv4;[J[II[J[I[IZJI)V

    .line 2305
    .line 2306
    .line 2307
    goto/16 :goto_40

    .line 2308
    .line 2309
    :cond_61
    move-object/from16 v8, v24

    .line 2310
    .line 2311
    move-object/from16 v13, v25

    .line 2312
    .line 2313
    move-object/from16 v15, v28

    .line 2314
    .line 2315
    move/from16 v12, v33

    .line 2316
    .line 2317
    const/4 v5, 0x1

    .line 2318
    if-ne v1, v5, :cond_62

    .line 2319
    .line 2320
    const/4 v1, 0x1

    .line 2321
    goto :goto_48

    .line 2322
    :cond_62
    const/4 v1, 0x0

    .line 2323
    :goto_48
    array-length v5, v4

    .line 2324
    new-array v5, v5, [I

    .line 2325
    .line 2326
    array-length v6, v4

    .line 2327
    new-array v6, v6, [I

    .line 2328
    .line 2329
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2330
    .line 2331
    .line 2332
    move-object/from16 v17, v3

    .line 2333
    .line 2334
    move-object/from16 v18, v5

    .line 2335
    .line 2336
    const/4 v3, 0x0

    .line 2337
    const/4 v9, 0x0

    .line 2338
    const/4 v10, 0x0

    .line 2339
    const/4 v11, 0x0

    .line 2340
    :goto_49
    array-length v5, v4

    .line 2341
    if-ge v9, v5, :cond_6b

    .line 2342
    .line 2343
    move-object/from16 v21, v6

    .line 2344
    .line 2345
    aget-wide v5, v17, v9

    .line 2346
    .line 2347
    cmp-long v22, v5, v19

    .line 2348
    .line 2349
    if-eqz v22, :cond_6a

    .line 2350
    .line 2351
    aget-wide v46, v4, v9

    .line 2352
    .line 2353
    move/from16 v22, v9

    .line 2354
    .line 2355
    move/from16 v23, v10

    .line 2356
    .line 2357
    iget-wide v9, v0, Lpv4;->c:J

    .line 2358
    .line 2359
    move-wide/from16 v48, v9

    .line 2360
    .line 2361
    iget-wide v9, v0, Lpv4;->d:J

    .line 2362
    .line 2363
    sget-object v52, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2364
    .line 2365
    move-wide/from16 v50, v9

    .line 2366
    .line 2367
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2368
    .line 2369
    .line 2370
    move-result-wide v9

    .line 2371
    add-long/2addr v9, v5

    .line 2372
    const/4 v7, 0x1

    .line 2373
    invoke-static {v14, v5, v6, v7}, Lf35;->f([JJZ)I

    .line 2374
    .line 2375
    .line 2376
    move-result v5

    .line 2377
    aput v5, v18, v22

    .line 2378
    .line 2379
    invoke-static {v14, v9, v10, v1}, Lf35;->b([JJZ)I

    .line 2380
    .line 2381
    .line 2382
    move-result v5

    .line 2383
    add-int/lit8 v6, v5, -0x1

    .line 2384
    .line 2385
    move/from16 v24, v1

    .line 2386
    .line 2387
    move v7, v6

    .line 2388
    move v6, v5

    .line 2389
    const/4 v5, 0x0

    .line 2390
    :goto_4a
    array-length v1, v14

    .line 2391
    if-ge v6, v1, :cond_65

    .line 2392
    .line 2393
    aget-wide v27, v14, v6

    .line 2394
    .line 2395
    cmp-long v1, v27, v9

    .line 2396
    .line 2397
    if-gez v1, :cond_63

    .line 2398
    .line 2399
    move v7, v6

    .line 2400
    goto :goto_4b

    .line 2401
    :cond_63
    add-int/lit8 v5, v5, 0x1

    .line 2402
    .line 2403
    iget v1, v2, Ltb1;->p:I

    .line 2404
    .line 2405
    if-le v5, v1, :cond_64

    .line 2406
    .line 2407
    goto :goto_4c

    .line 2408
    :cond_64
    :goto_4b
    add-int/lit8 v6, v6, 0x1

    .line 2409
    .line 2410
    goto :goto_4a

    .line 2411
    :cond_65
    :goto_4c
    add-int/lit8 v7, v7, 0x1

    .line 2412
    .line 2413
    aput v7, v21, v22

    .line 2414
    .line 2415
    aget v1, v18, v22

    .line 2416
    .line 2417
    :goto_4d
    aget v5, v18, v22

    .line 2418
    .line 2419
    if-lez v5, :cond_66

    .line 2420
    .line 2421
    aget v6, v15, v5

    .line 2422
    .line 2423
    const/16 v35, 0x1

    .line 2424
    .line 2425
    and-int/lit8 v6, v6, 0x1

    .line 2426
    .line 2427
    if-nez v6, :cond_67

    .line 2428
    .line 2429
    add-int/lit8 v5, v5, -0x1

    .line 2430
    .line 2431
    aput v5, v18, v22

    .line 2432
    .line 2433
    goto :goto_4d

    .line 2434
    :cond_66
    const/16 v35, 0x1

    .line 2435
    .line 2436
    :cond_67
    const/16 v16, 0x0

    .line 2437
    .line 2438
    if-nez v5, :cond_68

    .line 2439
    .line 2440
    aget v5, v15, v16

    .line 2441
    .line 2442
    and-int/lit8 v5, v5, 0x1

    .line 2443
    .line 2444
    if-nez v5, :cond_68

    .line 2445
    .line 2446
    aput v1, v18, v22

    .line 2447
    .line 2448
    :goto_4e
    aget v1, v18, v22

    .line 2449
    .line 2450
    aget v5, v21, v22

    .line 2451
    .line 2452
    if-ge v1, v5, :cond_68

    .line 2453
    .line 2454
    aget v5, v15, v1

    .line 2455
    .line 2456
    and-int/lit8 v5, v5, 0x1

    .line 2457
    .line 2458
    if-nez v5, :cond_68

    .line 2459
    .line 2460
    add-int/lit8 v1, v1, 0x1

    .line 2461
    .line 2462
    aput v1, v18, v22

    .line 2463
    .line 2464
    const/16 v35, 0x1

    .line 2465
    .line 2466
    goto :goto_4e

    .line 2467
    :cond_68
    aget v1, v21, v22

    .line 2468
    .line 2469
    aget v5, v18, v22

    .line 2470
    .line 2471
    sub-int v6, v1, v5

    .line 2472
    .line 2473
    add-int/2addr v6, v11

    .line 2474
    if-eq v3, v5, :cond_69

    .line 2475
    .line 2476
    const/4 v3, 0x1

    .line 2477
    goto :goto_4f

    .line 2478
    :cond_69
    move/from16 v3, v16

    .line 2479
    .line 2480
    :goto_4f
    or-int v3, v23, v3

    .line 2481
    .line 2482
    move v10, v3

    .line 2483
    move v11, v6

    .line 2484
    move v3, v1

    .line 2485
    goto :goto_50

    .line 2486
    :cond_6a
    move/from16 v24, v1

    .line 2487
    .line 2488
    move/from16 v22, v9

    .line 2489
    .line 2490
    move/from16 v23, v10

    .line 2491
    .line 2492
    const/16 v16, 0x0

    .line 2493
    .line 2494
    :goto_50
    add-int/lit8 v9, v22, 0x1

    .line 2495
    .line 2496
    move-object/from16 v7, p1

    .line 2497
    .line 2498
    move-object/from16 v6, v21

    .line 2499
    .line 2500
    move/from16 v1, v24

    .line 2501
    .line 2502
    goto/16 :goto_49

    .line 2503
    .line 2504
    :cond_6b
    move-object/from16 v21, v6

    .line 2505
    .line 2506
    move/from16 v23, v10

    .line 2507
    .line 2508
    const/16 v16, 0x0

    .line 2509
    .line 2510
    if-eq v11, v12, :cond_6c

    .line 2511
    .line 2512
    const/4 v1, 0x1

    .line 2513
    goto :goto_51

    .line 2514
    :cond_6c
    move/from16 v1, v16

    .line 2515
    .line 2516
    :goto_51
    or-int v1, v23, v1

    .line 2517
    .line 2518
    if-eqz v1, :cond_6d

    .line 2519
    .line 2520
    new-array v3, v11, [J

    .line 2521
    .line 2522
    goto :goto_52

    .line 2523
    :cond_6d
    move-object v3, v8

    .line 2524
    :goto_52
    if-eqz v1, :cond_6e

    .line 2525
    .line 2526
    new-array v5, v11, [I

    .line 2527
    .line 2528
    goto :goto_53

    .line 2529
    :cond_6e
    move-object v5, v13

    .line 2530
    :goto_53
    if-eqz v1, :cond_6f

    .line 2531
    .line 2532
    move/from16 v26, v16

    .line 2533
    .line 2534
    :cond_6f
    if-eqz v1, :cond_70

    .line 2535
    .line 2536
    new-array v6, v11, [I

    .line 2537
    .line 2538
    goto :goto_54

    .line 2539
    :cond_70
    move-object v6, v15

    .line 2540
    :goto_54
    if-eqz v1, :cond_71

    .line 2541
    .line 2542
    new-instance v7, Ljava/util/ArrayList;

    .line 2543
    .line 2544
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2545
    .line 2546
    .line 2547
    goto :goto_55

    .line 2548
    :cond_71
    move-object/from16 v7, v36

    .line 2549
    .line 2550
    :goto_55
    new-array v9, v11, [J

    .line 2551
    .line 2552
    move/from16 v20, v1

    .line 2553
    .line 2554
    move/from16 v10, v16

    .line 2555
    .line 2556
    move v11, v10

    .line 2557
    move v12, v11

    .line 2558
    move/from16 v19, v26

    .line 2559
    .line 2560
    const-wide/16 v22, 0x0

    .line 2561
    .line 2562
    :goto_56
    array-length v1, v4

    .line 2563
    if-ge v10, v1, :cond_77

    .line 2564
    .line 2565
    aget-wide v31, v17, v10

    .line 2566
    .line 2567
    aget v1, v18, v10

    .line 2568
    .line 2569
    move-object/from16 v29, v2

    .line 2570
    .line 2571
    aget v2, v21, v10

    .line 2572
    .line 2573
    move-object/from16 v33, v4

    .line 2574
    .line 2575
    if-eqz v20, :cond_72

    .line 2576
    .line 2577
    sub-int v4, v2, v1

    .line 2578
    .line 2579
    invoke-static {v8, v1, v3, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2580
    .line 2581
    .line 2582
    invoke-static {v13, v1, v5, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2583
    .line 2584
    .line 2585
    invoke-static {v15, v1, v6, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2586
    .line 2587
    .line 2588
    :cond_72
    move/from16 v4, v19

    .line 2589
    .line 2590
    :goto_57
    if-ge v1, v2, :cond_76

    .line 2591
    .line 2592
    move/from16 v19, v1

    .line 2593
    .line 2594
    move/from16 v36, v2

    .line 2595
    .line 2596
    iget-wide v1, v0, Lpv4;->d:J

    .line 2597
    .line 2598
    sget-object v28, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2599
    .line 2600
    const-wide/32 v24, 0xf4240

    .line 2601
    .line 2602
    .line 2603
    move-wide/from16 v26, v1

    .line 2604
    .line 2605
    invoke-static/range {v22 .. v28}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2606
    .line 2607
    .line 2608
    move-result-wide v1

    .line 2609
    aget-wide v24, v14, v19

    .line 2610
    .line 2611
    sub-long v46, v24, v31

    .line 2612
    .line 2613
    const-wide/32 v48, 0xf4240

    .line 2614
    .line 2615
    .line 2616
    move-wide/from16 v24, v1

    .line 2617
    .line 2618
    iget-wide v1, v0, Lpv4;->c:J

    .line 2619
    .line 2620
    move-wide/from16 v50, v1

    .line 2621
    .line 2622
    move-object/from16 v52, v28

    .line 2623
    .line 2624
    invoke-static/range {v46 .. v52}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2625
    .line 2626
    .line 2627
    move-result-wide v1

    .line 2628
    const-wide/16 v39, 0x0

    .line 2629
    .line 2630
    cmp-long v26, v1, v39

    .line 2631
    .line 2632
    if-gez v26, :cond_73

    .line 2633
    .line 2634
    const/4 v11, 0x1

    .line 2635
    :cond_73
    add-long v1, v24, v1

    .line 2636
    .line 2637
    aput-wide v1, v9, v12

    .line 2638
    .line 2639
    if-eqz v20, :cond_74

    .line 2640
    .line 2641
    aget v1, v5, v12

    .line 2642
    .line 2643
    if-le v1, v4, :cond_74

    .line 2644
    .line 2645
    aget v4, v13, v19

    .line 2646
    .line 2647
    :cond_74
    if-eqz v20, :cond_75

    .line 2648
    .line 2649
    if-nez v30, :cond_75

    .line 2650
    .line 2651
    aget v1, v6, v12

    .line 2652
    .line 2653
    const/16 v35, 0x1

    .line 2654
    .line 2655
    and-int/lit8 v1, v1, 0x1

    .line 2656
    .line 2657
    if-eqz v1, :cond_75

    .line 2658
    .line 2659
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2660
    .line 2661
    .line 2662
    move-result-object v1

    .line 2663
    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2664
    .line 2665
    .line 2666
    :cond_75
    add-int/lit8 v12, v12, 0x1

    .line 2667
    .line 2668
    add-int/lit8 v1, v19, 0x1

    .line 2669
    .line 2670
    move/from16 v2, v36

    .line 2671
    .line 2672
    goto :goto_57

    .line 2673
    :cond_76
    const-wide/16 v39, 0x0

    .line 2674
    .line 2675
    aget-wide v1, v33, v10

    .line 2676
    .line 2677
    add-long v22, v22, v1

    .line 2678
    .line 2679
    add-int/lit8 v10, v10, 0x1

    .line 2680
    .line 2681
    move/from16 v19, v4

    .line 2682
    .line 2683
    move-object/from16 v2, v29

    .line 2684
    .line 2685
    move-object/from16 v4, v33

    .line 2686
    .line 2687
    goto :goto_56

    .line 2688
    :cond_77
    move-object/from16 v29, v2

    .line 2689
    .line 2690
    iget-wide v1, v0, Lpv4;->d:J

    .line 2691
    .line 2692
    sget-object v28, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2693
    .line 2694
    const-wide/32 v24, 0xf4240

    .line 2695
    .line 2696
    .line 2697
    move-wide/from16 v26, v1

    .line 2698
    .line 2699
    invoke-static/range {v22 .. v28}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 2700
    .line 2701
    .line 2702
    move-result-wide v31

    .line 2703
    if-eqz v11, :cond_78

    .line 2704
    .line 2705
    invoke-virtual/range {v29 .. v29}, Ltb1;->a()Lsb1;

    .line 2706
    .line 2707
    .line 2708
    move-result-object v1

    .line 2709
    const/4 v15, 0x1

    .line 2710
    iput-boolean v15, v1, Lsb1;->s:Z

    .line 2711
    .line 2712
    new-instance v2, Ltb1;

    .line 2713
    .line 2714
    invoke-direct {v2, v1}, Ltb1;-><init>(Lsb1;)V

    .line 2715
    .line 2716
    .line 2717
    invoke-virtual {v0, v2}, Lpv4;->a(Ltb1;)Lpv4;

    .line 2718
    .line 2719
    .line 2720
    move-result-object v0

    .line 2721
    :cond_78
    move-object/from16 v23, v0

    .line 2722
    .line 2723
    new-instance v22, Lxv4;

    .line 2724
    .line 2725
    invoke-static {v7}, Ljz4;->N(Ljava/util/Collection;)[I

    .line 2726
    .line 2727
    .line 2728
    move-result-object v29

    .line 2729
    array-length v0, v3

    .line 2730
    move/from16 v33, v0

    .line 2731
    .line 2732
    move-object/from16 v24, v3

    .line 2733
    .line 2734
    move-object/from16 v25, v5

    .line 2735
    .line 2736
    move-object/from16 v28, v6

    .line 2737
    .line 2738
    move-object/from16 v27, v9

    .line 2739
    .line 2740
    move/from16 v26, v19

    .line 2741
    .line 2742
    invoke-direct/range {v22 .. v33}, Lxv4;-><init>(Lpv4;[J[II[J[I[IZJI)V

    .line 2743
    .line 2744
    .line 2745
    move-object/from16 v0, v22

    .line 2746
    .line 2747
    move-object/from16 v1, v34

    .line 2748
    .line 2749
    :goto_58
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2750
    .line 2751
    .line 2752
    :goto_59
    add-int/lit8 v5, v37, 0x1

    .line 2753
    .line 2754
    move-object/from16 v0, p0

    .line 2755
    .line 2756
    move-object v3, v1

    .line 2757
    move-object/from16 v2, v45

    .line 2758
    .line 2759
    goto/16 :goto_0

    .line 2760
    .line 2761
    :cond_79
    const-string v0, "Track has no sample table size information"

    .line 2762
    .line 2763
    move-object/from16 v1, v36

    .line 2764
    .line 2765
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 2766
    .line 2767
    .line 2768
    move-result-object v0

    .line 2769
    throw v0

    .line 2770
    :cond_7a
    move-object v1, v3

    .line 2771
    return-object v1
.end method

.method public static k(Lpy2;)Lqv2;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lpy2;->p:Lbe3;

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lbe3;->N(I)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lqv2;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    new-array v4, v3, [Lpv2;

    .line 14
    .line 15
    invoke-direct {v2, v4}, Lqv2;-><init>([Lpv2;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1}, Lbe3;->a()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-lt v4, v0, :cond_3e

    .line 23
    .line 24
    iget v4, v1, Lbe3;->b:I

    .line 25
    .line 26
    invoke-virtual {v1}, Lbe3;->m()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {v1}, Lbe3;->m()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const v7, 0x6d657461

    .line 35
    .line 36
    .line 37
    const/4 v11, 0x1

    .line 38
    const/4 v12, 0x0

    .line 39
    if-ne v6, v7, :cond_2f

    .line 40
    .line 41
    invoke-virtual {v1, v4}, Lbe3;->N(I)V

    .line 42
    .line 43
    .line 44
    add-int v6, v4, v5

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lbe3;->O(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lwu;->a(Lbe3;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget v7, v1, Lbe3;->b:I

    .line 53
    .line 54
    if-ge v7, v6, :cond_2b

    .line 55
    .line 56
    invoke-virtual {v1}, Lbe3;->m()I

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    invoke-virtual {v1}, Lbe3;->m()I

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    const v15, 0x696c7374

    .line 65
    .line 66
    .line 67
    if-ne v14, v15, :cond_2d

    .line 68
    .line 69
    invoke-virtual {v1, v7}, Lbe3;->N(I)V

    .line 70
    .line 71
    .line 72
    add-int/2addr v7, v13

    .line 73
    invoke-virtual {v1, v0}, Lbe3;->O(I)V

    .line 74
    .line 75
    .line 76
    new-instance v6, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    :goto_2
    iget v13, v1, Lbe3;->b:I

    .line 82
    .line 83
    if-ge v13, v7, :cond_2a

    .line 84
    .line 85
    const-string v14, "Skipped unknown metadata entry: "

    .line 86
    .line 87
    invoke-virtual {v1}, Lbe3;->m()I

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    add-int/2addr v15, v13

    .line 92
    invoke-virtual {v1}, Lbe3;->m()I

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    shr-int/lit8 v0, v13, 0x18

    .line 97
    .line 98
    and-int/lit16 v0, v0, 0xff

    .line 99
    .line 100
    const/16 v10, 0xa9

    .line 101
    .line 102
    const-string v9, "TCON"

    .line 103
    .line 104
    const-string v8, "MetadataUtil"

    .line 105
    .line 106
    if-eq v0, v10, :cond_0

    .line 107
    .line 108
    const/16 v10, 0xfd

    .line 109
    .line 110
    if-ne v0, v10, :cond_1

    .line 111
    .line 112
    :cond_0
    const/4 v3, -0x1

    .line 113
    goto/16 :goto_8

    .line 114
    .line 115
    :cond_1
    const v0, 0x676e7265

    .line 116
    .line 117
    .line 118
    if-ne v13, v0, :cond_3

    .line 119
    .line 120
    :try_start_0
    invoke-static {v1}, Lgh0;->w(Lbe3;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    sub-int/2addr v0, v11

    .line 125
    invoke-static {v0}, Lpv1;->a(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_2

    .line 130
    .line 131
    new-instance v8, Lds4;

    .line 132
    .line 133
    invoke-static {v0}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-direct {v8, v9, v12, v0}, Lds4;-><init>(Ljava/lang/String;Ljava/lang/String;Lgy3;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_2
    const-string v0, "Failed to parse standard genre code"

    .line 142
    .line 143
    invoke-static {v8, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    move-object v8, v12

    .line 147
    :goto_3
    invoke-virtual {v1, v15}, Lbe3;->N(I)V

    .line 148
    .line 149
    .line 150
    const/4 v3, -0x1

    .line 151
    goto/16 :goto_c

    .line 152
    .line 153
    :cond_3
    const v0, 0x6469736b

    .line 154
    .line 155
    .line 156
    if-ne v13, v0, :cond_4

    .line 157
    .line 158
    :try_start_1
    const-string v0, "TPOS"

    .line 159
    .line 160
    invoke-static {v13, v1, v0}, Lgh0;->v(ILbe3;Ljava/lang/String;)Lds4;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    goto :goto_3

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    goto/16 :goto_d

    .line 167
    .line 168
    :cond_4
    const v0, 0x74726b6e

    .line 169
    .line 170
    .line 171
    if-ne v13, v0, :cond_5

    .line 172
    .line 173
    const-string v0, "TRCK"

    .line 174
    .line 175
    invoke-static {v13, v1, v0}, Lgh0;->v(ILbe3;Ljava/lang/String;)Lds4;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    goto :goto_3

    .line 180
    :cond_5
    const v0, 0x746d706f

    .line 181
    .line 182
    .line 183
    if-ne v13, v0, :cond_6

    .line 184
    .line 185
    const-string v0, "TBPM"

    .line 186
    .line 187
    invoke-static {v13, v0, v1, v11, v3}, Lgh0;->x(ILjava/lang/String;Lbe3;ZZ)Lnv1;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    goto :goto_3

    .line 192
    :cond_6
    const v0, 0x6370696c

    .line 193
    .line 194
    .line 195
    if-ne v13, v0, :cond_7

    .line 196
    .line 197
    const-string v0, "TCMP"

    .line 198
    .line 199
    invoke-static {v13, v0, v1, v11, v11}, Lgh0;->x(ILjava/lang/String;Lbe3;ZZ)Lnv1;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    goto :goto_3

    .line 204
    :cond_7
    const v0, 0x636f7672

    .line 205
    .line 206
    .line 207
    if-ne v13, v0, :cond_8

    .line 208
    .line 209
    invoke-static {v1}, Lgh0;->u(Lbe3;)Lwe;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    goto :goto_3

    .line 214
    :cond_8
    const v0, 0x61415254

    .line 215
    .line 216
    .line 217
    if-ne v13, v0, :cond_9

    .line 218
    .line 219
    const-string v0, "TPE2"

    .line 220
    .line 221
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    goto :goto_3

    .line 226
    :cond_9
    const v0, 0x736f6e6d

    .line 227
    .line 228
    .line 229
    if-ne v13, v0, :cond_a

    .line 230
    .line 231
    const-string v0, "TSOT"

    .line 232
    .line 233
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    goto :goto_3

    .line 238
    :cond_a
    const v0, 0x736f616c

    .line 239
    .line 240
    .line 241
    if-ne v13, v0, :cond_b

    .line 242
    .line 243
    const-string v0, "TSOA"

    .line 244
    .line 245
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    goto :goto_3

    .line 250
    :cond_b
    const v0, 0x736f6172

    .line 251
    .line 252
    .line 253
    if-ne v13, v0, :cond_c

    .line 254
    .line 255
    const-string v0, "TSOP"

    .line 256
    .line 257
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    goto :goto_3

    .line 262
    :cond_c
    const v0, 0x736f6161

    .line 263
    .line 264
    .line 265
    if-ne v13, v0, :cond_d

    .line 266
    .line 267
    const-string v0, "TSO2"

    .line 268
    .line 269
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    goto :goto_3

    .line 274
    :cond_d
    const v0, 0x736f636f

    .line 275
    .line 276
    .line 277
    if-ne v13, v0, :cond_e

    .line 278
    .line 279
    const-string v0, "TSOC"

    .line 280
    .line 281
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    goto/16 :goto_3

    .line 286
    .line 287
    :cond_e
    const v0, 0x72746e67

    .line 288
    .line 289
    .line 290
    if-ne v13, v0, :cond_f

    .line 291
    .line 292
    const-string v0, "ITUNESADVISORY"

    .line 293
    .line 294
    invoke-static {v13, v0, v1, v3, v3}, Lgh0;->x(ILjava/lang/String;Lbe3;ZZ)Lnv1;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    goto/16 :goto_3

    .line 299
    .line 300
    :cond_f
    const v0, 0x70676170

    .line 301
    .line 302
    .line 303
    if-ne v13, v0, :cond_10

    .line 304
    .line 305
    const-string v0, "ITUNESGAPLESS"

    .line 306
    .line 307
    invoke-static {v13, v0, v1, v3, v11}, Lgh0;->x(ILjava/lang/String;Lbe3;ZZ)Lnv1;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    goto/16 :goto_3

    .line 312
    .line 313
    :cond_10
    const v0, 0x736f736e

    .line 314
    .line 315
    .line 316
    if-ne v13, v0, :cond_11

    .line 317
    .line 318
    const-string v0, "TVSHOWSORT"

    .line 319
    .line 320
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    goto/16 :goto_3

    .line 325
    .line 326
    :cond_11
    const v0, 0x74767368

    .line 327
    .line 328
    .line 329
    if-ne v13, v0, :cond_12

    .line 330
    .line 331
    const-string v0, "TVSHOW"

    .line 332
    .line 333
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :cond_12
    const v0, 0x2d2d2d2d

    .line 340
    .line 341
    .line 342
    if-ne v13, v0, :cond_19

    .line 343
    .line 344
    move-object v0, v12

    .line 345
    move-object v8, v0

    .line 346
    const/4 v9, -0x1

    .line 347
    const/4 v10, -0x1

    .line 348
    :goto_4
    iget v13, v1, Lbe3;->b:I

    .line 349
    .line 350
    if-ge v13, v15, :cond_16

    .line 351
    .line 352
    invoke-virtual {v1}, Lbe3;->m()I

    .line 353
    .line 354
    .line 355
    move-result v14

    .line 356
    invoke-virtual {v1}, Lbe3;->m()I

    .line 357
    .line 358
    .line 359
    move-result v12

    .line 360
    const/4 v3, 0x4

    .line 361
    invoke-virtual {v1, v3}, Lbe3;->O(I)V

    .line 362
    .line 363
    .line 364
    const v3, 0x6d65616e

    .line 365
    .line 366
    .line 367
    if-ne v12, v3, :cond_13

    .line 368
    .line 369
    add-int/lit8 v14, v14, -0xc

    .line 370
    .line 371
    invoke-virtual {v1, v14}, Lbe3;->w(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    goto :goto_5

    .line 376
    :cond_13
    const v3, 0x6e616d65

    .line 377
    .line 378
    .line 379
    if-ne v12, v3, :cond_14

    .line 380
    .line 381
    add-int/lit8 v14, v14, -0xc

    .line 382
    .line 383
    invoke-virtual {v1, v14}, Lbe3;->w(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    goto :goto_5

    .line 388
    :cond_14
    const v3, 0x64617461

    .line 389
    .line 390
    .line 391
    if-ne v12, v3, :cond_15

    .line 392
    .line 393
    move v9, v13

    .line 394
    move v10, v14

    .line 395
    :cond_15
    add-int/lit8 v14, v14, -0xc

    .line 396
    .line 397
    invoke-virtual {v1, v14}, Lbe3;->O(I)V

    .line 398
    .line 399
    .line 400
    :goto_5
    const/4 v3, 0x0

    .line 401
    const/4 v12, 0x0

    .line 402
    goto :goto_4

    .line 403
    :cond_16
    if-eqz v0, :cond_18

    .line 404
    .line 405
    if-eqz v8, :cond_18

    .line 406
    .line 407
    const/4 v3, -0x1

    .line 408
    if-ne v9, v3, :cond_17

    .line 409
    .line 410
    goto :goto_6

    .line 411
    :cond_17
    invoke-virtual {v1, v9}, Lbe3;->N(I)V

    .line 412
    .line 413
    .line 414
    const/16 v9, 0x10

    .line 415
    .line 416
    invoke-virtual {v1, v9}, Lbe3;->O(I)V

    .line 417
    .line 418
    .line 419
    add-int/lit8 v10, v10, -0x10

    .line 420
    .line 421
    invoke-virtual {v1, v10}, Lbe3;->w(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v9

    .line 425
    new-instance v10, Ls02;

    .line 426
    .line 427
    invoke-direct {v10, v0, v8, v9}, Ls02;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 428
    .line 429
    .line 430
    move-object v8, v10

    .line 431
    goto :goto_7

    .line 432
    :cond_18
    const/4 v3, -0x1

    .line 433
    :goto_6
    const/4 v8, 0x0

    .line 434
    :goto_7
    invoke-virtual {v1, v15}, Lbe3;->N(I)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_c

    .line 438
    .line 439
    :cond_19
    const/4 v3, -0x1

    .line 440
    goto/16 :goto_9

    .line 441
    .line 442
    :goto_8
    const v0, 0xffffff

    .line 443
    .line 444
    .line 445
    and-int/2addr v0, v13

    .line 446
    const v10, 0x636d74

    .line 447
    .line 448
    .line 449
    if-ne v0, v10, :cond_1b

    .line 450
    .line 451
    :try_start_2
    invoke-virtual {v1}, Lbe3;->m()I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    invoke-virtual {v1}, Lbe3;->m()I

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    const v10, 0x64617461

    .line 460
    .line 461
    .line 462
    if-ne v9, v10, :cond_1a

    .line 463
    .line 464
    const/16 v9, 0x8

    .line 465
    .line 466
    invoke-virtual {v1, v9}, Lbe3;->O(I)V

    .line 467
    .line 468
    .line 469
    const/16 v16, 0x10

    .line 470
    .line 471
    add-int/lit8 v0, v0, -0x10

    .line 472
    .line 473
    invoke-virtual {v1, v0}, Lbe3;->w(I)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    new-instance v8, Ll60;

    .line 478
    .line 479
    const-string v9, "und"

    .line 480
    .line 481
    invoke-direct {v8, v9, v0, v0}, Ll60;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_1a
    invoke-static {v13}, Luv;->c(I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    const-string v9, "Failed to parse comment attribute: "

    .line 490
    .line 491
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-static {v8, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_1b
    const v10, 0x6e616d

    .line 500
    .line 501
    .line 502
    if-eq v0, v10, :cond_28

    .line 503
    .line 504
    const v10, 0x74726b

    .line 505
    .line 506
    .line 507
    if-ne v0, v10, :cond_1c

    .line 508
    .line 509
    goto/16 :goto_b

    .line 510
    .line 511
    :cond_1c
    const v10, 0x636f6d

    .line 512
    .line 513
    .line 514
    if-eq v0, v10, :cond_27

    .line 515
    .line 516
    const v10, 0x777274

    .line 517
    .line 518
    .line 519
    if-ne v0, v10, :cond_1d

    .line 520
    .line 521
    goto/16 :goto_a

    .line 522
    .line 523
    :cond_1d
    const v10, 0x646179

    .line 524
    .line 525
    .line 526
    if-ne v0, v10, :cond_1e

    .line 527
    .line 528
    const-string v0, "TDRC"

    .line 529
    .line 530
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 531
    .line 532
    .line 533
    move-result-object v8

    .line 534
    goto :goto_7

    .line 535
    :cond_1e
    const v10, 0x415254

    .line 536
    .line 537
    .line 538
    if-ne v0, v10, :cond_1f

    .line 539
    .line 540
    const-string v0, "TPE1"

    .line 541
    .line 542
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    goto :goto_7

    .line 547
    :cond_1f
    const v10, 0x746f6f

    .line 548
    .line 549
    .line 550
    if-ne v0, v10, :cond_20

    .line 551
    .line 552
    const-string v0, "TSSE"

    .line 553
    .line 554
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 555
    .line 556
    .line 557
    move-result-object v8

    .line 558
    goto :goto_7

    .line 559
    :cond_20
    const v10, 0x616c62

    .line 560
    .line 561
    .line 562
    if-ne v0, v10, :cond_21

    .line 563
    .line 564
    const-string v0, "TALB"

    .line 565
    .line 566
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    goto/16 :goto_7

    .line 571
    .line 572
    :cond_21
    const v10, 0x6c7972

    .line 573
    .line 574
    .line 575
    if-ne v0, v10, :cond_22

    .line 576
    .line 577
    const-string v0, "USLT"

    .line 578
    .line 579
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    goto/16 :goto_7

    .line 584
    .line 585
    :cond_22
    const v10, 0x67656e

    .line 586
    .line 587
    .line 588
    if-ne v0, v10, :cond_23

    .line 589
    .line 590
    invoke-static {v13, v1, v9}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 591
    .line 592
    .line 593
    move-result-object v8

    .line 594
    goto/16 :goto_7

    .line 595
    .line 596
    :cond_23
    const v9, 0x677270

    .line 597
    .line 598
    .line 599
    if-ne v0, v9, :cond_24

    .line 600
    .line 601
    const-string v0, "TIT1"

    .line 602
    .line 603
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    goto/16 :goto_7

    .line 608
    .line 609
    :cond_24
    const v9, 0x6d766e

    .line 610
    .line 611
    .line 612
    if-ne v0, v9, :cond_25

    .line 613
    .line 614
    const-string v0, "MVNM"

    .line 615
    .line 616
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 617
    .line 618
    .line 619
    move-result-object v8

    .line 620
    goto/16 :goto_7

    .line 621
    .line 622
    :cond_25
    const v9, 0x6d7669

    .line 623
    .line 624
    .line 625
    if-ne v0, v9, :cond_26

    .line 626
    .line 627
    const-string v0, "MVIN"

    .line 628
    .line 629
    const/4 v8, 0x0

    .line 630
    invoke-static {v13, v0, v1, v11, v8}, Lgh0;->x(ILjava/lang/String;Lbe3;ZZ)Lnv1;

    .line 631
    .line 632
    .line 633
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 634
    invoke-virtual {v1, v15}, Lbe3;->N(I)V

    .line 635
    .line 636
    .line 637
    move-object v8, v0

    .line 638
    goto :goto_c

    .line 639
    :cond_26
    :goto_9
    :try_start_3
    invoke-static {v13}, Luv;->c(I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-static {v8, v0}, Ll93;->A(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 648
    .line 649
    .line 650
    invoke-virtual {v1, v15}, Lbe3;->N(I)V

    .line 651
    .line 652
    .line 653
    const/4 v8, 0x0

    .line 654
    goto :goto_c

    .line 655
    :cond_27
    :goto_a
    :try_start_4
    const-string v0, "TCOM"

    .line 656
    .line 657
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 658
    .line 659
    .line 660
    move-result-object v8

    .line 661
    goto/16 :goto_7

    .line 662
    .line 663
    :cond_28
    :goto_b
    const-string v0, "TIT2"

    .line 664
    .line 665
    invoke-static {v13, v1, v0}, Lgh0;->y(ILbe3;Ljava/lang/String;)Lds4;

    .line 666
    .line 667
    .line 668
    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 669
    goto/16 :goto_7

    .line 670
    .line 671
    :goto_c
    if-eqz v8, :cond_29

    .line 672
    .line 673
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    :cond_29
    const/16 v0, 0x8

    .line 677
    .line 678
    const/4 v3, 0x0

    .line 679
    const/4 v12, 0x0

    .line 680
    goto/16 :goto_2

    .line 681
    .line 682
    :goto_d
    invoke-virtual {v1, v15}, Lbe3;->N(I)V

    .line 683
    .line 684
    .line 685
    throw v0

    .line 686
    :cond_2a
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    if-eqz v0, :cond_2c

    .line 691
    .line 692
    :cond_2b
    const/4 v12, 0x0

    .line 693
    goto :goto_e

    .line 694
    :cond_2c
    new-instance v12, Lqv2;

    .line 695
    .line 696
    invoke-direct {v12, v6}, Lqv2;-><init>(Ljava/util/List;)V

    .line 697
    .line 698
    .line 699
    goto :goto_e

    .line 700
    :cond_2d
    const/4 v3, -0x1

    .line 701
    add-int/2addr v7, v13

    .line 702
    invoke-virtual {v1, v7}, Lbe3;->N(I)V

    .line 703
    .line 704
    .line 705
    const/16 v0, 0x8

    .line 706
    .line 707
    const/4 v3, 0x0

    .line 708
    const/4 v12, 0x0

    .line 709
    goto/16 :goto_1

    .line 710
    .line 711
    :goto_e
    invoke-virtual {v2, v12}, Lqv2;->b(Lqv2;)Lqv2;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    move-object v2, v0

    .line 716
    const/16 v13, 0x8

    .line 717
    .line 718
    :cond_2e
    :goto_f
    const/16 v17, 0x0

    .line 719
    .line 720
    goto/16 :goto_1a

    .line 721
    .line 722
    :cond_2f
    const/4 v3, -0x1

    .line 723
    const v0, 0x736d7461

    .line 724
    .line 725
    .line 726
    const/4 v7, 0x2

    .line 727
    if-ne v6, v0, :cond_3d

    .line 728
    .line 729
    invoke-virtual {v1, v4}, Lbe3;->N(I)V

    .line 730
    .line 731
    .line 732
    add-int v0, v4, v5

    .line 733
    .line 734
    const/16 v6, 0xc

    .line 735
    .line 736
    invoke-virtual {v1, v6}, Lbe3;->O(I)V

    .line 737
    .line 738
    .line 739
    :goto_10
    iget v8, v1, Lbe3;->b:I

    .line 740
    .line 741
    if-ge v8, v0, :cond_3c

    .line 742
    .line 743
    invoke-virtual {v1}, Lbe3;->m()I

    .line 744
    .line 745
    .line 746
    move-result v9

    .line 747
    invoke-virtual {v1}, Lbe3;->m()I

    .line 748
    .line 749
    .line 750
    move-result v10

    .line 751
    const v12, 0x73617574

    .line 752
    .line 753
    .line 754
    if-ne v10, v12, :cond_3b

    .line 755
    .line 756
    const/16 v10, 0x10

    .line 757
    .line 758
    if-ge v9, v10, :cond_30

    .line 759
    .line 760
    const/4 v12, 0x0

    .line 761
    const/16 v13, 0x8

    .line 762
    .line 763
    goto/16 :goto_17

    .line 764
    .line 765
    :cond_30
    const/4 v12, 0x4

    .line 766
    invoke-virtual {v1, v12}, Lbe3;->O(I)V

    .line 767
    .line 768
    .line 769
    move v9, v3

    .line 770
    const/4 v3, 0x0

    .line 771
    const/4 v8, 0x0

    .line 772
    :goto_11
    if-ge v3, v7, :cond_33

    .line 773
    .line 774
    invoke-virtual {v1}, Lbe3;->A()I

    .line 775
    .line 776
    .line 777
    move-result v10

    .line 778
    invoke-virtual {v1}, Lbe3;->A()I

    .line 779
    .line 780
    .line 781
    move-result v12

    .line 782
    if-nez v10, :cond_31

    .line 783
    .line 784
    move v9, v12

    .line 785
    goto :goto_12

    .line 786
    :cond_31
    if-ne v10, v11, :cond_32

    .line 787
    .line 788
    move v8, v12

    .line 789
    :cond_32
    :goto_12
    add-int/lit8 v3, v3, 0x1

    .line 790
    .line 791
    goto :goto_11

    .line 792
    :cond_33
    const v3, -0x7fffffff

    .line 793
    .line 794
    .line 795
    if-ne v9, v6, :cond_34

    .line 796
    .line 797
    const/16 v0, 0xf0

    .line 798
    .line 799
    :goto_13
    const/16 v13, 0x8

    .line 800
    .line 801
    goto :goto_15

    .line 802
    :cond_34
    const/16 v7, 0xd

    .line 803
    .line 804
    if-ne v9, v7, :cond_35

    .line 805
    .line 806
    const/16 v0, 0x78

    .line 807
    .line 808
    goto :goto_13

    .line 809
    :cond_35
    const/16 v7, 0x15

    .line 810
    .line 811
    if-eq v9, v7, :cond_36

    .line 812
    .line 813
    move v0, v3

    .line 814
    goto :goto_13

    .line 815
    :cond_36
    invoke-virtual {v1}, Lbe3;->a()I

    .line 816
    .line 817
    .line 818
    move-result v7

    .line 819
    const/16 v13, 0x8

    .line 820
    .line 821
    if-lt v7, v13, :cond_39

    .line 822
    .line 823
    iget v7, v1, Lbe3;->b:I

    .line 824
    .line 825
    add-int/2addr v7, v13

    .line 826
    if-le v7, v0, :cond_37

    .line 827
    .line 828
    goto :goto_14

    .line 829
    :cond_37
    invoke-virtual {v1}, Lbe3;->m()I

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    invoke-virtual {v1}, Lbe3;->m()I

    .line 834
    .line 835
    .line 836
    move-result v7

    .line 837
    if-lt v0, v6, :cond_39

    .line 838
    .line 839
    const v0, 0x73726672

    .line 840
    .line 841
    .line 842
    if-eq v7, v0, :cond_38

    .line 843
    .line 844
    goto :goto_14

    .line 845
    :cond_38
    invoke-virtual {v1}, Lbe3;->B()I

    .line 846
    .line 847
    .line 848
    move-result v0

    .line 849
    goto :goto_15

    .line 850
    :cond_39
    :goto_14
    move v0, v3

    .line 851
    :goto_15
    if-ne v0, v3, :cond_3a

    .line 852
    .line 853
    :goto_16
    const/4 v12, 0x0

    .line 854
    goto :goto_17

    .line 855
    :cond_3a
    new-instance v12, Lqv2;

    .line 856
    .line 857
    new-instance v3, Lpg4;

    .line 858
    .line 859
    int-to-float v0, v0

    .line 860
    invoke-direct {v3, v8, v0}, Lpg4;-><init>(IF)V

    .line 861
    .line 862
    .line 863
    new-array v0, v11, [Lpv2;

    .line 864
    .line 865
    const/16 v17, 0x0

    .line 866
    .line 867
    aput-object v3, v0, v17

    .line 868
    .line 869
    invoke-direct {v12, v0}, Lqv2;-><init>([Lpv2;)V

    .line 870
    .line 871
    .line 872
    goto :goto_17

    .line 873
    :cond_3b
    const/16 v10, 0x10

    .line 874
    .line 875
    const/4 v12, 0x4

    .line 876
    const/16 v13, 0x8

    .line 877
    .line 878
    add-int/2addr v8, v9

    .line 879
    invoke-virtual {v1, v8}, Lbe3;->N(I)V

    .line 880
    .line 881
    .line 882
    goto/16 :goto_10

    .line 883
    .line 884
    :cond_3c
    const/16 v13, 0x8

    .line 885
    .line 886
    goto :goto_16

    .line 887
    :goto_17
    invoke-virtual {v2, v12}, Lqv2;->b(Lqv2;)Lqv2;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    move-object v2, v0

    .line 892
    goto/16 :goto_f

    .line 893
    .line 894
    :cond_3d
    const/16 v13, 0x8

    .line 895
    .line 896
    const v0, -0x56878686

    .line 897
    .line 898
    .line 899
    if-ne v6, v0, :cond_2e

    .line 900
    .line 901
    invoke-virtual {v1}, Lbe3;->x()S

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    invoke-virtual {v1, v7}, Lbe3;->O(I)V

    .line 906
    .line 907
    .line 908
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 909
    .line 910
    invoke-virtual {v1, v0, v3}, Lbe3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    const/16 v3, 0x2b

    .line 915
    .line 916
    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 917
    .line 918
    .line 919
    move-result v3

    .line 920
    const/16 v6, 0x2d

    .line 921
    .line 922
    invoke-virtual {v0, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 923
    .line 924
    .line 925
    move-result v6

    .line 926
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 927
    .line 928
    .line 929
    move-result v3

    .line 930
    const/4 v8, 0x0

    .line 931
    :try_start_5
    invoke-virtual {v0, v8, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v6
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1

    .line 935
    :try_start_6
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 936
    .line 937
    .line 938
    move-result v6

    .line 939
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 940
    .line 941
    .line 942
    move-result v7

    .line 943
    sub-int/2addr v7, v11

    .line 944
    invoke-virtual {v0, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 949
    .line 950
    .line 951
    move-result v0

    .line 952
    new-instance v3, Lqv2;

    .line 953
    .line 954
    new-instance v7, Lty2;

    .line 955
    .line 956
    invoke-direct {v7, v6, v0}, Lty2;-><init>(FF)V

    .line 957
    .line 958
    .line 959
    new-array v0, v11, [Lpv2;
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_0

    .line 960
    .line 961
    const/16 v17, 0x0

    .line 962
    .line 963
    :try_start_7
    aput-object v7, v0, v17

    .line 964
    .line 965
    invoke-direct {v3, v0}, Lqv2;-><init>([Lpv2;)V
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_2

    .line 966
    .line 967
    .line 968
    move-object v12, v3

    .line 969
    goto :goto_19

    .line 970
    :catch_0
    const/16 v17, 0x0

    .line 971
    .line 972
    goto :goto_18

    .line 973
    :catch_1
    move/from16 v17, v8

    .line 974
    .line 975
    :catch_2
    :goto_18
    const/4 v12, 0x0

    .line 976
    :goto_19
    invoke-virtual {v2, v12}, Lqv2;->b(Lqv2;)Lqv2;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    move-object v2, v0

    .line 981
    :goto_1a
    add-int/2addr v4, v5

    .line 982
    invoke-virtual {v1, v4}, Lbe3;->N(I)V

    .line 983
    .line 984
    .line 985
    move v0, v13

    .line 986
    move/from16 v3, v17

    .line 987
    .line 988
    goto/16 :goto_0

    .line 989
    .line 990
    :cond_3e
    return-object v2
.end method
