.class public final Lox1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lth4;


# static fields
.field public static final p:Lox1;

.field public static final q:Lox1;


# instance fields
.field public final synthetic n:I

.field public final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lox1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, Lox1;-><init>(IZ)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lox1;->p:Lox1;

    .line 9
    .line 10
    new-instance v0, Lox1;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v2, v1}, Lox1;-><init>(IZ)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lox1;->q:Lox1;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 91
    iput p1, p0, Lox1;->n:I

    iput-boolean p2, p0, Lox1;->o:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkb4;Lf83;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lox1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget v1, p2, Lf83;->a:I

    .line 8
    .line 9
    iget-object p2, p2, Lf83;->b:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x3

    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    if-ne v1, v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    move v1, v0

    .line 22
    :goto_1
    invoke-static {v1}, Lrr2;->l(Z)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    new-array v2, v1, [B

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    new-instance p2, Lh00;

    .line 44
    .line 45
    invoke-direct {p2, v1, v2}, Lh00;-><init>(I[B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lh00;->h()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    iput-boolean v3, p0, Lox1;->o:Z

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 p1, 0x2

    .line 61
    invoke-virtual {p2, p1}, Lh00;->i(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {p2}, Lh00;->h()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    iput-boolean v0, p0, Lox1;->o:Z

    .line 72
    .line 73
    :goto_2
    return-void

    .line 74
    :cond_3
    if-eq p1, v4, :cond_5

    .line 75
    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-virtual {p2}, Lh00;->h()Z

    .line 80
    .line 81
    .line 82
    :cond_5
    :goto_3
    invoke-virtual {p2}, Lh00;->s()V

    .line 83
    .line 84
    .line 85
    new-instance p0, Le83;

    .line 86
    .line 87
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 88
    .line 89
    .line 90
    throw p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lox1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "IncorrectFragmentation{expected="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-boolean p0, p0, Lox1;->o:Z

    .line 19
    .line 20
    xor-int/lit8 p0, p0, 0x1

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "}"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
