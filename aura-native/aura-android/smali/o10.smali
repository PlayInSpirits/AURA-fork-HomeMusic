.class public final Lo10;
.super Lq10;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final p:Lo10;

.field public static final q:Lo10;

.field public static final r:Lo10;

.field public static final s:Lo10;


# instance fields
.field public final n:Ljava/lang/String;

.field public final synthetic o:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lo10;

    .line 2
    .line 3
    const-string v1, "CharMatcher.any()"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1}, Lo10;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lo10;->p:Lo10;

    .line 10
    .line 11
    new-instance v0, Lo10;

    .line 12
    .line 13
    const-string v1, "CharMatcher.ascii()"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v2, v1}, Lo10;-><init>(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lo10;->q:Lo10;

    .line 20
    .line 21
    new-instance v0, Lo10;

    .line 22
    .line 23
    const-string v1, "CharMatcher.javaIsoControl()"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v2, v1}, Lo10;-><init>(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lo10;->r:Lo10;

    .line 30
    .line 31
    new-instance v0, Lo10;

    .line 32
    .line 33
    const-string v1, "CharMatcher.none()"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v2, v1}, Lo10;-><init>(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lo10;->s:Lo10;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lo10;->o:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lo10;->n:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(C)Z
    .locals 0

    .line 1
    iget p0, p0, Lo10;->o:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :pswitch_0
    const/16 p0, 0x1f

    .line 9
    .line 10
    if-le p1, p0, :cond_1

    .line 11
    .line 12
    const/16 p0, 0x7f

    .line 13
    .line 14
    if-lt p1, p0, :cond_0

    .line 15
    .line 16
    const/16 p0, 0x9f

    .line 17
    .line 18
    if-gt p1, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 24
    :goto_1
    return p0

    .line 25
    :pswitch_1
    const/16 p0, 0x7f

    .line 26
    .line 27
    if-gt p1, p0, :cond_2

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const/4 p0, 0x0

    .line 32
    :goto_2
    return p0

    .line 33
    :pswitch_2
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d()Lu10;
    .locals 1

    .line 1
    iget v0, p0, Lo10;->o:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lq10;->d()Lu10;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    sget-object p0, Lo10;->p:Lo10;

    .line 12
    .line 13
    return-object p0

    .line 14
    :sswitch_1
    sget-object p0, Lo10;->s:Lo10;

    .line 15
    .line 16
    return-object p0

    .line 17
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lo10;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
