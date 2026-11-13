.class public abstract Ldefpackage/m42;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:[B

.field public static volatile b:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Ldefpackage/m42;->a:[B

    .line 8
    .line 9
    new-instance v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, ".lzma"

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-string v2, "-lzma"

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/high16 v3, -0x80000000

    .line 43
    .line 44
    const v4, 0x7fffffff

    .line 45
    .line 46
    .line 47
    move v5, v4

    .line 48
    move v6, v5

    .line 49
    move v4, v3

    .line 50
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_5

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    check-cast v8, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-le v8, v3, :cond_1

    .line 73
    .line 74
    move v3, v8

    .line 75
    :cond_1
    if-ge v8, v5, :cond_2

    .line 76
    .line 77
    move v5, v8

    .line 78
    :cond_2
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    check-cast v8, Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-lez v9, :cond_0

    .line 89
    .line 90
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-nez v10, :cond_3

    .line 95
    .line 96
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_3
    if-le v9, v4, :cond_4

    .line 104
    .line 105
    move v4, v9

    .line 106
    :cond_4
    if-ge v9, v6, :cond_0

    .line 107
    .line 108
    move v6, v9

    .line 109
    goto :goto_0

    .line 110
    :cond_5
    const/4 v1, 0x1

    .line 111
    sput v1, Ldefpackage/m42;->b:I

    .line 112
    .line 113
    :try_start_0
    const-string v2, "org.osgi.framework.BundleEvent"

    .line 114
    .line 115
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :catch_0
    sget v2, Ldefpackage/m42;->b:I

    .line 120
    .line 121
    if-ne v2, v1, :cond_6

    .line 122
    .line 123
    :try_start_1
    sget v0, Ldefpackage/l42;->p:I
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1

    .line 124
    .line 125
    const/4 v0, 0x2

    .line 126
    :catch_1
    sput v0, Ldefpackage/m42;->b:I

    .line 127
    .line 128
    :cond_6
    return-void

    .line 129
    :array_0
    .array-data 1
        0x5dt
        0x0t
        0x0t
    .end array-data
.end method
