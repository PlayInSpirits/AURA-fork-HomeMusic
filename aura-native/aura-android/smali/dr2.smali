.class public final Ldr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final e:Lwa4;

.field public static final f:Lmi3;


# instance fields
.field public final a:Lwa4;

.field public final b:Lmi3;

.field public final c:Lyw1;

.field public final d:Lyw1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lva4;->d:Lgy3;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    iget v4, v1, Lgy3;->q:I

    .line 11
    .line 12
    if-ge v3, v4, :cond_0

    .line 13
    .line 14
    new-instance v4, Lva4;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lgy3;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-direct {v4, v5}, Lva4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v3, Lwa4;

    .line 36
    .line 37
    invoke-direct {v3, v0}, Lwa4;-><init>(Ljava/util/HashSet;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Ljava/util/HashSet;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object v3, Lva4;->e:Lgy3;

    .line 46
    .line 47
    move v4, v2

    .line 48
    :goto_1
    iget v5, v3, Lgy3;->q:I

    .line 49
    .line 50
    if-ge v4, v5, :cond_1

    .line 51
    .line 52
    new-instance v5, Lva4;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Lgy3;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-direct {v5, v6}, Lva4;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v3, v2

    .line 74
    :goto_2
    iget v4, v1, Lgy3;->q:I

    .line 75
    .line 76
    if-ge v3, v4, :cond_2

    .line 77
    .line 78
    new-instance v4, Lva4;

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Lgy3;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-direct {v4, v5}, Lva4;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    new-instance v1, Lwa4;

    .line 100
    .line 101
    invoke-direct {v1, v0}, Lwa4;-><init>(Ljava/util/HashSet;)V

    .line 102
    .line 103
    .line 104
    sput-object v1, Ldr2;->e:Lwa4;

    .line 105
    .line 106
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 107
    .line 108
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 109
    .line 110
    .line 111
    sget-object v1, Lzg5;->p:[I

    .line 112
    .line 113
    array-length v3, v1

    .line 114
    move v4, v2

    .line 115
    :goto_3
    const/4 v5, 0x1

    .line 116
    if-ge v4, v3, :cond_3

    .line 117
    .line 118
    aget v6, v1, v4

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    xor-int/2addr v7, v5

    .line 122
    invoke-static {v7}, Lrr2;->w(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v6, v5}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    new-instance v1, Lmi3;

    .line 132
    .line 133
    xor-int/2addr v2, v5

    .line 134
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 135
    .line 136
    .line 137
    new-instance v2, Lw71;

    .line 138
    .line 139
    invoke-direct {v2, v0}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {v1, v2}, Lmi3;-><init>(Lw71;)V

    .line 143
    .line 144
    .line 145
    sput-object v1, Ldr2;->f:Lmi3;

    .line 146
    .line 147
    return-void
.end method

.method public constructor <init>(Lwa4;Lmi3;Lyw1;Lyw1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldr2;->a:Lwa4;

    .line 5
    .line 6
    iput-object p2, p0, Ldr2;->b:Lmi3;

    .line 7
    .line 8
    iput-object p3, p0, Ldr2;->c:Lyw1;

    .line 9
    .line 10
    iput-object p4, p0, Ldr2;->d:Lyw1;

    .line 11
    .line 12
    return-void
.end method
