.class public final Ldefpackage/h;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    sparse-switch p1, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p1, "androidx.credentials.TYPE_ABORT_ERROR"

    .line 5
    .line 6
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    const-string p1, "androidx.credentials.TYPE_UNKNOWN_ERROR"

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_1
    const-string p1, "androidx.credentials.TYPE_TIMEOUT_ERROR"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_2
    const-string p1, "androidx.credentials.TYPE_SECURITY_ERROR"

    .line 23
    .line 24
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :sswitch_3
    const-string p1, "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"

    .line 29
    .line 30
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :sswitch_4
    const-string p1, "androidx.credentials.TYPE_NOT_READABLE_ERROR"

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :sswitch_5
    const-string p1, "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :sswitch_6
    const-string p1, "androidx.credentials.TYPE_NETWORK_ERROR"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :sswitch_7
    const-string p1, "androidx.credentials.TYPE_INVALID_STATE_ERROR"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :sswitch_8
    const-string p1, "androidx.credentials.TYPE_ENCODING_ERROR"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :sswitch_9
    const-string p1, "androidx.credentials.TYPE_DATA_ERROR"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :sswitch_a
    const-string p1, "androidx.credentials.TYPE_CONSTRAINT_ERROR"

    .line 71
    .line 72
    invoke-direct {p0, p1}, Ldefpackage/h;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_a
        0x3 -> :sswitch_9
        0x4 -> :sswitch_8
        0xa -> :sswitch_7
        0xc -> :sswitch_6
        0xe -> :sswitch_5
        0x10 -> :sswitch_4
        0x11 -> :sswitch_3
        0x16 -> :sswitch_2
        0x18 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Ldefpackage/h;->a:Ljava/lang/String;

    return-void
.end method
