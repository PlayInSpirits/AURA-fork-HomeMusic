.class public final Lcom/eddyizm/tempus/subsonic/models/MediaType;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8

.field private static AUDIOBOOK:Ljava/lang/String; = "audiobook"

.field public static final Companion:Lgu2;

.field private static MUSIC:Ljava/lang/String; = "music"

.field private static PODCAST:Ljava/lang/String; = "podcast"

.field private static VIDEO:Ljava/lang/String; = "video"


# instance fields
.field private value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lgu2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->Companion:Lgu2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getAUDIOBOOK$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->AUDIOBOOK:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getMUSIC$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->MUSIC:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getPODCAST$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->PODCAST:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getVIDEO$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->VIDEO:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setAUDIOBOOK$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->AUDIOBOOK:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setMUSIC$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->MUSIC:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setPODCAST$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->PODCAST:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setVIDEO$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->VIDEO:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/MediaType;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
