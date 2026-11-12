.class public final Lxq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Lxq0;

.field public static final c:Lxq0;

.field public static final d:Lxq0;

.field public static final e:Lxq0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxq0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxq0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxq0;->b:Lxq0;

    .line 8
    .line 9
    new-instance v0, Lxq0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lxq0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lxq0;->c:Lxq0;

    .line 16
    .line 17
    new-instance v0, Lxq0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lxq0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lxq0;->d:Lxq0;

    .line 24
    .line 25
    new-instance v0, Lxq0;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lxq0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lxq0;->e:Lxq0;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxq0;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lxq0;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x2

    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    return p0

    .line 13
    :pswitch_0
    const/4 p0, 0x3

    .line 14
    if-eq p1, p0, :cond_1

    .line 15
    .line 16
    const/4 p0, 0x5

    .line 17
    if-eq p1, p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    :goto_1
    return p0

    .line 23
    :pswitch_1
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :pswitch_2
    const/4 p0, 0x2

    .line 26
    if-ne p1, p0, :cond_2

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    :goto_2
    return p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
