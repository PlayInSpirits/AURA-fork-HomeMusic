.class public abstract Ln85;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lkd3;

    .line 8
    .line 9
    sget-object v2, Lp35;->b:Lhd5;

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lkd3;

    .line 15
    .line 16
    sget-object v3, Lp35;->h:Lhd5;

    .line 17
    .line 18
    invoke-direct {v2, v3, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lkd3;

    .line 22
    .line 23
    sget-object v4, Lp35;->g:Lhd5;

    .line 24
    .line 25
    invoke-direct {v3, v4, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const v4, 0x3c23d70a    # 0.01f

    .line 29
    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v5, v4

    .line 36
    new-instance v4, Lkd3;

    .line 37
    .line 38
    sget-object v6, Lp35;->a:Lhd5;

    .line 39
    .line 40
    invoke-direct {v4, v6, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Lkd3;

    .line 44
    .line 45
    sget-object v6, Lp35;->i:Lhd5;

    .line 46
    .line 47
    invoke-direct {v5, v6, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Lkd3;

    .line 51
    .line 52
    sget-object v7, Lp35;->e:Lhd5;

    .line 53
    .line 54
    invoke-direct {v6, v7, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v7, Lkd3;

    .line 58
    .line 59
    sget-object v8, Lp35;->f:Lhd5;

    .line 60
    .line 61
    invoke-direct {v7, v8, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const v0, 0x3ecccccd    # 0.4f

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v8, Lkd3;

    .line 72
    .line 73
    sget-object v9, Lp35;->c:Lhd5;

    .line 74
    .line 75
    invoke-direct {v8, v9, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v9, Lkd3;

    .line 79
    .line 80
    sget-object v10, Lp35;->d:Lhd5;

    .line 81
    .line 82
    invoke-direct {v9, v10, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    filled-new-array/range {v1 .. v9}, [Lkd3;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    return-void
.end method
