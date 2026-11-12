.class public final Lu25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Luw2;


# static fields
.field public static final b:Ljava/util/Set;


# instance fields
.field public final a:Lt25;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v1, "content"

    .line 4
    .line 5
    const-string v2, "android.resource"

    .line 6
    .line 7
    const-string v3, "file"

    .line 8
    .line 9
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lu25;->b:Ljava/util/Set;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lt25;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu25;->a:Lt25;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    sget-object p0, Lu25;->b:Ljava/util/Set;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b(Ljava/lang/Object;IILdb3;)Ltw2;
    .locals 1

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    new-instance p2, Ltw2;

    .line 4
    .line 5
    new-instance p3, Ls73;

    .line 6
    .line 7
    invoke-direct {p3, p1}, Ls73;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lu25;->a:Lt25;

    .line 11
    .line 12
    iget p4, p0, Lt25;->a:I

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    packed-switch p4, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance p4, Lgm4;

    .line 19
    .line 20
    iget-object p0, p0, Lt25;->b:Landroid/content/ContentResolver;

    .line 21
    .line 22
    invoke-direct {p4, v0, p1, p0}, Ljk;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_0
    new-instance p4, Lfk;

    .line 27
    .line 28
    iget-object p0, p0, Lt25;->b:Landroid/content/ContentResolver;

    .line 29
    .line 30
    invoke-direct {p4, p0, p1, v0}, Lfk;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    new-instance p4, Lfk;

    .line 35
    .line 36
    iget-object p0, p0, Lt25;->b:Landroid/content/ContentResolver;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p4, p0, p1, v0}, Lfk;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-direct {p2, p3, p4}, Ltw2;-><init>(Lf42;Lsh0;)V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
